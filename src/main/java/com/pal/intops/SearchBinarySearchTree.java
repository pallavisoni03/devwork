package com.pal.intops;
/* https://leetcode.com/problems/search-in-a-binary-search-tree/ */
import com.pal.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import com.pal.utils.ConvertArrayToBST;

public class SearchBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] rootArray = {4,2,7,1,3};//{4,2,7,1,3};
		Integer[] rootArray = {10,5,15,3,7,13,18,1,null,6};//{11,7,12,5,4,6};//{4,2,7,1,3};
		int val = 5;//5;//
		TreeNode root = new ConvertArrayToBST().convertArrayToBST(rootArray);
		//System.out.println("----------------------");
		//System.out.println(root);
		new SearchBinarySearchTree().dlrTraversals(root);
		System.out.println("\n");
		TreeNode outputNode = new SearchBinarySearchTree().searchBST(root, val);
		new SearchBinarySearchTree().dlrTraversals(outputNode);
	}

	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null)
            return root;
		if (root.val == val)
            return root;
		TreeNode node = null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			node = queue.remove();
			if(node!=null && node.val>val) {
				queue.add(node.left);
			}
			if(node!=null && node.val<val) {
				queue.add(node.right);
			}
			
		}
		return node;
	}
	
	public TreeNode searchBST1(TreeNode root, int val) {
		if(root!=null) { 
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(root);
			while(!queue.isEmpty()) {
				TreeNode node = queue.remove();
				if(node!=null && node.val==val) {
					return node;
				}
				if(node!=null && node.val>val) {
					queue.add(node.left);	
				}
				if(node!=null && node.val<val) {
					queue.add(node.right);
				}
				
			}
		}
		return null;

	}

	public void dlrTraversals(TreeNode node) {
		if(node!=null) {
			System.out.print(node.val);
			dlrTraversals(node.left);
			dlrTraversals(node.right);
		}

	}

}
