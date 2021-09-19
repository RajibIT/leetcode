class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> lists = new ArrayList<>();
        for(int value : nums) {
            lists.add(value);
        }
        List<List<Integer>> res = new ArrayList<>();
        permutation(lists, res, 0);
        return res;
    }
    
    public void permutation(List<Integer> lists, List<List<Integer>> res, int idx) {
        if(idx == lists.size() - 1) {
            res.add(new ArrayList<Integer>(lists));
            
        }else {
            for(int j = idx; j < lists.size(); j++) {
                swap(idx, j, lists);
                permutation(lists, res, idx + 1);
                swap(idx, j, lists);
            }
        }
    }
    
    public void swap(int i, int j, List<Integer> list) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
