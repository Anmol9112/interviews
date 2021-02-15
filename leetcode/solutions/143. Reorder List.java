/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        //head of first half
        ListNode l1=head;
        //head of second half
        ListNode slow=head;
        //tail of second half
        ListNode fast=head;
        //tail of first half
        ListNode prev=null;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode l2=reverse(slow);
        
        merge(l1,l2);
        
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current_node = head;
        
