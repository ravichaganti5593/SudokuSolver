import java.util.*;

public class MainMethod {
	public static void main (String[] args) {
		
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		ArrayList<Integer> row3 = new ArrayList<Integer>();
		ArrayList<Integer> row4 = new ArrayList<Integer>();
		ArrayList<Integer> row5 = new ArrayList<Integer>();
		ArrayList<Integer> row6 = new ArrayList<Integer>();
		ArrayList<Integer> row7 = new ArrayList<Integer>();
		ArrayList<Integer> row8 = new ArrayList<Integer>();
		ArrayList<Integer> row9 = new ArrayList<Integer>();
		
		row1.add(5);
		row1.add(3);
		row1.add(0);
		row1.add(0);
		row1.add(7);
		row1.add(0);
		row1.add(0);
		row1.add(0);
		row1.add(0);
		
		row2.add(6);
		row2.add(0);
		row2.add(0);
		row2.add(1);
		row2.add(9);
		row2.add(5);
		row2.add(0);
		row2.add(0);
		row2.add(0);
		
		row3.add(0);
		row3.add(9);
		row3.add(8);
		row3.add(0);
		row3.add(0);
		row3.add(0);
		row3.add(0);
		row3.add(6);
		row3.add(0);
		
		row4.add(8);
		row4.add(0);
		row4.add(0);
		row4.add(0);
		row4.add(6);
		row4.add(0);
		row4.add(0);
		row4.add(0);
		row4.add(3);
		
		row5.add(4);
		row5.add(0);
		row5.add(0);
		row5.add(8);
		row5.add(0);
		row5.add(3);
		row5.add(0);
		row5.add(0);
		row5.add(1);
		
		row6.add(7);
		row6.add(0);
		row6.add(0);
		row6.add(0);
		row6.add(2);
		row6.add(0);
		row6.add(0);
		row6.add(0);
		row6.add(6);
		
		row7.add(0);
		row7.add(6);
		row7.add(0);
		row7.add(0);
		row7.add(0);
		row7.add(0);
		row7.add(2);
		row7.add(8);
		row7.add(0);
		
		row8.add(0);
		row8.add(0);
		row8.add(0);
		row8.add(4);
		row8.add(1);
		row8.add(9);
		row8.add(0);
		row8.add(0);
		row8.add(5);
		
		row9.add(0);
		row9.add(0);
		row9.add(0);
		row9.add(0);
		row9.add(8);
		row9.add(0);
		row9.add(0);
		row9.add(7);
		row9.add(9);	
		
		ArrayList<ArrayList<Integer>> partialMatrix = new ArrayList<ArrayList<Integer>>();
		
		partialMatrix.add(row1);
		partialMatrix.add(row2);
		partialMatrix.add(row3);
		partialMatrix.add(row4);
		partialMatrix.add(row5);
		partialMatrix.add(row6);
		partialMatrix.add(row7);
		partialMatrix.add(row8);
		partialMatrix.add(row9);	
		
		System.out.println("Partial sudoku: ");
		System.out.println("-------------------------------------");
		for (int i = 0; i < partialMatrix.size(); i++) {
			System.out.println(partialMatrix.get(i));
		}
		System.out.println("-------------------------------------");
		
		
		solveSudokuClass solveSudokuClass = new solveSudokuClass();
		solveSudokuClass.solveSudoku(partialMatrix);
	
		System.out.println("Complete sudoku: ");
		System.out.println("-------------------------------------");
		for (int i = 0; i < partialMatrix.size(); i++) {
			System.out.println(partialMatrix.get(i));
		}
		System.out.println("-------------------------------------");
		
	}
}
