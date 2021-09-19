class Solution {
    public int largestRectangleArea(int[] heights) {
        boolean flag = true;
        int k;
        int summ = 0;
        for(k= 0; k < heights.length - 1; k++) {
            if(heights[k] != heights[k + 1]){
                flag = false;
                break;
            }
            summ += heights[k];
        }
        if(flag){
            return summ + heights[k];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; i++) {
            int sum = heights[i] + getOthers(heights, i, i - 1, i + 1);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static int getOthers(int[] A, int i, int left, int right) {
        int sum = 0;
        while(left >= 0 && A[left] >= A[i]) {
            sum += A[i];
            left--;
        }
        while(right < A.length && A[right] >= A[i]) {
            sum += A[i];
            right++;
        }
        return sum;
    }
        
    
}
