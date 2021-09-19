class Solution {
    public int maxScore(int[] arr, int k) {
        int i = arr.length - k;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int j;
        for(j = i; j < arr.length; j++) {
            sum += arr[j];
        }
        max = Math.max(sum, max);
         
        int size = 0;
        while(i < arr.length) {
            j = j % arr.length;
            sum += arr[j] - arr[i];
            max = Math.max(max, sum);
            i++; j++;
        }
        return max;
    }
}
