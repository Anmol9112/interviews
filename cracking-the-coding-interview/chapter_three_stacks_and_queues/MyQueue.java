package chapter_three_stacks_and_queues;

import java.util.*;

public class MyQueue<T> {
	Stack<T> stackNewest, stackOldest;
	public MyQueue() {
		stackNewest =new Stack<T>();
		stackOldest=new Stack<T>();
	}
	public int size() {
		return stackNewest.size() + stackOldest.size();
	}
	public void add(T value) {
		stackNewest.push(value);
	}
	private void shiftStacks() {
		if(stackOldest.isEmpty()) {
			while(!stackNewest.isEmpty()) {
				stackOldest.push(stackNewest.pop());
			}
		}
	}
	public T peek() {
		shiftStacks(); //Ensure stackOldest has the current elements
		return stackOldest.peek(); //retrieve the oldest item.
	}
	public T remove() {
		shiftStacks(); //Ensure stackOldest has the current elements
		return stackOldest.pop(); // pop the oldest element.
	}
	
}

