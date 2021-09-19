class Solution {
    int time = 0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        Map<Integer, ArrayList<Integer>> adj = new HashMap<>();
        for(List<Integer> connection : connections) {
            int u = connection.get(0);
            int v = connection.get(1);
            if(!adj.containsKey(u)) {
                adj.put(u, new ArrayList<Integer>(Arrays.asList(v)));
            }else{
                adj.get(u).add(v);
            }
            if(!adj.containsKey(v)) {
                adj.put(v, new ArrayList<Integer>(Arrays.asList(u)));
            }else{
                adj.get(v).add(u);
            }
        }
        int[] disc = new int[n];
        Arrays.fill(disc, -1);
        int[] low = new int[n];
        Arrays.fill(low, -1);
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, -1, disc, low, adj, res);
        return res;
    }
    public void dfs(int u, int parent, int[] disc, int[] low, Map<Integer, ArrayList<Integer>> adj, List<List<Integer>> res) {
        
        disc[u] = time;
        low[u] = time;
        time++;
        for(int v : adj.get(u)) {
            if(disc[v] == -1) {
                dfs(v, u, disc, low, adj, res);
                if(low[v] > disc[u]) {
                    res.add(new ArrayList<Integer>(Arrays.asList(u, v)));
                }else {
                    low[u] = Math.min(low[u], low[v]);
