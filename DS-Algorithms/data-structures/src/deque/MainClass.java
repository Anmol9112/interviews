package deque;

import java.util.ArrayDeque;

public class MainClass {
public static void main(String[] args) {
	ArrayDeque<Integer> dq=new ArrayDeque<>();
	dq.push(12);
	dq.push(23);
	dq.push(34);
	System.out.println(dq.pop());
	System.out.println(dq.pop());
}
}
