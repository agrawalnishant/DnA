package com.kiyoos.algos.sorting;

import static com.kiyoos.ds.arrays.Utility.print;
import static com.kiyoos.ds.arrays.Utility.swap;

public class ArraySorter {

	public static void selectionSort(int[] sourceArray) {
		
		int arrayLen = sourceArray.length;
		int maxArrayIndex = arrayLen - 1;
		for (int outCounter = 0; outCounter < maxArrayIndex; outCounter++) {

			int minPos = outCounter;

			for (int inCounter = outCounter + 1; inCounter < arrayLen; inCounter++) {
				if (sourceArray[minPos] > sourceArray[inCounter]) {
					minPos = inCounter;
				}

			}
			System.out.println("Swapping sourceArray[" + outCounter + "] = " + sourceArray[outCounter] + " and sourceArray[" + minPos
					+ "] = " + sourceArray[minPos]);

			swap(sourceArray, outCounter, minPos);
			print(sourceArray);
		}

	}


	public static void bubbleSort(int[] sourceArray) {
		int arrayLen = sourceArray.length;
		int maxArrayIndex = arrayLen - 1;
		for (int outCounter = maxArrayIndex; outCounter > 1; outCounter--) {

			for (int inCounter = 0; inCounter < outCounter; inCounter++) {

				if (sourceArray[inCounter] > sourceArray[inCounter + 1]) {
					System.out
							.println("----------".substring(0, maxArrayIndex - outCounter + 1) + "Swapping sourceArray[" + inCounter
									+ "] = " + sourceArray[inCounter] + " and sourceArray[" + (inCounter + 1) + "] = "
									+ sourceArray[inCounter + 1]);
					swap(sourceArray, inCounter, inCounter + 1);
				}

			}
			print(sourceArray);

		}

	}
}
