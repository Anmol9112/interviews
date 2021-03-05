package chapter_two_linked_lists;

import java.util.*;
public class DeleteNode {
	
	boolean deleteNode(LinkedListNode n) {
		if(n==null || n.next==null) {
			return false;
		}
		LinkedListNode next=n.next;
		n.data=next.data;
		n.next=next.next;
		return true;
	}

}
