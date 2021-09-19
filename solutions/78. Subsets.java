class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getSubsets(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    public void getSubsets(List<List<Integer>> res, List<Integer> current, int[] nums, int idx) {
        res.add(new ArrayList<Integer>(current));
        for(int i = idx; i < nums.length; i++) {
            current.add(nums[i]);
            getSubsets(res, current, nums, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
