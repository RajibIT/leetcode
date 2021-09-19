class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0)
            return 0;
        int[] rowArr = new int[matrix[0].length];
        
        int max = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] != '0'){
                    rowArr[j] += 1;
                }else{
                    rowArr[j] = 0;
                }
            }
            int area = findHistogramArea(rowArr);
           if(area > max) {
               max = area;
           }
        }
        return max;
    }
    public int findHistogramArea(int[] rowArr) {
        
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int area = 0;
        for(int i = 1; i < rowArr.length; i++) {
            int curr = rowArr[i];
            while(!stack.isEmpty() && curr < rowArr[stack.peek()]) {
                int idx = stack.pop();
                if(stack.isEmpty()){
                    area = Math.max(area, rowArr[idx] * i);
                }else{
                    area = Math.max(area, rowArr[idx] * (i - stack.peek() - 1));
                    }
                }
                stack.push(i);
