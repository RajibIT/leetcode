class Solution {
    public int numTilings(int N) {
        if(N == 1)
            return 1;
        if(N == 2)
            return 2;
        int mod = 1000000007;
        int dp[] = new int [N  + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        
        for(int i = 4 ; i <N + 1; i++){
            dp[i] = (2 * dp[i - 1] % mod + dp[i - 3] % mod) % mod;
        }
        return dp[N];
    }
}
