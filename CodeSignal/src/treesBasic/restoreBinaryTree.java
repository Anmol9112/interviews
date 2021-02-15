//
// Binary trees are already defined with this interface:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
Tree<Integer> restoreBinaryTree(int[] inorder, int[] preorder) {
return helper(0,0,inorder.length-1,preorder,inorder);
}
public Tree<Integer> helper(int preStart, int inStart, int inEnd, int[] preorder,int[] inorder){
    if(preStart > preorder.length-1 || inStart > inEnd)return null;
    Tree<Integer> root = new Tree<Integer>(preorder[preStart]);
    int inIndex=0;
    for(int i=inStart;i<=inEnd;i++){
        if(root.value==inorder[i]){
            inIndex=i;
        }
    }
    root.left=helper(preStart+1, inStart, inIndex-1, preorder, inorder);
    root.right=helper(preStart+inIndex-inStart+1,inIndex+1,inEnd, preorder, inorder);
return root;
}
