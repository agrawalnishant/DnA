package com.kiyoos.ds;

public class IntegerStack {

	private final int[] stackArray;
	private final int stackSize;
	private int top;

	public IntegerStack(int size) {
		this.stackSize = size;
		this.stackArray = new int[this.stackSize];
		top = -1;
	}

	public void push(int element) {

		stackArray[++top] = element;
	}

	public int pop() {

		return stackArray[top--];

	}

	public int peek() {
		return stackArray[top];
	}

	public boolean isFull() {
		return (top == stackSize - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public static void main(String[] args) {
		IntegerStack stack = new IntegerStack(5);
		stack.push('5');
		stack.push('*');
		stack.push('(');
		stack.push('+');
		stack.push(')');

		while (!stack.isEmpty()) {
			System.out.println((char)stack.pop());
		}
		
	}

}
