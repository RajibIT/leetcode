class Solution {
    public void solveSudoku(char[][] board) {
        solveSudoku(0, 0, board);
    }
    public boolean solveSudoku(int row, int col, char[][] board) {
        if(col == board[row].length){
            row += 1;
            col = 0;
            if(row == board.length){
                return true;
            }
        }
        if(board[row][col] == '.'){
            for(char i = '1'; i <= '9'; i++) {
                
                if(tryToInsertValue(i, row, col, board)) {
                    board[row][col] = i;
                    if(solveSudoku(row, col + 1, board)) {
                        return true;
                    }
                }
            }
            board[row][col] = '.';
            return false;
        }
        return solveSudoku(row, col + 1, board);
    }
    public boolean tryToInsertValue(char ch, int row, int col, char[][] board) {
        boolean validRow = !containsInRow(row, col, board, ch);
        boolean validCol = !containsInCol(row, col, board, ch);
        if(!validRow || !validCol) {
            return false;
        }
        int subGridRow = (row / 3) * 3;
        int subGridCol = (col / 3) * 3;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i + subGridRow][j + subGridCol] == ch) return false;
            }
