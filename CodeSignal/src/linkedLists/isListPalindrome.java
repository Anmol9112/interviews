// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
boolean isListPalindrome(ListNode<Integer> l) {
    boolean palindrome=true;
ListNode<Integer> fast=l;
Stack<Integer> stack=new Stack<>();
while(fast!=null){
    stack.push(fast.value);
    fast=fast.next;
}
while(l!=null){
    int top=stack.pop();
    if(top==l.value){
        palindrome=true;
    }else{
        palindrome=false;
        break;
    }
    l=l.next;
}
return palindrome;
}
