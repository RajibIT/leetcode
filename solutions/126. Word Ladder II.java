class Solution {
    public List<List<String>> findLadders(String start, String end, List<String> dict) {
        List<List<String>> res = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        Map<String, Integer> dist = new HashMap<>();
        Set<String> set = new HashSet<>(dict);
        if(!set.contains(end)) return res;
        
        bfs(start, end, set, map, dist);
        dfs(start, end, map, dist, 1, res, new ArrayList<String>());
        return res;
    }
    public void dfs(String curr, String end,  Map<String, ArrayList<String>> map, Map<String, Integer> dist, int steps, List<List<String>> res, ArrayList<String> current) {
        current.add(curr);
        
        if(curr.equals(end)) res.add(new ArrayList<String>(current));
        
        for(String str : map.get(curr)) {
            if(steps + 1 == dist.get(str)) dfs(str, end, map, dist, steps + 1, res, current);
        }
        current.remove(current.size() - 1);
    }
    public void bfs(String start, String end, Set<String> dict, Map<String, ArrayList<String>> map, Map<String, Integer> dist) {
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        int steps = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                String curr = queue.poll();
                if(dist.containsKey(curr)) continue;
                dist.put(curr, steps);
                map.put(curr, new ArrayList<String>());
                if(curr.equals(end)) break;
                for(int i = 0; i < curr.length(); i++) {
                    for(char ch = 'a'; ch <= 'z'; ch++) {
                        String st = Character.toString(ch);
