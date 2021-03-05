package chapter_two_linked_lists;

import java.util.*;

public class RemoveDups {
	void deleteDups(LinkedListNode n) {
		HashSet<Integer> set=new HashSet<Integer>();
		LinkedListNode previous=null;
		while(n!=null) {
			if(set.contains(n.data)) {
				previous.next=n.next;
			}else {
				set.add(n.data);
				previous=n;
			}
			n=n.next;
		}
	}

}
