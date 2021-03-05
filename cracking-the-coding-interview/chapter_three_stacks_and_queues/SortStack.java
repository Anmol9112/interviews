package chapter_three_stacks_and_queues;

import java.util.*;

public class SortStack {

	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> r=new Stack<Integer>();
		while(!s.isEmpty()) {
			int temp=s.pop();
			while(!r.isEmpty() && r.peek()>temp) {
				s.push(r.pop());
			}
			r.push(temp);
		}
		while(!r.isEmpty()) s.push(r.pop()); //copy elements from r back into s
	}
}
