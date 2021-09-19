class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[][] visited = new boolean[8][8];
        for(int[] queen : queens) {
            visited[queen[0]][queen[1]] =  true;
            
        }
        int[] dx = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
        
        for(int i = 0; i < dx.length; i++) {
            int x = king[0];
            int y = king[1];
            while(x + dx[i] >= 0 && x + dx[i] < 8 && y + dy[i] >= 0 && y + dy[i] < 8) {
                x = x + dx[i];
                y = y + dy[i];
                if(visited[x][y] == true){
                    res.add(new ArrayList<Integer>(Arrays.asList(x, y)));
                    break;
                }
            }
            
        }
        return res;
    }
}
