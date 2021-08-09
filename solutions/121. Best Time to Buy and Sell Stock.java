class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            else 
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            
            
        }
        return maxProfit;
    }
}
