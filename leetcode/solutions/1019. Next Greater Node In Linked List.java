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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> node_vals=new ArrayList();
        ListNode current_node=head;
        while(current_node!=null){
            node_vals.add(current_node.val);
            current_node=current_node.next;
        }
            int[] output_arr=new int[node_vals.size()];
            Stack<Integer> stack=new Stack();
        for(int i=0;i<node_vals.size();i++){
            while(!stack.isEmpty() && node_vals.get(stack.peek())<node_vals.get(i)){
                output_arr[stack.pop()]=node_vals.get(i);
            }
            stack.push(i);
        }
        return output_arr;
    }
}
