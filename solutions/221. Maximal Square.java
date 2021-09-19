class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] new_matrix = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                
                new_matrix[i][j] =  matrix[i][j] - '0';
            }
        }
        int maxSquare = 0;
        int square = 0;
        for(int i = 0; i < new_matrix.length; i++) {
            for(int j = 0; j < new_matrix[0].length; j++) {
                if(new_matrix[i][j] != 0) {
                    
                    square = new_matrix[i][j];
                    if(i > 0 &&  j > 0){
                        if(new_matrix[i- 1][j] == 0 || new_matrix[i - 1][j - 1] == 0 || new_matrix[i][j - 1] == 0)                      continue;
                        new_matrix[i][j] = Math.min(Math.min(new_matrix[i - 1][j], new_matrix[i][j - 1]), new_matrix[i - 1][j - 1]) + 1;
                        if(maxSquare < new_matrix[i][j]){
                            maxSquare = new_matrix[i][j];
                        }
                    }
                    
                }
            }
        }
        return maxSquare == 0 ? square : maxSquare * maxSquare;
    }
}
