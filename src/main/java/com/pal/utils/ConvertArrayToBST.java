package com.pal.utils;

public class ConvertArrayToBST {

	public TreeNode convertArrayToBST(Integer[] rootArray) {
		//Arrays.sort(rootArray);
		TreeNode root = null;
		if(rootArray!=null && rootArray.length>0) {
			root = convertArrayToBSTImpl(rootArray,0);
		}
		return root;
		
	}
	
	public TreeNode convertArrayToBSTImpl(Integer[] rootArray, int i) { 
		if(i<rootArray.length) { 
			if(rootArray[i]!=null) {
		TreeNode root = new TreeNode(rootArray[i]);
		root.left =  convertArrayToBSTImpl(rootArray,(2*i)+1);
		root.right =  convertArrayToBSTImpl(rootArray,(2*i)+2);
		return root; 
			}else {
				return null; 
			}
		}else {
			return null;
		}
		
	} 
	
}
