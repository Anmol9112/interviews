package chapter_four_trees_and_graphs;


public class FirstCommonAncestor {

	TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(p.val==root.val && q.val==root.val) {
			return true;
		}
		if(p.val<root.val && q.val<root.val) {
			return lowestCommonAncestor(root.left, p,q);
		}
		if(p.val>root.val && q.val>root.val) {
			return lowestCommonAncestor(root.right, p,q);
		}
	}
}
