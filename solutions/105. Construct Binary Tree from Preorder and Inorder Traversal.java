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
    Map<Integer, Integer> hm = new HashMap<>();
    int preOrderIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) {
            hm.put(inorder[i], i);
        }
        return build(inorder, preorder, 0, inorder.length - 1);
    }
    public TreeNode build(int[] inorder, int[] preorder, int start, int end) {
        if(start > end) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[preOrderIndex++]);
        
        /*if(root == null) {
            return null;
        }*/
        
        if(start == end) {
            return root;
        }
        
