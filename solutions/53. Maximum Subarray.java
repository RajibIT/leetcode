class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tempValue = 0;
        for(int i = 0; i < nums.length; i++) {
            tempValue = Math.max(tempValue + nums[i], nums[i]);
            max = Math.max(tempValue, max);
        }
        return max;
    }
}
