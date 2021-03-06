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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)return new TreeNode(val);
        TreeNode current_node=root;
        while(true){
            if(current_node.val<=val){
                if(current_node.right!=null){
                    current_node=current_node.right;
                }else{
                    current_node.right=new TreeNode(val);
                    break;
                }}else{
                    if(current_node.left!=null){
                        current_node=current_node.left;
                    }else{
                        current_node.left=new TreeNode(val);
                        break;
                    }
                }
            }
            return root;
        }
