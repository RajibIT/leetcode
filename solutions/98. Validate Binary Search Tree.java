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
    public boolean isValidBST(TreeNode root) {
       return checkBST(root, null, null); 
    }
    
    boolean checkBST(TreeNode root, Integer min, Integer max) {
        if(root == null) {
            return true;
        }
        if(min != null && min >= root.val || max != null && max <= root.val) {
            return false;
        }
        return checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max);
    }
}
