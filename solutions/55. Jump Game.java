class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int max_steps = 0;
        while(max_steps < nums.length - 1){
            if(nums[i] == 0 && i + nums[i] == max_steps)
                return false;
            if(i + nums[i] > max_steps) {
                max_steps = i + nums[i];
            } i++;
        }
        return true;
    }
}
