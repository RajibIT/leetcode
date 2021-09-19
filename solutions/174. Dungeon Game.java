class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];
        
        
        dp[m - 1][n - 1] = Math.min(0, dungeon[m - 1][n - 1]);
        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                if(i + 1 < m && j + 1 < n) {
                    dp[i][j] = dungeon[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j]);
                    if(dp[i][j] > 0){
                        dp[i][j] = 0;
                    }
                }
                else if(j + 1 < n) {
                    dp[i][j] = dungeon[i][j] + dp[i][j + 1];
                    if(dp[i][j] > 0){
                        dp[i][j] = 0;
                    }
                }else if(i + 1 < m) {
                    dp[i][j] = dungeon[i][j] + dp[i + 1][j];
                    if(dp[i][j] > 0){
                        dp[i][j] = 0;
                    }
                }
            }
        }
        
        return Math.abs(dp[0][0]) + 1; 
        
        /*for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                if(i == m - 1 && j == n - 1) {
                    dp[i][j] = Math.min(0, dungeon[i][j]);
                    
                }
                else if(i == m - 1) {
