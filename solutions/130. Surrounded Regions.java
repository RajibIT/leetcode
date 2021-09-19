class Solution {
    public void solve(char[][] board) {
        int regions = 0;
        for(int i = 0; i < board.length; i++) {
            if(board[i][0] == 'O')
                getRegion(board, i, 0);
            if(board[i][board[0].length - 1] == 'O')
                getRegion(board, i, board[0].length - 1);
        }
        for(int i = 0; i < board[0].length; i++) {
            if(board[0][i] == 'O') 
                getRegion(board, 0, i);
            if(board[board.length - 1][i] == 'O') 
                getRegion(board, board.length - 1, i);
            
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'Y') {
                    board[i][j] = 'O';
                }
                else {
                    board[i][j] = 'X';
                }
            }
        }
    }
    public void getRegion(char[][] board, int row, int col) {
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length) 
            return;
        if(board[row][col] == 'X' || board[row][col] == 'Y')
            return;
    
        board[row][col] = 'Y';
        getRegion(board, row - 1, col);
        getRegion(board, row + 1, col);
        getRegion(board, row, col - 1);
        getRegion(board, row, col + 1);
        
