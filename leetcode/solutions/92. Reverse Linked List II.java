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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode current_node=head;
        
        while(m>1){
            prev=current_node;
            current_node=current_node.next;
            m--;
            n--;
        }
        ListNode connection=prev;
        ListNode tail=current_node;
        while(n>0){
            ListNode next_node=current_node.next;
            current_node.next=prev;
            prev=current_node;
            current_node=next_node;
            n--;
        }
        if(connection!=null){
            connection.next=prev;
        }else{
            head=prev;
