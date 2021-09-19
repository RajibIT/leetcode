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
    public int kthSmallest(TreeNode root, int k) {
        if(k < 0){
            return -1;
        }
        
        int[] node = new int[2]; 
        getSmallest(root, k, node);
        return node[1];
        /*List<Integer> res = new ArrayList<Integer>();
        getKthSmallest(root, k, res);
        return res.get(k - 1);*/
        
    }
    public void getSmallest(TreeNode root, int k, int[] node) {
        if(root == null) 
            return;
        getSmallest(root.left, k, node);
        
        if(++node[0] == k) {
            node[1] = root.val;
            return;
        }
        getSmallest(root.right, k, node);
