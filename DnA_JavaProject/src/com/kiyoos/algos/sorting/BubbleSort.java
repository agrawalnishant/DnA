package com.kiyoos.algos.sorting;

import static com.kiyoos.algos.Utility.swap;

public class BubbleSort implements SortingAlgo {

	@Override
	public void sort(int[] sourceArray) {
		int arrayLen = sourceArray.length;
		int maxArrayIndex = arrayLen - 1;

		// Keep swapping successive elements to bubble-up maximum / minimum, to
		// top.
		for (int outCounter = arrayLen - 1; outCounter > 0; outCounter--) {

			for (int inCounter = 0; inCounter < outCounter; inCounter++) {

				if (sourceArray[inCounter] > sourceArray[inCounter + 1]) {

					swap(sourceArray, inCounter, inCounter + 1);
				}

			}
			// print(sourceArray, null);

		}
	}
}
