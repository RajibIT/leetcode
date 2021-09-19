class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int row_arr[] = new int[col]; 
        int max = 0;
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                if(matrix[i][j] == '0'){
                    row_arr[j]=0;
                }else{
                    row_arr[j]+=1;
                }
            }
            int area = Math.max(max, findAreaHistogram(row_arr));
            if(area>max){
                max = area;
            }
        }
        return max;
    }
    public int findAreaHistogram(int[] row_arr){
        Stack<Integer> stack = new Stack<Integer>();
        int area = 0;
        stack.push(0);
        for(int i=1;i<row_arr.length;i++){
            int curr = row_arr[i]; 
            if(!stack.isEmpty() && curr >= row_arr[stack.peek()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty() && curr < row_arr[stack.peek()]){
                    int idx = stack.pop();
                    if(stack.isEmpty()){
                        area = Math.max(area, row_arr[idx]*i);
                    }else{
                        area = Math.max(area, row_arr[idx]*(i-stack.peek()-1));    
                      }
