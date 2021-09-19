class Solution {
    boolean flag;
    int m=0,n=0;
    public boolean containsCycle(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int[][] color = new int[m][n];
        flag=false;
        for(int i=0;i<m&& !flag;i++){
            for(int j=0;j<n;j++){
                if(color[i][j] == 0){
                    dfs(i,j,-1,-1,grid,color);
                }
            }
        }
        return flag;
    }
    public void dfs(int i, int j, int pr, int pc, char[][] grid, int[][] color){
        color[i][j]=1;
        int[][] dir={{0,-1},{-1,0},{0,1},{1,0}};
        for(int idx=0;idx<4;idx++){
            int r=i+dir[idx][0], c=j+dir[idx][1];
            if(r == pr && c == pc) continue;
                
            if(r>= 0 && c>=0 && r<m && c<n && grid[i][j] == grid[r][c]){
                if(color[r][c] == 0){
                    dfs(r,c,i,j,grid,color);
                }
                if(color[r][c] == 1){
                    flag = true;
                    break;
                }
            }
        }
        color[i][j]=2;
    }
}
