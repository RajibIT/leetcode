class Solution {
    
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] arr = new int[n * n + 1];
        int c = 0; int k = 1;
        for(int i = n - 1; i >= 0; i--) {
            if(c % 2 == 0){
                for(int j = 0; j < n; j++) {
                    arr[k] = board[i][j];
                    k++;
                }
            }else{
                for(int j = n - 1; j >= 0; j--) {
                    arr[k] = board[i][j];
                    k++;
                }
            }
            c++;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1, 0});
        boolean visited[] = new boolean[n * n + 1];
        visited[1] = true;
        while(!queue.isEmpty()) {
            int[] move = queue.poll();
            if(move[0] == n * n) return move[1];
            for(int i = 1; i <= 6; i++ ) {
                if(move[0] + i > n * n || visited[move[0] + i]) 
                    continue;
                visited[move[0] + i] = true;    
                queue.add(new int[]{arr[move[0] + i] == -1 ? move[0] + i : arr[move[0] + i], move[1] + 1});
                    
                
            }
        }
        return -1;
    }
}
