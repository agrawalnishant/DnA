package com.kiyoos.algos.sorting;

import static com.kiyoos.ds.arrays.Utility.swap;

public class ArraySorter {

	public static void insertionSort(int[] sourceArray) {
		int arrayLen = sourceArray.length;

		for (int outCounter = 1; outCounter < arrayLen; outCounter++) {

			int temp = sourceArray[outCounter];

			int inCounter = outCounter - 1;

			while (inCounter >= 0 && sourceArray[inCounter] > temp) {
				sourceArray[inCounter + 1] = sourceArray[inCounter];
				--inCounter;
			}
			sourceArray[inCounter + 1] = temp;
			//print(sourceArray, null);
		}
	}

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
		//	System.out.println("Swapping sourceArray[" + outCounter + "] = " + sourceArray[outCounter] + " and sourceArray[" + minPos + "] = " + sourceArray[minPos]);

			swap(sourceArray, outCounter, minPos);
			//print(sourceArray, null);
		}

	}

	public static void bubbleSort(int[] sourceArray) {
		int arrayLen = sourceArray.length;
		int maxArrayIndex = arrayLen - 1;

		for (int outCounter = arrayLen - 1; outCounter > 0; outCounter--) {

			for (int inCounter = 0; inCounter < outCounter; inCounter++) {

				if (sourceArray[inCounter] > sourceArray[inCounter + 1]) {
				//	System.out.println("----------".substring(0, maxArrayIndex - outCounter + 1) + "Swapping sourceArray[" + inCounter + "] = " + sourceArray[inCounter] + " and sourceArray[" + (inCounter + 1) + "] = " + sourceArray[inCounter + 1]);
					swap(sourceArray, inCounter, inCounter + 1);
				}

			}
		//	print(sourceArray, null);

		}

	}
}
