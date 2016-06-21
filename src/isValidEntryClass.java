import java.util.*;

/*
 * Method will check if the VALUE that is being added to the 2D array satisfies the following conditions:
 * 		1. Row condition: VALUE doesn't match with any other values in that particular row
 * 		2. Column condition: VALUE doesn't match with any other values in that particular column
 * 		3. 3X3 condition: VALUE doesn't match with any other values in that particular 3X3 matrix
 * 
 * Method isValidEntry will take in parameters of partial sudoku, row index, column index, and VALUE
 */
public class isValidEntryClass {
	
	public boolean isValidEntry(ArrayList<ArrayList<Integer>> partialSudoku, int rowIndex, int columnIndex, int VALUE) {
		
		//---------------------------------------------------------------------------
		//row condition
		for (ArrayList<Integer> iteration: partialSudoku) {
			if (VALUE == iteration.get(columnIndex)) {
				return false;
			}
		}
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//column condition
		for (int i = 0; i < partialSudoku.get(rowIndex).size(); i++) {
			if (VALUE == partialSudoku.get(rowIndex).get(i)) {
				return false;
			}
		}
		//---------------------------------------------------------------------------
		
		//---------------------------------------------------------------------------
		//for 3X3 condition
		int regionSize = (int) Math.sqrt(partialSudoku.size());		//regionSize is 3 for a 9X9 matrix
		
		//defining 3X3 regions with the following indices
		int regionSizeRowIndex = rowIndex/regionSize;
		int regionSizeColumnIndex = columnIndex/regionSize;
		
		
		//going to iterate through all the elements in THAT PARTICULAR 3X3 matrix
		for (int i = 0; i < regionSize; i++) {
			for (int j = 0; j < regionSize; j++) {
				if (VALUE == partialSudoku.get(regionSize*regionSizeRowIndex + i).get(regionSize*regionSizeColumnIndex + j)) {
					return false;
				}
			}
		}
		//---------------------------------------------------------------------------
		
		return true;
	}

}
