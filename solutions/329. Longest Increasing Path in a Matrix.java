class Solution {
    int dx[] = new int[]{-1, 1, 0, 0};
    int dy[] = new int[]{0, 0, -1, 1};
    public int longestIncreasingPath(int[][] matrix) {
        int longestPath = 0;
        int distance[][] = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
               int path =  getPath(matrix, i, j, distance);
                if(longestPath < path){
                    longestPath = path;
                }
            }
        }
        return longestPath;
    }
    public int getPath(int[][] matrix, int i, int j, int[][] distance) {
        if(distance[i][j] != 0) return distance[i][j];
        distance[i][j] = 1;
        for(int k = 0; k < dx.length; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if(x < 0 || x >=matrix.length || y < 0 || y >= matrix[0].length || matrix[i][j] >= matrix[x][y])
                continue;
            distance[i][j] = Math.max(distance[i][j], getPath(matrix, x, y, distance) + 1);
        }
        
        return distance[i][j];
    }
}
