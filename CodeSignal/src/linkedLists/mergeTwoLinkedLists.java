// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
ListNode temp_node=new ListNode(0);
ListNode current_node=temp_node;
while(l1!=null && l2!=null){
    if(l1.value<l2.value){
        current_node.next=l1;
        l1=l1.next;
    }else{
        current_node.next=l2;
        l2=l2.next;
    }
    current_node=current_node.next;
}
if(l1!=null){
    current_node.next=l1;
        l1=l1.next;
}
if(l2!=null){
    current_node.next=l2;
    l2=l2.next;
}
return temp_node.next;
}
