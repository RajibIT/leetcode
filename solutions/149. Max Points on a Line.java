class Solution {
    public int maxPoints(int[][] points) {
        int maxValue = 1;
        for(int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            HashMap<Float, Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++) {
                if(i != j){
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    float slop = Float.MAX_VALUE;
                    if(x2 - x1 != 0)
                        slop = (float)(y2 - y1) / (float)(x2 - x1);
                    map.put(slop, map.getOrDefault(slop, 1) + 1);
                }
            }
            for(int val : map.values()){
                if(val > maxValue){
                    maxValue = val;
                }
            }
        }
        return maxValue;
    }
}
