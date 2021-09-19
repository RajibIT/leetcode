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
    long max;
    long sum;
    public int maxProduct(TreeNode root) {
        sum = sumOfAllNodeValues(root);
        max = 1;
        findMaxProduct(root);
        return (int)(max % 1000000007);
    }
    public void findMaxProduct(TreeNode tree) {
        if(tree.left != null) {
            maxProduct(tree.left.val);
            findMaxProduct(tree.left);
        }
        if(tree.right != null) {
            maxProduct(tree.right.val);
            findMaxProduct(tree.right);
        }
        
    }
    
    public int sumOfAllNodeValues(TreeNode root){
        if(root == null) {
            return 0;
