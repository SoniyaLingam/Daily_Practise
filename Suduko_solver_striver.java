public class Suduko_solver_striver {

    // This method solves the Sudoku
    public static boolean solveSudoku(char[][] board) {

        // Find an empty cell
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    // Try numbers 1 to 9
                    for (char num = '1'; num <= '9'; num++) {

                        // Check if the number can be placed
                        if (isValid(board, row, col, num)) {

                            // Place the number
                            board[row][col] = num;

                            // Recursively solve the remaining board
                            if (solveSudoku(board)) {
                                return true;
                            }

                            // If it doesn't work, undo the number
                            board[row][col] = '.';
                        }
                    }

                    // No number works
                    return false;
                }
            }
        }

        // No empty cells left
        return true;
    }

    // Check whether a number can be placed
    public static boolean isValid(char[][] board, int row, int col, char num) {

        // Check the row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Find the starting row and column of 3x3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        // Check the 3x3 box
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {

                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Given Sudoku board
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},

            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},

            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Solve the Sudoku
        solveSudoku(board);

        // Print the solved Sudoku
        System.out.println("Solved Sudoku:");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}