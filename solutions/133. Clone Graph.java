/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
​
class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) 
            return node;
        if(node.neighbors.size() == 0)
            return new Node(node.val);
        Map<Integer, Node> visited = new HashMap<>();
        return getCloneGraph(node, visited);
        
    }
    public Node getCloneGraph(Node node, Map<Integer, Node> visited) {
        Node copy = new Node(node.val);
        visited.put(node.val, copy);
        for(Node neighbor: node.neighbors) {
            
            
            if(visited.get(neighbor.val) != null){
                copy.neighbors.add(visited.get(neighbor.val));    
                continue;
