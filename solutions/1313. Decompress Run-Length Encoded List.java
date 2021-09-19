class Solution {
    public int[] decompressRLElist(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(i < nums.length / 2) {
            int freq = nums[2 * i];
            int val = nums[2 * i + 1];
            for(int j = 0; j < freq; j++)
                list.add(val);
            i++;
        }
        int[] res = new int[list.size()];
        for(int j = 0; j < res.length; j++) {
            res[j] = list.get(j);
        }
        return res;
    }
}
