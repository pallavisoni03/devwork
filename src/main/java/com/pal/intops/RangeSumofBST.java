package com.pal.intops;
import java.util.LinkedList;
import java.util.Queue;

import com.pal.utils.ConvertArrayToBST;
import com.pal.utils.TreeNode;
/* https://leetcode.com/problems/range-sum-of-bst/submissions/ */
public class RangeSumofBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeSumofBST rangeSumofBST = new RangeSumofBST();
		Integer[] rootArray = {15,9,21,7,13,19,23,5,null,11,null,17};//{10,5,15,3,7,null,18}; //{10,5,15,3,7,13,18,1,null,6};
		int low = 19;//7;//6;
		int high = 21;//15;//10;
		TreeNode root = new ConvertArrayToBST().convertArrayToBST(rootArray);
		rangeSumofBST.ldrTraversals(root);
		int outputInt = rangeSumofBST.rangeSumBST(root,low,high);
		System.out.println(outputInt);
	}

	public int rangeSumBST(TreeNode root, int low, int high) {
		int outputInt = 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root==null) return -1;
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode node = queue.remove();
			if(node.val>=low && node.val<=high) {
				//System.out.println(node.val);
				outputInt = outputInt+node.val;	
			}
			if(node.val >= low) {
				//System.out.println(node.val);
				if(node.left != null) queue.add(node.left);
			}
			if(node.val <= high) {
				//System.out.println(node.val);
				if(node.right != null) queue.add(node.right);
			}
		}
		return outputInt;

	}
	
	public void ldrTraversals(TreeNode node) {
		if(node!=null) {
			ldrTraversals(node.left);
			System.out.print(node.val+",");
			ldrTraversals(node.right);
		}
		
	}
}
	

