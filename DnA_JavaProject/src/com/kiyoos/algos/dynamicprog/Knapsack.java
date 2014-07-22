package com.kiyoos.algos.dynamicprog;

public class Knapsack {

	public static void main(String[] args) {
		int maxWeight = 30;
		Element[] elements = { new Element(2, 10), new Element(3, 20),
				new Element(5, 25), new Element(7, 30), new Element(8, 40) };
		
	}
}

class Element {
	private int weight;

	private int value;

	public Element(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
