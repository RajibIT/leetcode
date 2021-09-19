class Solution {
    public int closedIsland(int[][] grid) {
        if(grid == null && grid.length == 0) return 0;
        int rows = grid.length, cols = grid[0].length;
        int closed_count = 0; 
        for(int i=1; i<rows-1; i++){
            for(int j=1; j<cols-1; j++){
                if(grid[i][j] == 0){
                    if(isClosedIsland(i,j,grid, rows, cols)){
                        closed_count++;
                    }
                }
            }
        }
        return closed_count;
    }
    private boolean isClosedIsland(int i, int j, int[][] grid, int rows, int cols){
        if(grid[i][j] == 1 || grid[i][j] == -1) return true;
        if(isParameters(i, j, rows, cols, grid)) return false;
        grid[i][j] = -1;
        boolean left = isClosedIsland(i, j-1 , grid, rows, cols);
        boolean right = isClosedIsland(i, j+1 , grid, rows, cols);
        boolean top = isClosedIsland(i-1, j , grid, rows, cols);
        boolean bottom = isClosedIsland(i+1, j , grid, rows, cols);
        return left && right && top && bottom;
    }
    private boolean isParameters(int i, int j, int rows, int cols, int[][] grid){
        return i==0 || j ==0 || i == rows-1 || j == cols -1;
    }
}
