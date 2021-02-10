package com.pal.intops;
/* https://leetcode.com/problems/n-ary-tree-preorder-traversal/ */

import java.util.ArrayList;
import java.util.List;

public class NaryTreePretorderTraversal {

	
	Node root;
	List<Integer> outputList = new ArrayList<Integer>();
	public NaryTreePretorderTraversal() {
		root =null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] rootArray = {1,null,3,2,4,null,5,6};
		NaryTreePretorderTraversal naryTreePretorderTraversal = new NaryTreePretorderTraversal();
		naryTreePretorderTraversal.root = new Node(1);
		naryTreePretorderTraversal.root.children = new ArrayList<Node>();
		
		Node three =  new Node(3);
		naryTreePretorderTraversal.root.children.add(three);
		naryTreePretorderTraversal.root.children.add(new Node(2));
		naryTreePretorderTraversal.root.children.add(new Node(4));
	
		three.children = new ArrayList<>();
		three.children.add(new Node(5));
		three.children.add(new Node(6));
		
		List<Integer> opList = naryTreePretorderTraversal.preorder(naryTreePretorderTraversal.root);
		for(Integer i : opList) {
			System.out.println(i);
		}
	}
	
	public List<Integer> preorder(Node root) {
		if(root==null) return outputList;
		outputList.add(root.val);
		if(root.children!=null) {
			for(int i=0; i<root.children.size(); i++) 
				preorder(root.children.get(i));
				//System.out.println(root.children.get(i).val);
			}
		return outputList;
	}

}
