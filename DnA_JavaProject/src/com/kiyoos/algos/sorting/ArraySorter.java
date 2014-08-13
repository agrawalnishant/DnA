package com.kiyoos.algos.sorting;

import static com.kiyoos.algos.Utility.swap;

public class ArraySorter {

	public static void insertionSort(int[] sourceArray) {
		int arrayLen = sourceArray.length;

		for (int outCounter = 1; outCounter < arrayLen; outCounter++) {

			int temp = sourceArray[outCounter];
			int inCounter = outCounter - 1;

			// Iterate inward while moving larger elements outward to sort in ASC order.
			while (inCounter >= 0 && sourceArray[inCounter] > temp) {
				sourceArray[inCounter + 1] = sourceArray[inCounter];
				--inCounter;
			}
			sourceArray[inCounter + 1] = temp;
			// print(sourceArray, null);
		}
	}

	public static void selectionSort(int[] sourceArray) {

		int arrayLen = sourceArray.length;
		int maxArrayIndex = arrayLen - 1;
		for (int outCounter = 0; outCounter < maxArrayIndex; outCounter++) {

			int minPos = outCounter;

			// Find the Minimum ( or Maximum) in remaining positions, and bring it to front by swapping.
			for (int inCounter = outCounter + 1; inCounter < arrayLen; inCounter++) {
				if (sourceArray[minPos] > sourceArray[inCounter]) {
					minPos = inCounter;
				}

			}
			// System.out.println("Swapping sourceArray[" + outCounter + "] = "
			// + sourceArray[outCounter] + " and sourceArray[" + minPos + "] = "
			// + sourceArray[minPos]);

			swap(sourceArray, outCounter, minPos);
			// print(sourceArray, null);
		}

	}

	public static void bubbleSort(int[] sourceArray) {
		int arrayLen = sourceArray.length;
		int maxArrayIndex = arrayLen - 1;

		
		// Keep swapping successive elements to bubble-up maximum / minimum, to top.
		for (int outCounter = arrayLen - 1; outCounter > 0; outCounter--) {

			for (int inCounter = 0; inCounter < outCounter; inCounter++) {

				if (sourceArray[inCounter] > sourceArray[inCounter + 1]) {
					
					swap(sourceArray, inCounter, inCounter + 1);
				}

			}
			// print(sourceArray, null);

		}

	}

	/*
	 * The basic idea is to eliminate turtles, or small values near the end of
	 * the list, since in a bubble sort these slow the sorting down
	 * tremendously. Rabbits, large values around the beginning of the list, do
	 * not pose a problem in bubble sort. In bubble sort, when any two elements
	 * are compared, they always have a gap (distance from each other) of 1. The
	 * basic idea of comb sort is that the gap can be much more than 1 (Shell
	 * sort is also based on this idea, but it is a modification of insertion
	 * sort rather than bubble sort).
	 */
	public static void combSort(int[] sourceArray) {
		int arrayLen = sourceArray.length;
		int maxArrayIndex = arrayLen - 1;
		int gap = arrayLen;
		float shrinkFactor = 1.3f;

		boolean swapped = false;

		while (gap > 1 || swapped == true) {
			gap = new Float(gap / shrinkFactor).intValue();
			if (gap < 1)
				gap = 1;
			swapped = false;

			for (int counter = 0; counter + gap < arrayLen; counter++) {
				if (sourceArray[counter] > sourceArray[counter + gap]) {
					swap(sourceArray, counter, counter + gap);
					swapped = true;
				}
			}

		}

	}

}
