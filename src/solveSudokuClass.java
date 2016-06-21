import java.util.ArrayList;

public class solveSudokuClass {
	
	isValidEntryClass isValidEntryClass = new isValidEntryClass();
	
	
	final int EMPTY = 0;
	
	public boolean solveSudoku(ArrayList<ArrayList<Integer>> partialMatrix) {
		return solvePartialSudoku(0, 0, partialMatrix);
	}
	
	public boolean solvePartialSudoku(int i, int j, ArrayList<ArrayList<Integer>> partialMatrix) {
		
		//check if all rows are complete and if all columns are complete
		if (i == partialMatrix.size()) {
			i = 0;		//reset it to 0 to start row iteration again
			if (++j == partialMatrix.get(i).size()) {
				return true;
			}
		}
		
		//check it partialMatrix's element is not empty, then move to the next element
		if (partialMatrix.get(i).get(j) != EMPTY) {
			return solvePartialSudoku(i+1, j, partialMatrix);
		}
		
		//check if value is valid or not, if valid then insert it 
		for (int VALUE = 1; VALUE <= partialMatrix.size(); VALUE++) {
			if (isValidEntryClass.isValidEntry(partialMatrix, i, j, VALUE)) {
				partialMatrix.get(i).set(j, VALUE);
				
				if (solvePartialSudoku(i+1, j, partialMatrix)) {
					return true;
				}
			}
		}
		
		partialMatrix.get(i).set(j, EMPTY);
		return false;
	}
}
