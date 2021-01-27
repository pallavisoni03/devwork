package com.pal.intops;
import java.util.ArrayList;
import java.util.LinkedList;
/* https://leetcode.com/problems/n-ary-tree-postorder-traversal/ */
import java.util.List;
import java.util.Queue;




public class NaryTreePostorderTraversal {

	
	Node root;
	List<Integer> outputList = new ArrayList<Integer>();
	public NaryTreePostorderTraversal() {
		root =null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] rootArray = {1,null,3,2,4,null,5,6};
		NaryTreePostorderTraversal naryTreePostorderTraversal = new NaryTreePostorderTraversal();
		naryTreePostorderTraversal.root = new Node(1);
		naryTreePostorderTraversal.root.children = new ArrayList<Node>();
		
		Node three =  new Node(3);
		naryTreePostorderTraversal.root.children.add(three);
		naryTreePostorderTraversal.root.children.add(new Node(2));
		naryTreePostorderTraversal.root.children.add(new Node(4));
	
		three.children = new ArrayList<>();
		three.children.add(new Node(5));
		three.children.add(new Node(6));
		
		List<Integer> opList = naryTreePostorderTraversal.postorder(naryTreePostorderTraversal.root);
		for(Integer i : opList) {
			System.out.println(i);
		}
	}
	
	public List<Integer> postorder1(Node root) {
		List<Integer> outputList = new ArrayList<Integer>();
		if(root==null) return outputList;
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			outputList.add(node.val);
			if(node.children!=null) {
				for(int i=0; i<node.children.size(); i++) {
					queue.add(node.children.get(i));
				}
			}
		}
		return outputList;
        
    }
	
	public List<Integer> postorder(Node root) {
		if(root==null) return outputList;
		if(root.children!=null) {
			for(int i=0; i<root.children.size(); i++) 
				postorder(root.children.get(i));
				//System.out.println(root.children.get(i).val);
			}
		outputList.add(root.val);
		return outputList;
	}
}


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
