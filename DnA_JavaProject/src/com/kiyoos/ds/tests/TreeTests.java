/**
 * 
 */
package com.kiyoos.ds.tests;

import org.junit.Test;

import com.kiyoos.ds.Node;
import com.kiyoos.ds.RedBlackTree;
import com.kiyoos.ds.Tree.Traversal;

/**
 * @author _root_nishi
 * 
 */
public class TreeTests {

	/*
	 * @Test public void test() { Tree tree = new Tree(); Node root = new
	 * Node(100, "1", null); Node leftChild = new Node(30, "2", null); Node
	 * rightChild = new Node(700, "3", null);
	 * 
	 * tree.insert(root); tree.insert(leftChild); tree.insert(rightChild);
	 * 
	 * tree.traverse(Traversal.PREORDER); tree.traverse(Traversal.INORDER);
	 * tree.traverse(Traversal.POSTORDER);
	 * 
	 * Node node = new Node(20, "4", null); tree.insert(node);
	 * 
	 * node = new Node(50, "5", null); tree.insert(node);
	 * 
	 * node = new Node(35, "6", null); tree.insert(node);
	 * 
	 * node = new Node(60, "7", null); tree.insert(node);
	 * 
	 * node = new Node(40, "8", null); tree.insert(node);
	 * tree.traverse(Traversal.INORDER);
	 * 
	 * Node newNode = new Node(30, "8", null); tree.delete(newNode);
	 * tree.traverse(Traversal.INORDER); }
	 */

	/*@Test
	public void testRedBlackTreeInsertion() {
		RedBlackTree rbTree = new RedBlackTree();
		Node root = new Node(100, "1", null);
		rbTree.insert(root);

		Node node = new Node(50, "50", null);
		rbTree.insert(node);

		node = new Node(150, "150", null);
		rbTree.insert(node);

		node = new Node(20, "20", null);
		rbTree.insert(node);

		node = new Node(10, "10", null);
		rbTree.insert(node);

	}*/
	
	@Test
	public void testRedBlackTreeInsertion() {
		RedBlackTree rbTree = new RedBlackTree();
		Node node = new Node(200, "200", null);
		rbTree.insert(node);
		
		node = new Node(1, "1", null);
		rbTree.insert(node);
		
		node = new Node(55, "55", null);
		rbTree.insert(node);
		
		node = new Node(100, "100", null);
		rbTree.insert(node);

		node = new Node(300, "300", null);
		rbTree.insert(node);

		 node = new Node(50, "50", null);
		rbTree.insert(node);

		node = new Node(150, "150", null);
		rbTree.insert(node);

		node = new Node(20, "20", null);
		rbTree.insert(node);

		node = new Node(10, "10", null);
		rbTree.insert(node);
		
		rbTree.traverse(Traversal.INORDER);

	}

}
