class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int i = triangle.size() - 2;
        while(i >= 0) {
            for(int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
                triangle.get(i).set(j, triangle.get(i).get(j)+ Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
            }
            i--;
        }
        return triangle.get(0).get(0);
    }
}
