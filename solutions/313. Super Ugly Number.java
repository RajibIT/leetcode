class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n <= 0)
            return 0;
        int i = 0; 
        int[] index = new int[primes.length];
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        while(res.size() < n) {
            int min = Integer.MAX_VALUE;
            for(int m = 0; m < primes.length; m++){
                int ugly = primes[m] * res.get(index[m]);    
                min = Math.min(min, ugly);
            }
            res.add(min);
            for(int m = 0; m < primes.length; m++){
                int ugly = primes[m] * res.get(index[m]);    
                if(min == ugly){
                    index[m]++;
                }    
            }
            
        }
        return res.get(res.size() - 1);
    }
}
