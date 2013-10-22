package com.kiyoos.ds.arrays;


public class BinarySearchSample {

	public int binSearch(int[] inputArray, int num, int startPos, int endPos) {

		System.out.println("Num: " + num + ", start: " + startPos + ", end: " + endPos);
		int midpos = (startPos + endPos) / 2;

		int start = inputArray[startPos];
		int end = inputArray[endPos];
		int mid = inputArray[midpos];

		if (num < inputArray[startPos] || num > inputArray[endPos] || startPos == endPos) {
			return -1;
		} else if (num == start)
			return startPos;
		else if (num == end)
			return endPos;
		else if (num == mid)
			return midpos;

		System.out.println("Mid: " + midpos + ", Num at mid: " + mid);

		if (num < mid) {
			return binSearch(inputArray, num, startPos, midpos);

		} else {
			return binSearch(inputArray, num, midpos, endPos);

		}
	}

	public static void main(String[] args) {
		BinarySearchSample sample = new BinarySearchSample();
		
		int arrayLength = 100;
		int[] integerArray = new int[arrayLength];
		int targetPos = Utility.createArray(integerArray, arrayLength, true);
		int targetNum = integerArray[targetPos];
		System.out.println("target pos: " + targetPos + ", num: " + targetNum);
		System.out.println("searched pos: " + sample.binSearch(integerArray, targetNum, 0, arrayLength - 1));

	}

}
