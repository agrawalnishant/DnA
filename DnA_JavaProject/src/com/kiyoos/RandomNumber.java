package com.kiyoos;

public class RandomNumber {

	public static void main(String[] args) {
		int value = new Double(Math.pow(2, 31)).intValue()- new Double(Math.pow(2, 30)).intValue();
		System.out.println(0xFF000000);
		System.out.println(Long.toBinaryString(231));
		System.out.println(Long.toBinaryString(value >>> 16));
		System.out.println(Long.toBinaryString(value & 0xFF00FF00));
		System.out.println(Long.toBinaryString(value & 0xF0F0F0F0));
		System.out.println(Long.toBinaryString(value & 0xCCCCCCCC));
		System.out.println(Long.toBinaryString(value & 0xAAAAAAAA));

		System.out.println(32 - RandomNumber.numberOfLeadingZeros(value));
		
		System.out.println(RandomNumber.NumberOfSetBits(new Double(Math.pow(2, 4)).intValue() +1));

	}

	public static int numberOfLeadingZeros(int i) {
		// HD, Figure 5-6
		if (i == 0)
			return 32;
		int n = 1;
		if (i >>> 16 == 0) {
			n += 16;
			i <<= 16;
		}
		if (i >>> 24 == 0) {
			n += 8;
			i <<= 8;
		}
		if (i >>> 28 == 0) {
			n += 4;
			i <<= 4;
		}
		if (i >>> 30 == 0) {
			n += 2;
			i <<= 2;
		}
		n -= i >>> 31;
		return n;
	}
	
	
	public static int NumberOfSetBits(int i)
	{
	    i = i - ((i >> 1) & 0x55555555);
	    i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
	    return (((i + (i >> 4)) & 0x0F0F0F0F) * 0x01010101) >> 24;
	}

}
