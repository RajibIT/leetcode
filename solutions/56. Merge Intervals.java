class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->Integer.compare(a[0], b[0]));
        List<int[]> temp = new ArrayList<>();
        temp.add(intervals[0]);
        int[] prev = temp.get(temp.size() - 1);
        for(int i = 1; i < intervals.length; i++) {
            if(prev[1] >= intervals[i][0]) {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            }else{
                temp.add(intervals[i]);
                prev = temp.get(temp.size() - 1);
            }
        }
        int[][] res = new int[temp.size()][2];
        int k = 0;
        for(int[] t : temp) {
            res[k++] = t;
        }
        return res;
    }
}
