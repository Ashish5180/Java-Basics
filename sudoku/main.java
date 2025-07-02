class main {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(board);
        
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean solveSudoku(char[][] board){
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.'){
                    for(char num = '1'; num <= '9'; num++){
                        if(isValid(board, row, col, num)){
                            board[row][col] = num;
                            if(solveSudoku(board)){
                                return true;
                            }
                            board[row][col] = '.'; // backtrack
                        }
                    }
                    return false; // koi number match nahi hua
                }
            }
        }
        return true; // sab fill ho gaya
    }
    
    public static boolean isValid(char[][] board, int row , int col, char num){
        for(int i = 0; i < 9; i++){
            if(board[row][i] == num || board[i][col] == num){
                return false;
            }
        }
        
        int boxRowStart = 3 * (row / 3);
        int boxColStart = 3 * (col / 3);
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[boxRowStart + i][boxColStart + j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
