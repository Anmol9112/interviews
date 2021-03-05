package chapter_three_stacks_and_queues;

import java.util.*;
public class ThreeInOne {

	int stackSize=100;
	int[] buffer = new int[stackSize*3];
	int[] stackPointer= {-1,-1,-1};  //Pointers to track top element
	
	void push(int stackNum, int value) throws Exception {
		if(stackPointer[stackNum]+ 1 >= stackSize) {  // last element
			throw new Exception();
		}
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)]=value; // update top value
	}
	int pop(int stackNum) throws Exception  {
		if(isEmpty(stackNum)) {
			throw new EmptyStackException();
		}
		int value=buffer[absTopOfStack(stackNum)]; //get top
		buffer[absTopOfStack(stackNum)]=0;
		stackPointer[stackNum]--;
		return value;
	}
	int peek(int stackNum) {
		if(isEmpty(stackNum)) {
			throw new EmptyStackException();
			
		}
		int index=absTopOfStack(stackNum);
		return buffer[index];
	}
	boolean isEmpty(int stackNum) {
		return stackPointer[stackNum]==-1;
	}
	// returns index of top of stack "stackNum" 
	int absTopOfStack(int stackNum) {
		return stackNum * stackPointer[stackNum];
	}
}
