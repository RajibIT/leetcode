class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0)
            return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) {
            for(int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while(left < right){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                if(sum < target) {
                    left++;
                }else if(sum > target) {
                    right--;
                }else {
                    List<Integer> temp = new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    if(!result.contains(temp))
                        result.add(temp);
                    left++;
                    right--;
                    }
                
                }
            }
        }
        return result;
    }
}
