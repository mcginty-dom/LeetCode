package com.company;

import java.io.File;

//'.' character indicates an empty cell
public class Sudoku {
    private char[][] board;
    private static final int length = 8; //0..8
    private static final char[] validValues = {'.','1','2','3','4','5','6','7','8','9'};

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

    public char[][] getBoard() {
        return this.board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int y=0; y<=length; y++) {
            for (int x=0; x<=length; x++) {
                result.append("|").append(board[x][y]);
            }
            result.append("|\n");
        }
        return result.toString();
    }

    private boolean fileExists(String path) {
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            return true;
        } else {
            return false;
        }
    }

    public void loadBoard(String path) {
        if (fileExists(path)) {
            //TODO:
        } else {
            System.out.println(path+" does not exist.");
        }
    }

    public void saveBoard(String path) {
        saveBoard(path,false);
    }

    public void saveBoard(String path, boolean overwrite) {
        if ((!fileExists(path)) || (fileExists(path) && overwrite)) {
            //TODO:
        } else {
            System.out.println("Confirmation needed to overwrite "+path);
        }
    }

    private boolean charExists(char c, char[] values) {
        for (char i : values) {
            if (c == i) {
                return true;
            }
        }
        return false;
    }

    private int[] isValidCells(char[][] board, int startX, int startY, int end, boolean isX) {
        if (isX) {
            return isValidCells(board, startX, startY, end, startY);
        } else {
            return isValidCells(board, startX, startY , startX, end);
        }
    }

    private int[] isValidCells(char[][] board, int startX, int startY, int endX, int endY) {
        char[] foundValues = new char[9];
        int i = 0;
        int[] coordinates = new int[2];
        for (int x=startX; x<=endX; x++) {
            for (int y=startY; y<=endY; y++) {
                //if char is not valid or it has already been found
                if ((!charExists(board[x][y],validValues)) || (charExists(board[x][y],foundValues))) {
                    coordinates[0] = x;
                    coordinates[1] = y;
                    return coordinates;
                } else {
                    //add char to found values so long as it is not an empty cell
                    if (board[x][y] != '.') {
                        foundValues[i] = board[x][y];
                        i++;
                    }
                }
            }
        }
        return null;
    }

    public int[] isValid(char[][] board) {
        int[] coordinates;
        //Each 3??3 box can only contain each number from 1 to 9 *once*
        for(int x=0; x<=length; x+=3) {
            for(int y=0; y<=length; y+=3) {
                coordinates = isValidCells(board, x, y, x+2, y+2);
                if (coordinates != null) {
                    return coordinates;
                }
            }
        }
        for(int i=0; i<=length; i++) {

            //Each vertical column can only contain each number from 1 to 9 *once*
            coordinates = isValidCells(board, i, 0, length, false);
            if (coordinates != null) {
                return coordinates;
            }

            //Each horizontal row can only contain each number from 1 to 9 *once*
            coordinates = isValidCells(board, 0, i, length, true);
            if (coordinates != null) {
                return coordinates;
            }
        }
        return null;
    }

    /*
        Constraints:
            board.length == 9
            board[i].length == 9
            board[i][j] is a digit 1-9 or '.'.

        Note:
            A Sudoku board (partially filled) could be valid but is not necessarily solvable.
            Only the filled cells need to be validated according to the mentioned rules.
    */
    public boolean isValidSudoku(char[][] board) {
        if (isValid(board)!=null) {
            return false;
        } else {
            return true;
        }
    }

    /*
        Constraints:
            board.length == 9
            board[i].length == 9
            board[i][j] is a digit or '.'.
            It is guaranteed that the input board has only one solution.
     */
    public void solveSudoku(char[][] board) {
        //Iterate through the board until there are no longer any 'locked in' numbers

        //Guess and restart if invalid (make use of isValidSudoku)
    }
}
