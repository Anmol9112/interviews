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
int kthSmallestInBST(Tree<Integer> t, int k) {
int[] nums=new int[2];
inorder(t,nums,k);
return nums[1];
}
public void inorder(Tree<Integer> t,int[] nums,int k){
    if(t==null){
        return;
    }
    inorder(t.left,nums,k);
    if(++nums[0]==k){
        nums[1]=t.value;
        return;
    }
    inorder(t.right,nums,k);
}
