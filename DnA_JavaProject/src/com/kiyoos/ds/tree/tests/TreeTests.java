/**
 * 
 */
package com.kiyoos.ds.tree.tests;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

import com.kiyoos.ds.tree.AbstractSortedTree;
import com.kiyoos.ds.tree.AbstractSortedTree.Traversal;
import com.kiyoos.ds.tree.Node;
import com.kiyoos.ds.tree.SortedTree;

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
		AbstractSortedTree tree = new SortedTree();
		Node root = new Node(100, "1", null);
		Node leftChild = new Node(30, "2", null);
		Node rightChild = new Node(700, "3", null);

		tree.insert(root);
		tree.insert(leftChild);
		tree.insert(rightChild);

		System.out.println("Depth is :" + tree.getDepth());

		tree.traverse(Traversal.PREORDER);
		tree.traverse(Traversal.INORDER);
		tree.traverse(Traversal.POSTORDER);

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
		node = new Node(802, "12", null);
		tree.insert(node);
		
		tree.traverse(Traversal.INORDER);

		Assert.assertEquals(
				"Depth should be 5 for given data, but instead it is: "
						+ tree.getDepth(), tree.getDepth(), 5);
		
		
		System.out.println("Inorder representation :" + Arrays.asList(tree.displayAsArray()));

		Node newNode = new Node(30, "8", null);
		tree.delete(newNode);
		tree.traverse(Traversal.INORDER);

		System.out.println("Depth is :" + tree.getDepth());
		
		
		
	}

	/*
	 * @Test public void testRedBlackTreeInsertion() { RedBlackTree rbTree = new
	 * RedBlackTree(); Node root = new Node(100, "1", null);
	 * rbTree.insert(root);
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
	 * @Test public void testRedBlackTreeInsertion() { RedBlackTree rbTree = new
	 * RedBlackTree(); Node node = new Node(200, "200", null);
	 * rbTree.insert(node);
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
