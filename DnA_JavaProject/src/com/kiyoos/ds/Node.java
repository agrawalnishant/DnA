package com.kiyoos.ds;

/**
 * Node of a tree.
 * 
 * @author _root_nishi
 * 
 */
public class Node {

	private int id;
	private Object data;
	private Node leftNode;
	private Node rightNode;
	private Node parent;

	public Node(int id, Object data, Node parent) {
		this.id = id;
		this.data = data;
		this.parent = parent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node left() {
		return leftNode;
	}

	public void setLeft(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node right() {
		return rightNode;
	}

	public void setRight(Node rightNode) {
		this.rightNode = rightNode;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

}
