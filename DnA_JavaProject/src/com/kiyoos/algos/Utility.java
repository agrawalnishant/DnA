package com.kiyoos.algos;

import java.util.Arrays;
import java.util.Random;

import com.kiyoos.algos.sorting.ArraySorter;

public class Utility {

	public static int selectPivot(int[] inputArray) {

		int length = inputArray.length;
		String msg = "";
		int pivot = -1;
		int middle = length / 2;

		if (length > 3) {
			int[] mdnArr = new int[] { inputArray[0], inputArray[middle], inputArray[(length - 1)] };
			pivot = medianOfThree(mdnArr);
			msg += ("Median of " + Arrays.toString(mdnArr) + " is " + pivot);

		} else {
			pivot = inputArray[middle];
			msg += ("Using middle element as pivot " + pivot);

		}
		System.out.println(msg);
		return pivot;
	}

	/**
	 * Return median of 3 elements to be used a pivot in Partitioning /
	 * quicksort. Refer to small_sorting.ps at
	 * http://www.google.co.in/url?sa=t&rct
	 * =j&q=&esrc=s&source=web&cd=4&cad=rja&ved
	 * =0CDwQFjAD&url=http%3A%2F%2Fwww.cs
	 * .princeton.edu%2F~rwerneck%2Fdocs%2FRW00
	 * .ps.gz&ei=rfJsUp-FJYn7rAf__YFI&usg
	 * =AFQjCNE-VBAzupn1g84MaZ0WF3Gt39FCgQ&bvm=bv.55123115,d.bmk
	 * 
	 * @param inputArray
	 * @return
	 */
	private static int medianOfThree(int[] inputArray) {
		System.out.println("Median ");
		ArraySorter.insertionSort(inputArray);
		return inputArray[1];

	}

	/**
	 * Returns random position in that array.
	 * 
	 * @param targetArray
	 * @param length
	 * @param isSorted
	 * @return
	 */
	public static int[] createArray(int length, boolean isSorted) {

		int[] targetArray = new int[length];
		Random gen = new Random();

		while (length > 0) {

			int tmpNum = gen.nextInt(1000);
			// if(Arrays.asList(targetArray).contains(tmpNum))
			targetArray[--length] = tmpNum;

		}
		if (isSorted) {
			Arrays.sort(targetArray);
		}

		return targetArray;// new Double(Math.random() * (1.0 *
							// targetArray.length)).intValue();

	}

	/**
	 * Swap 2 elements of an array. Most modern compilers can optimize away the
	 * temporary variable in the naive swap, in which case the naive swap uses
	 * the same amount of memory and the same number of registers as the XOR
	 * swap and is at least as fast, and often faster. The XOR swap is also much
	 * less readable and completely opaque to anyone unfamiliar with the
	 * technique.
	 * 
	 * On modern CPU architectures, the XOR technique is considerably slower
	 * than using a temporary variable to do swapping. One reason is that modern
	 * CPUs strive to execute instructions in parallel via instruction
	 * pipelines. In the XOR technique, the inputs to each operation depend on
	 * the results of the previous operation, so they must be executed in
	 * strictly sequential order. If efficiency is of tremendous concern, it is
	 * advised to test the speeds of both the XOR technique and temporary
	 * variable swapping on the target architecture.
	 * 
	 * @param sourceArray
	 * @param index1
	 * @param index2
	 */
	public static void swap(final int[] sourceArray, int index1, int index2) {
		int tmpValue = sourceArray[index1];
		sourceArray[index1] = sourceArray[index2];
		sourceArray[index2] = tmpValue;
	}

	public static void main(String[] args) {
		/*
		 * int arrayLen = 50; System.out.println("Sorted:  ");
		 * System.out.println(Utility.createArray(arrayLen, true));
		 * 
		 * System.out.println("Not sorted: ");
		 * System.out.println(Utility.createArray(arrayLen, false));
		 */

		// System.out.println("{8,0,100} : " + selectPivot(new int[] { 8, 0, 100
		// }));
		// System.out.println("8,0,100,289,17} : " + selectPivot(new int[] { 8,
		// 0, 100, 289, 17 }));
	}

	public static void print(int[] integerArray, String msg) {
		msg = (msg == null ? "" : msg);
		System.out.println(msg + "\t" + Arrays.toString(integerArray));

	}

}
