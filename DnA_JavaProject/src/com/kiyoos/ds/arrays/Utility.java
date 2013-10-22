package com.kiyoos.ds.arrays;

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
	public static int createArray(int[] targetArray, int length, boolean isSorted) {

		Random gen = new Random();

		while (length > 0) {

			int tmpNum = gen.nextInt(1000);
			//if(Arrays.asList(targetArray).contains(tmpNum))
			targetArray[--length] = tmpNum;

		}
		if (isSorted) {
			Arrays.sort(targetArray);
		}

		System.out.println(Arrays.toString(targetArray));

		return new Double(Math.random() * (1.0 * targetArray.length)).intValue();

	}

	public static void main(String[] args) {
		int arrayLen = 50;
		int[] intArray = new int[arrayLen];
		System.out.println("Sorted:  ");
		System.out.println(Utility.createArray(intArray, arrayLen, true));

		System.out.println("Not sorted: ");
		System.out.println(+Utility.createArray(intArray, arrayLen, false));
	}

}
