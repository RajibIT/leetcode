class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int[][] sum = new int[matrix.length][matrix[0].length];
        int sumSoFar = 0;
        for(int i = 0; i < matrix.length; i++) {
            sumSoFar += matrix[i][0];
            sum[i][0] = sumSoFar;
        }
        sumSoFar = 0;
        
        for(int i = 0; i < matrix[0].length; i++) {
            sumSoFar += matrix[0][i];
            sum[0][i] = sumSoFar;
        }
         
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i][j];
            }
        }
        int count = 0;
        for(int i = 0; i < sum.length; i++) {
            for(int j = 0; j < sum[0].length; j++) {
                for(int k = i; k < sum.length; k++) {
                    for(int l = j; l < sum[0].length; l++) {
                       int tempSum = sum[k][l];
                        if(i > 0) {
                            tempSum -= sum[i - 1][l]; 
                        }
                        if(j > 0) {
                            tempSum -= sum[k][j - 1];
                        }
                        if(i > 0 && j > 0) {
                            tempSum += sum[i - 1][j - 1];
                        }
                        if(tempSum == target) {
                            count++;
                        }
                    }
