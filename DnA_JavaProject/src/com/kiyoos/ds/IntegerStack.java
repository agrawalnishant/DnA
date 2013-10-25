package com.kiyoos.ds;

public class IntegerStack {

	private final int[] stackArray;
	private final int stackSize;

	private int top;
	private String name;

	public IntegerStack(int size, String name) {
		this.stackSize = size;
		this.stackArray = new int[this.stackSize];
		top = -1;
		this.name = name;
	}

	public int getStackSize() {
		return stackSize;
	}

	public void push(int element) {

		stackArray[++top] = element;
		System.out.println("PUSH:" + ((char)element )+ " in "+ this.name + "-->");
		for (int pos = top; pos >= 0; pos--) {
			System.out.println((char) stackArray[pos]);
			// + Arrays.toString(stackArray).replaceAll(",", "\n"));
		}
	}

	public int pop() {
		int popped = stackArray[top];
		stackArray[top--] = -1;
		System.out.println("POP:" + ((char)popped) + " from "+ this.name + "-->");
		for (int pos = top; pos >= 0; pos--) {
			System.out.println((char) stackArray[pos]);
		}
		// + Arrays.toString(stackArray).replaceAll(",", "\n"));
		return popped;

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
		IntegerStack stack = new IntegerStack(5, "Main");
		stack.push('5');
		stack.push('*');
		stack.push('(');
		stack.push('+');
		stack.push(')');

		while (!stack.isEmpty()) {
			System.out.println((char) stack.pop());
		}

	}

}
