package com.kiyoos.ds;

public class CircularIntQueue {

	private int[] qArr;
	private int qLen;
	private int capacity;
	private int head;
	private int tail;

	public CircularIntQueue(int size) {
		capacity = size;
		qArr = new int[capacity];
		qLen = 0;
		head = 0;
		tail = -1;
	}

	public boolean add(int elem) {
		if (qLen == capacity)
			return false;

		if (tail == capacity - 1) {
			tail = -1;
			qArr[++tail] = elem;

		} else {
			qArr[++tail] = elem;
		}
		++qLen;
		return true;

	}

	public int remove() {
		if (qLen <= 0){
			//head = tail;
			return -1;
		}
		int tmp = qArr[head];
		qArr[head++] = ' ';
		if (head == capacity) {
			head = 0;

		} else if (qLen == 0) {
			head = tail;
		}
		--qLen;

		return tmp;
	}

	public String display() {
		String qContents = "";
		System.out.println("\nHead:" + head + ",tail: " + tail + ", qLength: " + qLen);
		int tmpQLen = qLen;
		int pos = head;

		if (qLen <= 0)
			return qContents;
		while (tmpQLen-- > 0) {
			qContents += ("," +(char) qArr[pos++]);

			if (pos >= capacity ) {
				pos = 0;
			}
		}
		System.out.println(qContents);
		return qContents;

	}
}
