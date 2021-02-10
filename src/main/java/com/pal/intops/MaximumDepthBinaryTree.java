package com.pal.intops;
/* https://leetcode.com/problems/maximum-depth-of-binary-tree/ */
import com.pal.utils.ConvertArrayToBST;
import com.pal.utils.TreeNode;

public class MaximumDepthBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] root = {0}; //{3,9,20,null,null,15,7};

		TreeNode node = new ConvertArrayToBST().convertArrayToBST(root);
		if (node != null) {
			System.out.println(node.toString());
		}

		int outputInt = new MaximumDepthBinaryTree().maxDepth(node);
		System.out.println("outputInt---->" + outputInt);
	}

	public int maxDepth(TreeNode root) {
		int outputInt = 0;
		if (root == null)
			return outputInt;
		int leftInt = maxDepth(root.left);;
		int  rightInt = maxDepth(root.right);
		
		return 1 + Math.max(leftInt, rightInt);
	}

}
