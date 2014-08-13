package com.kiyoos.algos.sorting.test;

import static com.kiyoos.algos.Utility.createArray;
import static com.kiyoos.algos.Utility.print;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.kiyoos.algos.Partitioning;
import com.kiyoos.algos.sorting.BubbleSort;
import com.kiyoos.algos.sorting.CombBubbleSort;
import com.kiyoos.algos.sorting.InsertionSort;
import com.kiyoos.algos.sorting.SelectionSort;

public class SortingTest {

	private static int[] integerArray;

	private static int[] sortedArray;

	@BeforeClass
	public static void init() {
		int arrayLength = 100;

		integerArray = createArray(arrayLength, false);

		sortedArray = integerArray.clone();
		Arrays.sort(sortedArray);
		// integerArray = sortedArray;

	}

	@Test
	public void testPartitioning() {
		System.out.println("\n\nStarting Partitioning Test");

		int[] integerArray = this.integerArray.clone();

		print(integerArray, "Input to partition: ");
		System.out.println("PartitionPos: "
				+ Partitioning.partiionArray(integerArray));
		print(integerArray, "Output from Partition: ");

	}

	@Test
	public void testInsertionSort() {

		System.out.println("\n\nStarting Insertion Test");

		int[] integerArray = this.integerArray.clone();

		print(integerArray, null);
		long startTime = System.nanoTime();
		new InsertionSort().sort(integerArray);
		long endTime = System.nanoTime();
		print(integerArray, null);

		System.out.println("time taken (nano-s): "
				+ ((endTime - startTime) / 1000) + "K");
		Assert.assertArrayEquals(sortedArray, integerArray);
	}

	@Test
	public void testSelectionSort() {

		System.out.println("\n\nStarting SelectionSort Test");

		int[] integerArray = this.integerArray.clone();

		print(integerArray, null);
		long startTime = System.nanoTime();
		new SelectionSort().sort(integerArray);
		long endTime = System.nanoTime();
		print(integerArray, null);

		System.out.println("time taken (nano-s): "
				+ ((endTime - startTime) / 1000) + "K");
		Assert.assertArrayEquals(sortedArray, integerArray);
	}

	@Test
	public void testBubbleSort() {

		System.out.println("\n\nStarting BubbleSort Test");

		int[] integerArray = this.integerArray.clone();

		print(integerArray, null);
		long startTime = System.nanoTime();
		new BubbleSort().sort(integerArray);
		long endTime = System.nanoTime();
		print(integerArray, null);
		System.out.println("time taken (nano-s): "
				+ ((endTime - startTime) / 1000) + "K");

		Assert.assertArrayEquals(sortedArray, integerArray);
	}

	@Test
	public void testCombBubbleSort() {

		System.out.println("\n\nStarting Comb Bubble Sort Test");

		int[] integerArray = this.integerArray.clone();

		print(integerArray, null);
		long startTime = System.nanoTime();
		new CombBubbleSort().sort(integerArray);
		long endTime = System.nanoTime();
		print(integerArray, null);
		System.out.println("time taken (nano-s): "
				+ ((endTime - startTime) / 1000) + "K");

		Assert.assertArrayEquals(sortedArray, integerArray);
	}

}
