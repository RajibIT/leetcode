/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        
        bfs(q, res);
        return res;
    }
    public void bfs(Queue<TreeNode> q, List<List<Integer>> res) {
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> curr = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                curr.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
