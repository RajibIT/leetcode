class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < obstacleGrid.length; i++) {
            for(int j = 0; j < obstacleGrid[0].length; j++) {
                if(obstacleGrid[i][j] == 1)
                    dp[i][j] = -1;
            }
        }
        
        for(int i = 0; i < dp[0].length; i++) {
            if(dp[0][i] == -1){
                break;
            }
            dp[0][i] = 1;
        }
        for(int i = 0; i < dp.length; i++) {
            if(dp[i][0] == -1){
                break;
            }
            dp[i][0] = 1;
        }
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                if(dp[i][j] != -1){
                    int up = dp[i - 1][j];
                    if(dp[i - 1][j] == -1)
                        up = 0;
                    int left = dp[i][j - 1];
                    if(dp[i][j - 1] == -1)
                        left = 0;
                    dp[i][j] = up + left;    
                }
            }
        }
        return dp[m - 1][n - 1] == -1 ? 0 : dp[m - 1][n - 1];
    }
