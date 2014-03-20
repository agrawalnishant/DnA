package com.kiyoos.hackerrank.sorting.insertion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	private static final String REGEX = "\\d+";

	public static void main(String[] args) {
		int count = 0;

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Pattern p = Pattern.compile(REGEX);
		Matcher m;
		try {

			String input = reader.readLine();

			m = p.matcher(input);
			if (m.find()) {
				count = Integer.parseInt(m.group());
			}
			int counter = 0;
			input = reader.readLine();
			String[] strArr = input.split(" ");
			int[] srcArr = new int[count];

			for (String str : strArr) {
				srcArr[counter++] = Integer.valueOf(str);
			}
			insertionSort(srcArr, count);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void insertionSort(int[] srcArr, int count) {

		//print(srcArr);
		for (int outerCounter = 1; outerCounter < count; outerCounter++) {
			int currentNum = srcArr[outerCounter];

			int innerCounter = outerCounter - 1;
			boolean switched = false;
			while (innerCounter >= 0 && srcArr[innerCounter] > currentNum) {
				srcArr[innerCounter + 1] = srcArr[innerCounter--];
				switched = true;
			}
			
			if (switched) {
				srcArr[innerCounter + 1] = currentNum;
			}
			print(srcArr);

		}

	}

	private static void print(int[] intArr) {
		
		for (int num : intArr) {
			System.out.print(num + " ");
		}
		System.out.println("");
	}

}