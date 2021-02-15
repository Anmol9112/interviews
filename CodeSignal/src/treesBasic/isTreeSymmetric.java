// import java.util.*;
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
public boolean isTreeSymmetric(Tree<Integer> t) {
    if(t==null){
        return true;
    }
return isMirror(t.left,t.right);
}
public boolean isMirror(Tree<Integer> t1,Tree<Integer> t2){
    if(t1==null && t2==null)return true;
    if(t1==null || t2==null)return false;
    return (t1.value==t2.value) &&  isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
}

