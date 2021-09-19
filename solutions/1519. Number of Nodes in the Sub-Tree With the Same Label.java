class Solution {
    ArrayList[] graph; int[] alpha; int[] result;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        graph=new ArrayList[n];
        result=new int[n];
        alpha=new int['z'-'a'+1]; 
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<Integer>();
        }
        for(int[] edge:edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        dfs(0, labels, -1);
        return result;
    }
    public void dfs(int node, String labels, int prevNode){
        char label = labels.charAt(node);
        int count = alpha[label - 'a']++;
        for(int child:(ArrayList<Integer>)graph[node]){
            if(child == prevNode) continue;
            dfs(child,labels, node);
        }
        result[node]=alpha[label - 'a']-count;
    }
}
