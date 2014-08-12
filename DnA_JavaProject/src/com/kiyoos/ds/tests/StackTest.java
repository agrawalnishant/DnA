package com.kiyoos.ds.tests;

import org.junit.Assert;
import org.junit.Test;

import com.kiyoos.ds.Stack;
import com.kiyoos.ds.StackImpl;

public class StackTest {

	@Test
	public void testPush() {
		Stack<Integer> integerStack = new StackImpl<>(5);
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		Assert.assertTrue(integerStack.toString().equals(",1,2,3,4,null"));

	}

	@Test
	public void testPop() {
		Stack<Integer> integerStack = new StackImpl<>(5);
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		Assert.assertTrue(integerStack.pop().equals(4));
		Assert.assertTrue(integerStack.toString().equals(",1,2,3,null,null"));
	}

	@Test
	public void testIsEmpty() {
		Stack<Integer> integerStack = new StackImpl<>(5);
		Assert.assertTrue(integerStack.isEmpty());
	}

	@Test
	public void testIsFull() {

		Stack<Integer> integerStack = new StackImpl<>(1);
		integerStack.push(1);
		Assert.assertTrue(integerStack.isFull());
	}

}
