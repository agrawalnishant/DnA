package com.kiyoos.ds.tree;

/**
 * Node of a tree.
 * 
 * @author _root_nishi
 * 
 */
public class Node {

	private int key;
	private Object data;
	private Node leftNode;
	private Node rightNode;
	private Node parent;
	private boolean isRed = true;
	
	private Node nextLink;
	
	private int level;

	public Node(int id, Object data, Node parent) {
		this.key = id;
		this.data = data;
		this.parent = parent;
	}

	public int key() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
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

	public Node parent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public boolean isRed() {
		return isRed;
	}
	
	public boolean isBlack() {
		return !isRed;
	}

	public void setRed(boolean isRed) {
		this.isRed = isRed;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + key;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Node))
			return false;
		Node other = (Node) obj;
		if (key != other.key)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "" + key;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Node getNextLink() {
		return nextLink;
	}

	public void setNextLink(Node nextLink) {
		this.nextLink = nextLink;
	}

}
