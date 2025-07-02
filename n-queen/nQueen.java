public class nQueen {
    

    public static void main(String[] args) {
        int n=4;
        char [][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
             
        }
        solve(board, 0);
    }

    public static void solve(char[][] board , int row){
        if(row==board.length){
            printBoard(board);
            System.out.println("-------------------");
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q'; // Place queen
                solve(board,row+1); // Recur to place next queen
                board[row][col]='.'; // Backtrack
            }
        }
        
    }

    public static boolean isSafe(char[][] board,int row,int col){
        // row
        for(int i=0;i<row;i++){
            
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for(int i = row-1 , j=col+1;i >=0  && j<board.length; i-- , j++){
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static void printBoard(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0 ; j<board[i].length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



}
