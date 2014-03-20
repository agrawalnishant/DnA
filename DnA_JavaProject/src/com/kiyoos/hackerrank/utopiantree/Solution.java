package com.kiyoos.hackerrank.utopiantree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	private static final String REGEX = "\\d+";

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<Integer>();
		int length = 1;

		Integer testCases = 0;

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
				testCases = Integer.parseInt(m.group());
			}

			int count = 0;
			while (count++ < testCases) {
				
				input = reader.readLine();

				m = p.matcher(input);

				if (m.find()) {
					numbers.add(Integer.parseInt(m.group()));
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isMonsoon = true;
		//System.out.println(numbers);

		for (Integer cycle : numbers) {
			length = 1;
			isMonsoon = true;
			//System.out.println("cycle: " + cycle);

			int growthCycle = cycle;
			while (growthCycle-- > 0) {
				if (isMonsoon)
					length *= 2;
				else
					length += 1;

				isMonsoon = !isMonsoon;
			}

			System.out.println(length);

		}

		

	}
	
	
	
	
}