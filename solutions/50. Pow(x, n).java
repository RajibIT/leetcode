class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        double res = 0.0;
        if(n > 0) res = myPow(x, n / 2);
        if(n < 0) res = myPow(1.0/x, -(n / 2));
        
        if(Math.abs(n) % 2 == 1) {
            if(n < 0)
                return 1.0 / x * res *res;
            return x * res * res; 
        }
        return res * res; 
    }
}
