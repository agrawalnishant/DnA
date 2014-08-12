/**
 * 
 */
package com.kiyoos.ds.tree.tests;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

import com.kiyoos.ds.tree.AbstractBinarySearchTree;
import com.kiyoos.ds.tree.AbstractBinarySearchTree.NonRecursiveTraversal;
import com.kiyoos.ds.tree.AbstractBinarySearchTree.RecursiveTraversal;
import com.kiyoos.ds.tree.BinarySearchTree;
import com.kiyoos.ds.tree.Node;

/**
 * @author _root_nishi
 * 
 */
public class TreeTests {
	public static void main(String[] args) {
		TreeTests tests = new TreeTests();
		try {
			tests.test();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test() throws InterruptedException {
		AbstractBinarySearchTree tree = new BinarySearchTree();
		Node root = new Node(100, "1", null);
		Node leftChild = new Node(30, "2", null);
		Node rightChild = new Node(700, "3", null);

		tree.insert(root);
		tree.insert(leftChild);
		tree.insert(rightChild);

		System.out.println("Depth is :" + tree.getDepth());

		tree.traverse(RecursiveTraversal.PREORDER);
		tree.traverse(RecursiveTraversal.INORDER);
		tree.traverse(RecursiveTraversal.POSTORDER);
		
		tree.traverse(NonRecursiveTraversal.PREORDER);
		//tree.traverse(NonRecursiveTraversal.INORDER);
		//tree.traverse(NonRecursiveTraversal.POSTORDER);

		Node node = new Node(20, "4", null);
		tree.insert(node);

		node = new Node(50, "5", null);
		tree.insert(node);

		node = new Node(35, "6", null);
		tree.insert(node);

		node = new Node(60, "7", null);
		tree.insert(node);

		node = new Node(40, "8", null);
		tree.insert(node);

		node = new Node(80, "9", null);
		tree.insert(node);

		node = new Node(800, "10", null);
		tree.insert(node);
		node = new Node(801, "11", null);
		tree.insert(node);
		node = new Node(802, "13", null);
		tree.insert(node);

		node = new Node(812, "14", null);
		tree.insert(node);

		node = new Node(822, "15", null);
		tree.insert(node);

		tree.traverse(RecursiveTraversal.INORDER);

		Assert.assertEquals("Depth should be 7 for given data, but instead it is: " + tree.getDepth(), tree.getDepth(), 6);

		System.out.println("Inorder representation :" + Arrays.asList(tree.displayAsInorderArray()));

		Node newNode = new Node(30, "8", null);
		tree.delete(newNode);
		tree.traverse(RecursiveTraversal.INORDER);

		Assert.assertEquals("Depth should still be 7 for given data, but instead it is: " + tree.getDepth(), tree.getDepth(), 6);

		newNode = new Node(822, "8", null);
		tree.delete(newNode);

		Assert.assertEquals("Depth should now be 6 for given data, but instead it is: " + tree.calculateDepth(tree.getRoot()),
				tree.calculateDepth(tree.getRoot()), 6);

		System.out.println("Depth is :" + tree.getDepth());

		Node nd = tree.getAsInorderLinkedList();
		while (nd != null) {
			System.out.println(" - " + nd.key());
			nd = nd.getNextLink();
		}

	}

	/*
	 * @Test public void testRedBlackTreeInsertion() { RedBlackTree rbTree = new RedBlackTree(); Node root = new Node(100, "1", null); rbTree.insert(root);
	 * 
	 * Node node = new Node(50, "50", null); rbTree.insert(node);
	 * 
	 * node = new Node(150, "150", null); rbTree.insert(node);
	 * 
	 * node = new Node(20, "20", null); rbTree.insert(node);
	 * 
	 * node = new Node(10, "10", null); rbTree.insert(node);
	 * 
	 * }
	 */

	/*
	 * @Test public void testRedBlackTreeInsertion() { RedBlackTree rbTree = new RedBlackTree(); Node node = new Node(200, "200", null); rbTree.insert(node);
	 * 
	 * node = new Node(1, "1", null); rbTree.insert(node);
	 * 
	 * node = new Node(55, "55", null); rbTree.insert(node);
	 * 
	 * node = new Node(100, "100", null); rbTree.insert(node);
	 * 
	 * node = new Node(300, "300", null); rbTree.insert(node);
	 * 
	 * node = new Node(50, "50", null); rbTree.insert(node);
	 * 
	 * node = new Node(150, "150", null); rbTree.insert(node);
	 * 
	 * node = new Node(20, "20", null); rbTree.insert(node);
	 * 
	 * node = new Node(10, "10", null); rbTree.insert(node);
	 * 
	 * rbTree.traverse(Traversal.INORDER);
	 * 
	 * }
	 */
}
