package com.kiyoos.ds.tree;


/**
 * This implementation deletes a node immediately. Can be changed to mark as
 * delete. But than all operations would have to check the status.
 * 
 * @author _root_nishi
 * 
 */
public class BinarySearchTree extends AbstractBinarySearchTree {

	Node root;
	int totalNodes;
	int depth;
	
	
	public BinarySearchTree() {
		super();
	}

	public Node getSuccessor(Node delNode) {

		Node grandParent = delNode;
		Node successor = delNode;
		Node current = successor.right();

		while (current != null) {
			grandParent = successor;
			successor = current;
			current = current.left();

		}

		if (successor != delNode.right()) {
			grandParent.setLeft(successor.right());
			successor.setRight(delNode.right());
		}

		return successor;
	}

	public Node minimum() {

		Node next = root;
		Node previous = root;

		while (next != null) {
			previous = next;
			next = previous.left();
		}

		System.out.println("Minimum: [K:" + previous.key() + ", V:" + previous.getData() + "]");

		return previous;

	}

	public Node maximum() {
		return null;

	}

	

	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public int getTotalNodes() {
		return totalNodes;
	}

	public void setTotalNodes(int totalNodes) {
		this.totalNodes = totalNodes;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

}
