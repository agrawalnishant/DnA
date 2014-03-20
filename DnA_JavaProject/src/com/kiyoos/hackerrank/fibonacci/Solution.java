package com.kiyoos.hackerrank.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	private static final String REGEX = "\\d+";

	private static final BigDecimal SQRT_DIG = new BigDecimal(50);
	private static final BigDecimal SQRT_PRE = new BigDecimal(10).pow(SQRT_DIG.intValue());

	private final static double EPSILON = 0.00000000001;

	public static void main(String[] args) {
		List<Long> numbers = new LinkedList<Long>();
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
					numbers.add(Long.parseLong(m.group()));
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Long num : numbers) {

			System.out.println(isFibonacci(num));

		}

	}

	private static String isFibonacci(Long num) {
		boolean isFIb = false;

		BigDecimal firstSquare = BigDecimal.valueOf(5).multiply(BigDecimal.valueOf(num)).multiply(BigDecimal.valueOf(num)).subtract(BigDecimal.valueOf(4));

		Double sqrt = bigSqrt(firstSquare).doubleValue();
		//System.out.println("SQRT of " + firstSquare + " is " + sqrt.doubleValue());
		if (Math.abs(sqrt - sqrt.longValue()) == 0.0d) {
			return "IsFibo";
		} else {

			BigDecimal secondSquare = BigDecimal.valueOf(5).multiply(BigDecimal.valueOf(num)).multiply(BigDecimal.valueOf(num)).add(BigDecimal.valueOf(4));
			sqrt = bigSqrt(secondSquare).doubleValue();

			//System.out.println("SQRT of " + secondSquare + " is " + sqrt.doubleValue());
			if (Math.abs(sqrt - sqrt.longValue()) == 0.0d) {
				return "IsFibo";
			}
			//MathContext m = new MathContext(10);
		
		}

		return "IsNotFibo";

	}

	private static BigDecimal sqrtNewtonRaphson(BigDecimal c, BigDecimal xn, BigDecimal precision) {
		//System.out.println("c: " + c + ",xn: " + xn + ", precision: " + precision);
		BigDecimal fx = xn.pow(2).add(c.negate());
		BigDecimal fpx = xn.multiply(new BigDecimal(2));
		BigDecimal xn1 = fx.divide(fpx, 2 * SQRT_DIG.intValue(), RoundingMode.HALF_UP);
		xn1 = xn.add(xn1.negate());
		BigDecimal currentSquare = xn1.pow(2);
		BigDecimal currentPrecision = currentSquare.subtract(c);
		currentPrecision = currentPrecision.abs();
		if (currentPrecision.compareTo(precision) <= -1) {
			return xn1;
		}
		return sqrtNewtonRaphson(c, xn1, precision);
	}

	public static BigDecimal bigSqrt(BigDecimal c) {
		return sqrtNewtonRaphson(c, new BigDecimal(1), new BigDecimal(1).divide(SQRT_PRE));
	}

}