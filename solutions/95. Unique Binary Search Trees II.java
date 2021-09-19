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
    public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    public List<TreeNode> helper(int low, int high) {
        List<TreeNode> ans = new ArrayList<>();
        if(low > high) {
            ans.add(null);
            return ans;
        }
        for(int i = low; i <= high; i++) {
            
            List<TreeNode> leftSubTrees = helper(low, i - 1);
            List<TreeNode> rightSubTrees = helper(i + 1, high);
            
            for(TreeNode leftSubTree : leftSubTrees) {
                for(TreeNode rightSubTree : rightSubTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftSubTree;
                    root.right = rightSubTree;
                    ans.add(root);
                }
            }
            
