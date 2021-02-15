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
    int longestPath=0;
    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return longestPath;
    }
    private int longestPath(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHeight=longestPath(node.left);
        int rightHeight=longestPath(node.right);
        longestPath=Math.max(longestPath,leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight)+1;
    }
}
