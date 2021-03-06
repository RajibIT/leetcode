class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, i);
        }
        for(int i = 0; i < nums.length; i++) {
            int secondNum = target- nums[i];
            if(map.containsKey(secondNum)) {
                int idx = map.get(secondNum);
                if(idx != i) {
                    return new int[]{i, idx};
                }
            }
        }
        return new int[]{};
        
    }
}
