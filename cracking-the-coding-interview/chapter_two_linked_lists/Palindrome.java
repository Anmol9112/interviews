package chapter_two_linked_lists;

import java.util.*;
public class Palindrome {

	public boolean isPalindrome(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		Stack<Integer> stack=new Stack<Integer>();
		while(fast!=null || fast.next!=null) {
			stack.push(slow.val);
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null) {
			slow=slow.next;
		}
		while(slow!=null) {
			int top=stack.pop().intValue();
			if(top!=slow.val) {
				return false;
			}
			slow=slow.next;
		}
		return true;
		
	}
}
