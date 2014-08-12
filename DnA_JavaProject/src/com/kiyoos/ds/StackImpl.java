package com.kiyoos.ds;

public class StackImpl<T> implements Stack<T> {

	private final Object[] backingArray;
	private int top;
	
	
	public static void main(String[] args) {
		Stack<Integer> intSt = new StackImpl<>(5);
		System.out.println("isEmpty: " + (intSt.isEmpty()));
		intSt.push(1);
		intSt.push(2);
		intSt.push(3);
		intSt.push(4);
		intSt.push(5);
		System.out.println(intSt);
		System.out.println(intSt.pop());

		System.out.println("isFull: " + intSt.isFull());
		System.out.println("isEmpty: " + (intSt.isEmpty()));
		
		System.out.println(intSt);
		intSt.push(5);
		System.out.println(intSt);
		System.out.println("isFull: " + intSt.isFull());
		
	}

	public StackImpl(int size) {
		backingArray = new Object[size];
	}

	@Override
	public void push(T t) {
		if (!isFull()) {
			backingArray[top++] = t;
		}

	}

	@Override
	public T pop() {
		T t = null;
		if (!isEmpty()) {
			t = (T) backingArray[--top];
			backingArray[top] = null;
		}

		return t;
	}

	@Override
	public boolean isEmpty() {
		return (top == 0);
	}

	@Override
	public boolean isFull() {
		return (top == backingArray.length);
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for(int counter = 1; counter <= backingArray.length; counter++){
			stringBuilder.append("," + backingArray[counter-1]);
		}
		
		return stringBuilder.toString();
	}	

}
