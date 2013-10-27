package com.kiyoos.algos;

public class AnagramPermutations {

	private char[] charArray;
	private int length;

	public AnagramPermutations(String input) {
		charArray = input.toCharArray();
		length = input.length();
	}

	public static void main(String[] args) {
		String input = "cats";
		AnagramPermutations anagramPermutations = new AnagramPermutations(input);
		anagramPermutations.doAnagrams(input.length());
	}

	public void doAnagrams(int newLen) {
		if (newLen == 1) {

			return;
		}
		System.out.println("");
		for (int rotationCounter = 0; rotationCounter < newLen; rotationCounter++) {
			doAnagrams(newLen - 1);

			if (newLen == 2) {
				display();
			}

			rotate(newLen);
		}

	}

	private void display() {
		System.out.print(", ");
		for (char c : charArray) {
			System.out.print(c);
		}

	}

	private void rotate(int newLen) {
		int pos = length - newLen;
		char tmp = charArray[pos];
		int counter = 0;

		for (counter = pos; counter < length - 1; counter++) {
			charArray[counter] = charArray[counter + 1];
		}
		charArray[counter] = tmp;
	}

}
