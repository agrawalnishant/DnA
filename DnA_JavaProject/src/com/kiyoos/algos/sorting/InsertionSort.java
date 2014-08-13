package com.kiyoos.algos.sorting;

public class InsertionSort implements SortingAlgo {

	@Override
	public void sort(int[] sourceArray) {
		int arrayLen = sourceArray.length;

		for (int outCounter = 1; outCounter < arrayLen; outCounter++) {

			int temp = sourceArray[outCounter];
			int inCounter = outCounter - 1;

			// Iterate inward while moving larger elements outward to sort in
			// ASC order.
			while (inCounter >= 0 && sourceArray[inCounter] > temp) {
				sourceArray[inCounter + 1] = sourceArray[inCounter];
				--inCounter;
			}
			sourceArray[inCounter + 1] = temp;
			// print(sourceArray, null);
		}
	}

}
