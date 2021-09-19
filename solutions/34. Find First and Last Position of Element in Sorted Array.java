class Solution {
    int res[];
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1, -1};
        res = new int[]{nums.length - 1, 0};
        bst(nums, 0, nums.length - 1, target);
        if(nums[res[0]] != target && nums[res[1]] != target) return new int[] {-1, -1};
        return res;
    }
    public void bst (int[] nums, int left, int right, int target) {
        if(left > right) {
            return;
        }
        int mid = left +(right - left) / 2;
        if(nums[mid] < target) {
            bst(nums, mid + 1, right, target);
        }else if(nums[mid] > target) {
            bst(nums, left, mid - 1, target);
        }else{
            
            bst(nums, left, mid - 1, target);
            if(mid < res[0]) res[0] = mid;
            bst(nums, mid + 1, right, target);
            if(mid > res[1]) res[1] = mid;
            
        }
    }
    
}
