package com.bridgelabz.StackAndQueue;

public class Stack{
	private LinkedList stack;
	/**
	 * @return the top
	 */
	public LinkedList.Node getTop() {
		return top;
	}

	/**
	 * @param top the top to set
	 */
	public void setTop(LinkedList.Node top) {
		this.top = top;
	}

	/**
	 * @return the stack
	 */
	public LinkedList getStack() {
		return stack;
	}

	/**
	 * @param stack the stack to set
	 */
	public void setStack(LinkedList stack) {
		this.stack = stack;
	}

	LinkedList.Node top;
	
	/**
	 * creates the stack
	 */
	public Stack() {
		stack = new LinkedList();
		top = null;
	}

	/**
	 * Puts data in the stack
	 */
	public<T extends Comparable<T>> void push(T data) {
		stack.addNodeAtFirst(data);
		top = stack.getHead();
	}
	
	/**
	 * Prints out all the stack values
	 */
	public void printStack() {
		System.out.println("The stack is as follows");
		stack.printList();
	}
	
	/**
	 * @return the data present at the top of the stack
	 */
	public<T extends Comparable<T>> T peek() {
		if(top != null)
			return (T)top.getData();
		System.out.println("The stack is empty. Returning null");
		return null;
	}
	
	/**
	 * Removes the data at top of stack and returns it
	 * @return returns the data at the top of stack
	 */
	public<T extends Comparable<T>> T pop() {
		if(top != null) {
			LinkedList.Node topBeforePop = top;
			stack.pop();
			top = stack.getHead();
			return (T)topBeforePop.getData();
		}
		System.out.println("The stack is empty. Returning null");
		return null;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(40);
		stack.push(5);
		stack.printStack();
		System.out.println("The element at top is " + stack.peek());
		stack.pop();
		System.out.println("The top element after pop is " + stack.peek());
		stack.printStack();
	}
}