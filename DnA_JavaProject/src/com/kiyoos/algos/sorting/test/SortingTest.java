package com.kiyoos.algos.sorting.test;

import static com.kiyoos.ds.arrays.Utility.createArray;
import static com.kiyoos.ds.arrays.Utility.print;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.kiyoos.algos.sorting.ArraySorter;

public class SortingTest {

	private static int[] integerArray;

	private static int[] sortedArray;

	@BeforeClass
	public static void init() {
		int arrayLength = 10;

		integerArray = createArray(arrayLength, false);

		sortedArray = integerArray.clone();
		Arrays.sort(sortedArray);

	}

	@Test
	public void testSelectionSort() {

		System.out.println("\n\nStarting SelectionSort Test");

		int[] integerArray = this.integerArray.clone();

		print(integerArray);
		long startTime = System.nanoTime();
		ArraySorter.selectionSort(integerArray);
		long endTime = System.nanoTime();
		print(integerArray);

		System.out.println("time taken (nano-s/1000): " + ((endTime - startTime) / 1000));
		Assert.assertArrayEquals(integerArray, sortedArray);
	}

	@Test
	public void testBubbleSort() {

		System.out.println("\n\nStarting BubbleSort Test");

		int[] integerArray = this.integerArray.clone();

		print(integerArray);
		long startTime = System.nanoTime();
		ArraySorter.bubbleSort(integerArray);
		long endTime = System.nanoTime();
		print(integerArray);
		System.out.println("time taken (nano-s/1000): " + ((endTime - startTime) / 1000));

		Assert.assertArrayEquals(integerArray, sortedArray);
	}

}
