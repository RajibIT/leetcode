class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0)
            return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            if(i == 0 ||(i > 0 && nums[i - 1] != nums[i])){
            int left = i + 1;
            int right = nums.length - 1;
            int fvalue = nums[i];
            while(left < right) {
                int sum = nums[left] + nums[right] + fvalue;
                if(sum < 0) {
                    left++;
                }else if(sum > 0) {
                    right--;
                }else {
                    
                    List<Integer> temp = new ArrayList<Integer>(Arrays.asList(fvalue, nums[left], nums[right]));
                    if(!result.contains(temp))
                        result.add(temp);
                    left++; right--;
                    }
                }
            }
         
        }
        return result;
    }
}
