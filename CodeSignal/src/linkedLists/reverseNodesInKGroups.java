// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode reverse(ListNode a,ListNode b){
    ListNode prev,curr,next;
    prev=null;curr=a;next=a;
    while(curr!=b){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}
ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
if(l==null)return null;
ListNode a,b;
a=b=l;
for(int i=0;i<k;i++){
    if(b==null)return l;
    b=b.next;
}
ListNode newHead=reverse(a,b);
a.next=reverseNodesInKGroups(b,k);
return newHead;
}
