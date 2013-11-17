package com.kiyoos.ds;

import static com.kiyoos.algos.Utility.swap;

import java.util.Arrays;

public class Heap {

	private final int[] srcArray;
	public int[] getSrcArray() {
		return srcArray;
	}

	//private int size;
	private int heapSize;

	public Heap(int[] arr) {
		this.srcArray = arr;
		//this.size = srcArray.length;
		heapSize = srcArray.length;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] testArray = new int[] { 8, 7, 1, 0, 12, 678, 45, 98, 11, 35 };
		Heap heap = new Heap(testArray);
		heap.buildMaxHeap();
		System.out.println("Max is: " + testArray[0] + " in " + Arrays.toString(testArray));

	}

	public void buildMaxHeap() {
		System.out.println("Building max heap from array: " + Arrays.toString(srcArray));
		int size = srcArray.length;
		int start = (size / 2) - 1;
		for (int count = start; count >= 0; count--) {
			maxHeapify(count);
		}

	}

	/**
	 * This maintains max-heap property. It is assumed that heaps on left and
	 * right of input are already max-heaps.
	 * 
	 * @param srcArray
	 * @param indexInArr
	 */
	public void maxHeapify(int indexInArr) {

		System.out.println("Max-heapifying array: " + Arrays.toString(srcArray) + " at pos: " + indexInArr);
		int leftIndex = 2 * indexInArr + 1;
		int rightIndex = 2 * indexInArr + 2;
	//	int size = srcArray.length;

		if (indexInArr >= heapSize - 1)
			return;
		int largest = indexInArr;
		int currentValue = srcArray[indexInArr];

		if (leftIndex > 0 && leftIndex <= heapSize - 1) {
			int valueAtLeft = srcArray[leftIndex];

			if (valueAtLeft > currentValue) {

				largest = leftIndex;
			}
		}

		if (rightIndex > 0 && rightIndex <= heapSize - 1) {
			int valueAtRight = srcArray[rightIndex];

			if (valueAtRight > srcArray[largest]) {
				largest = rightIndex;
			}
		}

		if (largest != indexInArr) {
			System.out.println("Swapping " + srcArray[indexInArr] + " with " + srcArray[largest]);
			swap(srcArray, indexInArr, largest);
			maxHeapify(largest);
		}
	}

	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}
}
