# Sudoku Solver
Implemented a sudoku solver in Java which will correctly add values into a partial 2D sudoku. There are three parts:

1. isValidEntryClass: This class invokes method isValidEntry which will check if the value that is being added
   to the partial sudoku is valid by comparing it with other values in that particular row, column and sub-matrix
   
2. solveSudokuClass: This class invoked method solveSudoku, which calls method solvePartialSudoku (recursive method).
   This class will add values in the partial 2D sudoku by checking conditions given in isValidEntryClass. 

3. MainMethod: This class will define the partial 2D sudoku using arraylist and return the complete solution. 

## Partial Sudoku
![Partial Sudoku](https://github.com/ravichaganti5593/SudokuSolver/blob/master/IncompleteSudoku.png?raw=true "Optional Title")

## Complete Sudoku
![Complete Sudoku](https://github.com/ravichaganti5593/SudokuSolver/blob/master/CompleteSudoku.png?raw=true "Optional Title")

##Rules of Sudoku
The classic Sudoku game involves a grid of 81 squares. The grid is divided into nine blocks, each containing nine squares.

The rules of the game are simple: each of the nine blocks has to contain all the numbers 1-9 within its squares. Each number can only appear once in a row, column or box.

The difficulty lies in that each vertical nine-square column, or horizontal nine-square line across, within the larger square, must also contain the numbers 1-9, without repetition or omission.

Every puzzle has just one correct solution.

From: http://www.counton.org/sudoku/rules-of-sudoku.php


