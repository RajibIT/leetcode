class Solution {
    
    public int numTrees(int n) {
        return findNumberBST(n, new int[n+1]);    
    } 
    private int findNumberBST(int n, int[] count){
        count[0] = 1;
        count[1] = 1;
        for(int i=2; i<=n; i++){
            count[i] = 0;
            for(int j=0; j<i; j++){
                count[i] += count[j] * count[i-j-1]; 
            }
        }
        return count[n];
    }
}
