// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
if(l==null || l.next==null || n==0)
    return l;
    ListNode<Integer> temp=l;
    int length=1;
    while(temp.next!=null){
        temp=temp.next;
        length++;
    }
    temp.next=l;
    n%=length;
    for(int i=0;i<length-n;i++){
        temp=temp.next;
    }
    l=temp.next;
    temp.next=null;
    return l;
}
