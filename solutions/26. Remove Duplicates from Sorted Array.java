class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 0; 
        if(nums.length == 0) return res;
        int prev = 0;
        
        for(int num : nums) {
            if(num != nums[prev]) {
                prev++;
                nums[prev] = num;
                
            }
        }
        return prev + 1;
    }
}
