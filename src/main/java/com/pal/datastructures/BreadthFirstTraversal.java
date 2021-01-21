package com.pal.datastructures;

import java.util.LinkedList;
import java.util.Queue;

import com.pal.utils.Node;

public class BreadthFirstTraversal {

	Node root;
	BreadthFirstTraversal() {
		root =null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreadthFirstTraversal breadthFirstTraversal = new BreadthFirstTraversal();
		breadthFirstTraversal.root = new Node(1);
		breadthFirstTraversal.root.left = new Node(2);
		breadthFirstTraversal.root.right = new Node(3);
		breadthFirstTraversal.root.left.left = new Node(4);
		breadthFirstTraversal.root.left.right = new Node(5);
		
		breadthFirstTraversal.bfsTraversal(breadthFirstTraversal.root);
		

	}
	
	public void bfsTraversal(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		if(root==null)return;
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			//node = queue.peek();
			System.out.println(node.value);
			if(node.left != null) queue.add(node.left);
			if(node.right != null) queue.add(node.right);
			
		}
		
	}
	
}

