class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i]; 
            for(int j = 0; j < nums.length; j++) {
                if(val > nums[j]) {
                    
                        res[i]++;
                
                }
            }
            
        }
        return res;
    }
}
