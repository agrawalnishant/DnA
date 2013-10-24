package com.kiyoos.algos;

import java.util.Arrays;
import java.util.Random;

public class Utility {

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


		return targetArray ;//new Double(Math.random() * (1.0 * targetArray.length)).intValue();

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
		int arrayLen = 50;
		System.out.println("Sorted:  ");
		System.out.println(Utility.createArray(arrayLen, true));

		System.out.println("Not sorted: ");
		System.out.println(Utility.createArray(arrayLen, false));
	}

	public static void print(int[] integerArray, String msg) {
		msg = (msg == null ? "" : msg); 
		System.out.println(msg + "\t" + Arrays.toString(integerArray));

	}

}
