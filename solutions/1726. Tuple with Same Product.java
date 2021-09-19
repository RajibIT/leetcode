class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length - 1; i++) {
            int k = i + 1;
            while(k < nums.length){
                map.put(nums[i] * nums[k], map.getOrDefault(nums[i] * nums[k], 0) + 1);
                k++;
            }
                
        }
        
        int result = 0;
        for(int value : map.values()) {
            
            if(value >= 2) {
                int combination = (value * (value - 1)) / 2;
                result += combination * 8;
            }
            
        }
        return result;
    }
    
    
}
