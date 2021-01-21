package com.pal.intops;

import com.pal.utils.TreeNode;

/* https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/ */
public class SortedArraytoBST {
	TreeNode root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedArraytoBST tree = new SortedArraytoBST(); 
		int nums[] = new int[]{3};//{-10,-3,0,5,9}; 
		TreeNode root = tree.sortedArrayToBST(nums);
		tree.dlrTraversals(root);

	}

	public TreeNode sortedArrayToBST(int[] nums) {
		TreeNode root = null;
		if(nums!=null && nums.length>0) {
			root = sortedArrayToBSTImpl(nums,0,nums.length-1);
		}
		return root;
	}

	public TreeNode sortedArrayToBSTImpl(int[] nums, int start, int end) { 
		if (start > end) { 
			return null; 
		} 
		if(start==end) {
			return new TreeNode(nums[start]);
		}
		int mid = (start + end) / 2; 
		TreeNode root = new TreeNode(nums[mid]);
		root.left = sortedArrayToBSTImpl(nums, start, mid - 1); 
		root.right = sortedArrayToBSTImpl(nums, mid + 1, end); 
		return root; 
	} 

	public void dlrTraversals(TreeNode node) {
		if(node!=null) {
			System.out.print(node.val+",");
			dlrTraversals(node.left);
			dlrTraversals(node.right);
		} /*
			 * else { System.out.print("null "); }
			 */
	}

}