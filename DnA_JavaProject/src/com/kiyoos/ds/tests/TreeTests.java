/**
 * 
 */
package com.kiyoos.ds.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kiyoos.ds.Node;
import com.kiyoos.ds.Tree;
import com.kiyoos.ds.Tree.Traversal;

/**
 * @author _root_nishi
 *
 */
public class TreeTests {

	@Test
	public void test() {
		Tree tree = new Tree();
		Node root = new Node(100, "1", null);
		Node leftChild = new Node(30, "2", null);
		Node rightChild = new Node(700, "3", null);
		
		tree.insert(root);
		tree.insert(leftChild);
		tree.insert(rightChild);
		
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
		tree.traverse(Traversal.INORDER);
		
		Node newNode = new Node(30, "8", null);
		tree.delete(newNode);
		tree.traverse(Traversal.INORDER);
	}

}
