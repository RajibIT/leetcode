class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        
        for(int i = 1; i < nums.length - 1; i++) {
            
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    max1 = Math.max(max1, nums[j]);           
                }
            }
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] < nums[j]) {
                    max2 = Math.max(max2, nums[j]);
                }
            }
            if(max1 != Integer.MIN_VALUE && max1 < nums[i] && nums[i] < max2) {
                return true;
            }
         }
        return false;
    }
}
