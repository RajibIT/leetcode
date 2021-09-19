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
    long max = 1;
    public int maxProduct(TreeNode root) {
        long sum_all = 0;
        sum_all = modify(root);
        calMaxProd(root, sum_all);
        return (int)(max%1000000007);
    }
    private int modify(TreeNode root){
        if(root == null) return 0;
        root.val = root.val+ modify(root.left)+modify(root.right);
        return root.val;
    }
    private void calMaxProd(TreeNode root, long sum_all){
        if(root == null) return;
        if(root.left != null){
            long ans = root.left.val*(sum_all - root.left.val);
            max = Math.max(max,ans);
            calMaxProd(root.left,sum_all);
        }
        if(root.right != null){
            long ans = root.right.val*(sum_all - root.right.val);
            max = Math.max(max,ans);
            calMaxProd(root.right,sum_all);
