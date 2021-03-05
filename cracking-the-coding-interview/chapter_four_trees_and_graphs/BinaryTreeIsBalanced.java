package chapter_four_trees_and_graphs;

import javax.swing.tree.TreeNode;

public class BinaryTreeIsBalanced {

	int getHeight(TreeNode root) {
		if(root==null)return -1;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}
	boolean isBalanced(TreeNode root) {
		if(root==null)return true;  //Base case
		
		int heightDiff=getHeight(root.left) - getHeight(root.right);
		if(Math.abs(heightDiff)>1) {
			return false;
		}else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}
}
