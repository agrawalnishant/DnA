package com.kiyoos.algos.sorting;

import static com.kiyoos.algos.Utility.swap;

public class CombBubbleSort extends BubbleSort {

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
	@Override
	public void sort(int[] sourceArray) {
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
