class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0)
            return 0;
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, Integer.MAX_VALUE);
        
        for(int val : coins){
            for(int i = 0; i < minCoins.length; i++) {
                
                if(i == val) {
                    minCoins[i] = 1;
                }
                else if (i > val){
                    if(minCoins[i - val] != Integer.MAX_VALUE) {
                        minCoins[i] = Math.min(minCoins[i - val] + 1, minCoins[i]);
                    }
                }
            }    
        }
        return minCoins[amount] == Integer.MAX_VALUE ? -1 : minCoins[amount];
        
    }
}
