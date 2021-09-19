class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int k = 0;
        for(int i = 0; i < n && k < nums.length; i++) {
            ans[k++] = nums[i];
            ans[k++] = nums[n + i];
        }
        
        
        return ans;
    }
}
