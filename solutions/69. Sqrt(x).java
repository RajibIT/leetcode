class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;
        int squareRoot = x / 2;
        int t;
        do{
            t = squareRoot;
            squareRoot = (t + (x/t)) / 2;
        }while((t - squareRoot) > 0);
        
        return (int)t;
    }
}
