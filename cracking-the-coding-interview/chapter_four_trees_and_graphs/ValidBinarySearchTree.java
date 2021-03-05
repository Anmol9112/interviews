package chapter_four_trees_and_graphs;

import java.util.Stack;
import java.util.*;

public class ValidBinarySearchTree {

	public boolean isValidBST(TreeNode root) {
		Stack<TreeNode> stack=new Stack<>();
		double left_child_val= -Integer.MAX_VALUE;
		while(!stack.isEmpty() || root!=null) {
			while(root!=null) {
				stack.add(root);
				root=root.left;
			}
			root=stack.pop();
			if(root.val<=left_child_val)return false;
			left_child_val=root.val;
			root=root.right;
		}
		return true;
	}
}
