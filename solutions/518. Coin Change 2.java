class Solution {
    public int change(int amount, int[] coins) {
        if(amount == 0 && coins.length == 0)
            return 1;
        int[] coinChanges = new int[amount + 1];
        
        coinChanges[0] = 1;
        for(int val : coins) {
            for(int i = 0; i <= amount; i++) {
                if(val <= i) {
                    
                    coinChanges[i] += coinChanges[i - val];
                        
                    
                }
            }    
        }
        return coinChanges[amount];
    }
}
