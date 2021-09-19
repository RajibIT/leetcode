class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;
        ArrayList[] adj_list = new ArrayList[n];
        for(int i=0; i<n; i++){
            adj_list[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<connections.length; i++){
            adj_list[connections[i][0]].add(connections[i][1]);
            adj_list[connections[i][1]].add(connections[i][0]);
        }
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<Integer>();
        int unconnected = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                //System.out.println(i);
                stack.add(i);
                dfs(visited, stack, adj_list);
                unconnected++;
            }
        }
       
        return unconnected-1;
    }
    private void dfs(boolean[] visited, Stack<Integer> stack, ArrayList[] adj_list){
        while(!stack.isEmpty()){
            //if(!visited[node]){
            
            
            //for(int i=0; i<stack.size(); i++){
                int temp = stack.pop();
                
                if(!visited[temp]){
                    
                    visited[temp] = true;
                    ArrayList<Integer> list = adj_list[temp];
                for(int val:list){
                    stack.add(val);
