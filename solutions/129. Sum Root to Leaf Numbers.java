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
    int ans=0, val = 0 ;
    public int sumNumbers(TreeNode root) {
        sumNumbers(root, val);
        return ans;
        
        
    
    }
    public void sumNumbers(TreeNode root, int val){
        if(root == null)
            return;
        
        val =val*10 + root.val;
        if(root.left == null && root.right == null){
            ans+=val;
            return;
        }
            
            sumNumbers(root.left, val);
            sumNumbers(root.right, val);
        
    }
​
