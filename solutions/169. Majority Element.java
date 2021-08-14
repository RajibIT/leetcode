class Solution {
    public int majorityElement(int[] nums) {
        /*Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        int halfSize = nums.length / 2;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(halfSize < entry.getValue()){
                return entry.getKey();
            }
        }
        return -1;
        */
        /*Arrays.sort(nums);
        int j = 0, count = 0;
        int halfSize = nums.length / 2;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[j]) {
                count = 0;j = i;
            }
            count++;
            if(count > halfSize) {
                return nums[i];
            }
            
        }
        return nums[nums.length - 1];*/
        int count = 0; int value = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0){
                value = nums[i];
            }
            if(nums[i] == value) {
                count++;
            }else{
                count--;
            }
            
        }
        return value;
    }
}
