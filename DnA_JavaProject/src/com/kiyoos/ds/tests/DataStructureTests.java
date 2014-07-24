package com.kiyoos.ds.tests;

import org.junit.Assert;
import org.junit.Test;

import com.kiyoos.ds.CircularIntQueue;
import com.kiyoos.ds.tree.AbstractBinarySearchTree;
import com.kiyoos.ds.tree.Node;
import com.kiyoos.ds.tree.RedBlackTree;
import com.kiyoos.ds.tree.BinarySearchTree;

public class DataStructureTests {

	@Test
	public void testQueueAddition() {
		CircularIntQueue circularQ = new CircularIntQueue(10);
		circularQ.add('1');
		circularQ.add('2');
		circularQ.add('3');
		circularQ.add('4');
		circularQ.add('5');
		circularQ.display();
		circularQ.remove();
		circularQ.display();
		circularQ.remove();
		circularQ.display();
		circularQ.remove();
		circularQ.display();
		circularQ.remove();
		circularQ.display();
		circularQ.remove();
		circularQ.display();
		circularQ.remove();
		circularQ.display();
		circularQ.add('6');
		circularQ.add('7');
		circularQ.add('8');
		circularQ.add('9');
		circularQ.add('1');
		circularQ.display();
		circularQ.remove();
		circularQ.display();
		circularQ.add('a');
		circularQ.add('b');
		circularQ.display();
		circularQ.remove();
		String finalResult= circularQ.display();
		Assert.assertEquals("Queue not working.", ",8,9,1,a,b", finalResult);
		
		

	}
	
	public void testInorderTraversal(){
		AbstractBinarySearchTree tree = new BinarySearchTree();
	}
	
	
	

}
