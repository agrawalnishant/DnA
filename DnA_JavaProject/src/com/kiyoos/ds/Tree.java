package com.kiyoos.ds;

/**
 * This implementation deletes a node immediately. Can be changed to mark as
 * delete. But than all operations would have to check the status.
 * 
 * @author _root_nishi
 * 
 */
public class Tree {

	private Node root;
	private int totalNodes;

	public enum Traversal {
		INORDER, PREORDER, POSTORDER;

	}

	/**
	 * Find the node having required key. If not found, then return a node
	 * having null value / data , but not-null parent.
	 * 
	 * @param key
	 * @return node with its parent.
	 */
	public Node find(Node input) {
		int key = input.getId();

		Node next = root;

		while (next != null && next.getId() != key) {

			if (key < next.getId())
				next = next.left();
			else
				next = next.right();

		}

		return next;
	}

	/**
	 * Inserts input node at appropriate position.
	 * 
	 * @param input
	 */
	public void insert(Node input) {

		if (root == null) {
			root = input;
		} else {

			int key = input.getId();
			Node targetPos = root;
			Node parent = targetPos;

			// Find the appropriate parent for target position.
			while (targetPos != null) {
				parent = targetPos;

				if (key < targetPos.getId()) {
					targetPos = targetPos.left();
				} else {
					targetPos = targetPos.right();
				}

			}

			if (key < parent.getId()) {
				parent.setLeft(input);
			} else {
				parent.setRight(input);
			}

			input.setParent(parent);
		}

	}

	public void delete(Node input) {

		// If the node is root, set root to null.
		if (input == root) {
			root = null;
		}

		int key = input.getId();

		// Find the node to be deleted.
		Node current = root;
		Node parent = current;
		boolean isLeftChild = false;

		while (current != null && current.getId() != key) {

			parent = current;

			if (key < current.getId()) {
				isLeftChild = true;
				current = current.left();
			} else {
				isLeftChild = false;
				current = current.right();
			}

		}

		// Return if node is not found.
		if (current == null) {
			return;
		}

		int childCount = (current.left() != null ? 1 : 0);
		childCount += (current.right() != null ? 1 : 0);

		switch (childCount) {

		// If no child
		case 0:

			if (isLeftChild) {
				parent.setLeft(null);
			} else {
				parent.setRight(null);
			}

			break;

		// If one child
		case 1:
			if (current.left() != null) {
				if (current == root) {
					root = current.left();
				} else if (isLeftChild) {
					parent.setLeft(current.left());
				} else {
					parent.setRight(current.left());
				}

			} else if (current.right() != null) {
				if (current == root) {
					root = current.right();
				} else if (isLeftChild) {
					parent.setLeft(current.right());
				} else {
					parent.setRight(current.right());
				}
			}

			break;

		// If both child
		case 2: {

			Node successor = getSuccessor(current);

			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.setLeft(successor);
			} else {
				parent.setRight(successor);
			}

			successor.setLeft(current.left());

		}
		}

	}

	private Node getSuccessor(Node delNode) {

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

		System.out.println("Minimum: [K:" + previous.getId() + ", V:" + previous.getData() + "]");

		return previous;

	}

	public Node maximum() {
		return null;

	}

	public void displayAsArray() {

		Tree[] treeAsArray = new Tree[totalNodes];
		Node next = root;
		int level = 0;
		// while(next != null)

	}

	public void traverse(Tree.Traversal mode) {

		switch (mode) {

		case INORDER:
			System.out.println("\n Inorder \n");
			inorder(root);
			break;

		case PREORDER:
			System.out.println("\n PREORDER \n");
			preorder(root);
			break;

		case POSTORDER:
			System.out.println("\n POSTORDER \n");
			postorder(root);
			break;

		default:
			break;
		}
	}

	private void inorder(Node node) {

		if (node == null)
			return;

		inorder(node.left());

		System.out.println("[K:" + node.getId() + ", V:" + node.getData() + "]");

		inorder(node.right());

	}

	private void preorder(Node node) {

		if (node == null)
			return;

		System.out.println("[K:" + node.getId() + ", V:" + node.getData() + "]");

		preorder(node.left());

		preorder(node.right());

	}

	private void postorder(Node node) {
		if (node == null)
			return;

		postorder(node.left());

		inorder(node.right());

		System.out.println("[K:" + node.getId() + ", V:" + node.getData() + "]");

	}

}
