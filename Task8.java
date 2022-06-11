public class Task8 {
    public static void main(String[] args) {
        int [][] board = { {0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0}};

        // if (!solveNQueen(board, 0)){
        //     System.out.println("Решения нет");
        //     return;
        // }

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkPosition(int[][] board, int row, int column) {
        for (int i=0; i<column; i++){
            if (board[row][i] == 1) return false;
        }
        for (int i = row - 1, j = column + 2; i >= 0 && j >= 0; i--, j++){
            if (board[i][j] == 1) return false;
        }
        for (int i = row + 1, j = column - 2; i >= 0 && j >= 0; i++, j--){
            if (board[i][j] == 1) return false;
        }
        for (int i = row - 1, j = column - 2; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 1) return false;
        }
        for (int i = row + 1, j = column - 2; i >= 0 && j >= 0; i++, j--){
            if (board[i][j] == 1) return false;
        return true;
        
    }
    
    public static boolean solveNHorse (int board[][], int col) {
        if (col >= board.length){
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (checkPosition(board, i, col)) {
                board[i][col] = 1;

                if (solveNHorse(board, col+1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        } 
        return false;       
    }
}
