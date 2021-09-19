class Solution {
    public int numOfWays(int n) {
        long count_2Colors = 6L;
        long count_3Colors = 6L;
        long mod = 1000000007;
        if(n == 1){
            return (int)(count_2Colors + count_3Colors);
        }
        else{
            for(int i = 2; i <= n; i++) {
                long color2 = ((2 * count_3Colors) % mod + (3 * count_2Colors) % mod) % mod;
                long color3 = ((2 * count_3Colors) % mod + (2 * count_2Colors) % mod) % mod;
                count_2Colors = color2;
                count_3Colors = color3;
            }
            return (int)((count_2Colors + count_3Colors) % mod);
        }
        
    }
}
