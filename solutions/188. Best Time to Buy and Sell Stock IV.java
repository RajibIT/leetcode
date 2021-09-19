class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices.length == 0)
            return 0;
        int [][] dp = new int[k + 1][prices.length];
        
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else{
                    int max = dp[i][j - 1];
                    for(int m = 0; m < j; m++){
                        max = Math.max(max, dp[i - 1][m] + prices[j] - prices[m]);
                    }
                    dp[i][j] = max;
                }
            }
        }
        return dp[k][prices.length - 1];
    }
}
