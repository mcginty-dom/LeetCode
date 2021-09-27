package com.company;

public class Sudoku {
    private char[][] board;

    public Sudoku() {
        this.board = createRandomBoard();
    }

    public Sudoku(char[][] board) {
        this.board = board;
    }

    private char[][] createRandomBoard() {
        //Start with a complete, valid board (filled with 81 numbers).

        //Make a list of all 81 cell positions and shuffle it randomly.

        //As long as the list is not empty, take the next position from the list
        // and remove the number from the related cell.

        //Test uniqueness using a fast backtracking solver. My solver is - in theory - able to count all solutions,
        // but for testing uniqueness, it will stop immediately when it finds more than one solution.

        //If the current board has still just one solution, goto step 3) and repeat.

        //If the current board has more than one solution, undo the last removal (step 3),
        // and continue step 3 with the next position from the list

        //Stop when you have tested all 81 positions.

        return new char[9][9];
    }

    public boolean isValidSudoku(char[][] board) {
        //Every square has to contain a single number

        //Only the numbers from 1 through to 9 can be used

        //Each 3×3 box can only contain each number from 1 to 9 once

        //Each vertical column can only contain each number from 1 to 9 once

        //Each horizontal row can only contain each number from 1 to 9 once

        return false;
    }

    public void solveSudoku(char[][] board) {
        //Iterate through the board until there are no longer any 'locked in' numbers

        //Guess and restart if invalid (make use of isValidSudoku)

    }

    public static void main(String[] args) {

    }

}
