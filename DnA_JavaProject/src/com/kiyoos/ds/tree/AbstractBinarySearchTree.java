package com.kiyoos.ds.tree;

import java.util.Arrays;

public abstract class AbstractBinarySearchTree {

	public enum Traversal {
		INORDER, PREORDER, POSTORDER;

	}

	public AbstractBinarySearchTree() {
		super();
	}

	/**
	 * Find the node having required key. If not found, then return a node having null value / data , but not-null parent.
	 * 
	 * @param key
	 * @return node with its parent.
	 */
	public Node find(Node input) {
		int key = input.key();

		Node next = getRoot();

		while (next != null && next.key() != key) {

			if (key < next.key())
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

		if (getRoot() == null) {
			setRoot(input);
			setDepth(1);
			input.setLevel(1);
		} else {

			// Start at root.
			int key = input.key();
			Node targetPos = getRoot();
			Node parent = targetPos;

			// Find the appropriate parent for target position.
			while (targetPos != null) {
				parent = targetPos;

				if (key < targetPos.key()) {
					targetPos = targetPos.left();
				} else {
					targetPos = targetPos.right();
				}

			}

			// Now see if this new node has to be left or right child.
			if (key < parent.key()) {
				parent.setLeft(input);
				input.setLevel(parent.getLevel() + 1);
			} else {
				parent.setRight(input);
				input.setLevel(parent.getLevel() + 1);
			}

			input.setParent(parent);

			// Update deplth on each insertion.
			// Change depth only if parent has no previous child and if parent's level is not less than tree's existing depth.
			if (((parent.left() != null && parent.right() == null) || (parent.left() == null && parent.right() != null)) && getDepth() <= parent.getLevel()) {
				setDepth(getDepth() + 1);
			}

		}
		setTotalNodes(getTotalNodes() + 1);

	}

	public abstract void setRoot(Node input);

	public void delete(Node input) {

		// If the node is root, set root to null.
		if (input == getRoot()) {
			setRoot(null);
		}

		int key = input.key();

		// Find the node to be deleted.
		Node current = getRoot();
		Node parent = current;
		boolean isLeftChild = false;

		while (current != null && current.key() != key) {

			parent = current;

			if (key < current.key()) {
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
				if (current == getRoot()) {
					setRoot(current.left());
				} else if (isLeftChild) {
					parent.setLeft(current.left());
				} else {
					parent.setRight(current.left());
				}

			} else if (current.right() != null) {
				if (current == getRoot()) {
					setRoot(current.right());
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

			if (current == getRoot()) {
				setRoot(successor);
			} else if (isLeftChild) {
				parent.setLeft(successor);
			} else {
				parent.setRight(successor);
			}

			successor.setLeft(current.left());

		}
		}

		// Update depth on each deletion.
		// Change depth only if parent has no previous child and if parent's level is not less than tree's existing depth.
		if ((parent.left() == null && parent.right() == null) && getDepth() <= parent.getLevel()) {
			setDepth(getDepth() + 1);
		}

	}

	public int calculateDepth(Node startingNode) {

		if (startingNode == null)
			return 0;
		else if (startingNode.left() == null && startingNode.right() == null)
			return 1;
		else {

			int delthOfLeftSubtree = calculateDepth(startingNode.left());
			int delthOfRightSubtree = calculateDepth(startingNode.right());

			return 1 + Math.max(delthOfLeftSubtree, delthOfRightSubtree);
		}

	}

	public abstract Node getSuccessor(Node current);

	public Node[] displayAsInorderArray() {

		Node[] treeAsArray = new Node[(new Double(Math.pow(2, getDepth() + 1)).intValue() - 1)];
		Node next = getRoot();
		setInorder(next, treeAsArray, 0);
		return treeAsArray;

	}

	public Node getAsInorderLinkedList() {

		Node headOfList = createInorderList(getRoot());
		return headOfList;

	}

	protected Node createInorderList(Node currentNode) {

		if (currentNode == null)
			return null;

		

		return currentNode;
	}

	public void traverse(BinarySearchTree.Traversal mode) {

		switch (mode) {

		case INORDER:
			System.out.println("\n Inorder \n");
			inorder(getRoot());
			break;

		case PREORDER:
			System.out.println("\n PREORDER \n");
			preorder(getRoot());
			break;

		case POSTORDER:
			System.out.println("\n POSTORDER \n");
			postorder(getRoot());
			break;

		default:
			break;
		}
	}

	void inorder(Node node) {

		if (node == null)
			return;

		inorder(node.left());

		System.out.println("[K:" + node.key() + ", V:" + node.getData() + "]");

		inorder(node.right());

	}

	public void setInorder(Node node, Node[] array, int pos) {

		if (node == null)
			return;

		setInorder(node.left(), array, 2 * pos + 1);

		// System.out.println("[K:" + node.key() + ", V:" + node.getData() +
		// "]");
		array[pos] = node;
		System.out.println("Till Now : " + Arrays.asList(array));

		setInorder(node.right(), array, 2 * pos + 2);

	}

	void preorder(Node node) {

		if (node == null)
			return;

		System.out.println("[K:" + node.key() + ", V:" + node.getData() + "]");

		preorder(node.left());

		preorder(node.right());

	}

	void postorder(Node node) {
		if (node == null)
			return;

		postorder(node.left());

		inorder(node.right());

		System.out.println("[K:" + node.key() + ", V:" + node.getData() + "]");

	}

	/**
	 * @return the root
	 */
	public abstract Node getRoot();

	public abstract int getTotalNodes();

	public abstract void setTotalNodes(int totalNodes);

	public abstract int getDepth();

	public abstract void setDepth(int depth);

}