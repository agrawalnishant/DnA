package com.kiyoos.algos;

import com.kiyoos.ds.IntegerStack;

public class TowerOfHanoi {
	private static int moveCounter;

	private static IntegerStack source = new IntegerStack(10, "SOURCE");
	private static IntegerStack intermediate = new IntegerStack(10, "INTERMEDIATE");;
	private static IntegerStack destination = new IntegerStack(10, "DESTINATION");;

	public static void main(String[] args) {
		TowerOfHanoi.init();
		TowerOfHanoi.move(source.getStackSize(), source, intermediate, destination);
		TowerOfHanoi.showTotalMoves();
	}

	public static void init() {
		source.push('J');
		source.push('I');
		source.push('H');
		source.push('G');
		source.push('F');
		source.push('E');
		source.push('D');
		source.push('C');
		source.push('B');
		source.push('A');

	}
	
	public static void showTotalMoves(){
		System.out.println("Total moves: " + moveCounter);
	}

	public static void move(int top, IntegerStack source, IntegerStack intermediate, IntegerStack destination) {
		++moveCounter;
		if (top == 1) {
			destination.push(source.pop());
		} else {
			//Move n-1 tree from source to intermediate.
			move(top - 1, source, destination, intermediate);
			
			// Move nth element from source to destination.
			destination.push(source.pop());
			
			//Move n-1 tree from intermediate to destination.
			move(top - 1, intermediate, source, destination);
		}
	}
}
