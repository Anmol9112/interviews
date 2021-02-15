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
boolean isSubtree(Tree<Integer> t1, Tree<Integer> t2) {
return traverse(t1,t2);
}
public boolean equals(Tree<Integer> t1, Tree<Integer> t2){
    if(t1==null && t2==null)
        return true;
    if(t1==null || t2==null)
        return false;
        return t1.value.equals(t2.value) && equals(t1.left,t2.left) && equals(t1.right,t2.right);
}
public boolean traverse(Tree<Integer> t1, Tree<Integer> t2){
    if(t2 == null){
        return true;
    }
    if(t1 == null){
        return false;
    }
    if(equals(t1, t2)){
        return true;
    }
    return (traverse(t1.left,t2) || traverse(t1.right, t2));
}