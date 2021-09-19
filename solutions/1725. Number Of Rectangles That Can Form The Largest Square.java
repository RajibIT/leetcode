class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < rectangles.length; i++) {
            int minSide = Math.min(rectangles[i][0], rectangles[i][1]);
            map.put(minSide, map.getOrDefault(minSide, 0) + 1);
                
        }
        int maxLen = Integer.MIN_VALUE;
        
        for(int key : map.keySet()) {
            if(key > maxLen) {
                maxLen = key;
            }
        }
        return map.get(maxLen);
    }
}
