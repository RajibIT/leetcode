class Solution {
    public int jump(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return 0;
        int jumps = 0;
        int i = 1;
        int max_steps = 0;
        int steps = nums[0];
        while(i < nums.length - 1) {
            max_steps = Math.max(max_steps, i + nums[i]);
            steps--;
            if(steps == 0) {
                steps = max_steps - i;
                jumps++;
            }
            i++;
        }
        return jumps + 1;
    }
}
