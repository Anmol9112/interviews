package chapter_four_trees_and_graphs;

import java.util.*;
public class CreateLinkedListForEachLevel {

	ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result=new ArrayList<LinkedList<TreeNode>>();
		//visit the root
		
		LinkedList<TreeNode> current= new LinkedList<TreeNode>();
		if(root!=null) {
			current.add(root);
		}
		while(current.size()>0) {
			result.add(current); //add previous level
		}
		LinkedList<TreeNode> parents=current; //Go to next level
		current=new LinkedList<TreeNode>();
		for(TreeNode parent:parents) {
			// visit the children
			if(parent.left!=null) {
				current.add(parent.left);
			}
			if(parent.right!=null) {
				current.add(parent.right);
			}
		}
		return result;
	}
}
