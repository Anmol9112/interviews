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
boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
if(t==null){
    return false;
}
return traverseTree(t,0,s); 
}
boolean checkB=false;
boolean traverseTree(Tree<Integer> tree,int sum,int check){
    int tempSum=sum;
    tempSum+=tree.value;
    if(checkB==true){
        return true;
    }
    if(tempSum==check && tree.left==null && tree.right==null){
        checkB=true;
        return true;
    }
    if(tempSum==check){
        System.out.println(tree.value);
    }
    if(tree.left!=null){
        checkB=traverseTree(tree.left, tempSum, check);
    }
    if(tree.right!=null){
        checkB=traverseTree(tree.right, tempSum, check);
    }
    return checkB;
}