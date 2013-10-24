package com.kiyoos.ds.arrays;

import static com.kiyoos.ds.arrays.Utility.createArray;


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
		int[] integerArray = createArray( arrayLength, true);
		int randomIndex = new Double(Math.random() * (1.0 * arrayLength)).intValue();
		int targetNum = integerArray[randomIndex];
		
		System.out.println("target pos: " + randomIndex + ", num: " + targetNum);
		
		System.out.println("searched pos: " + sample.binSearch(integerArray, targetNum, 0, arrayLength - 1));

	}

}
