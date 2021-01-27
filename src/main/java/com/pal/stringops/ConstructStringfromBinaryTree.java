package com.pal.stringops;

import com.pal.utils.TreeNode;
import com.pal.utils.ConvertArrayToBST;


public class ConstructStringfromBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] rootArray = {1,2,3,null,4};//{1,2,3,4};
		
		TreeNode node = new ConvertArrayToBST().convertArrayToBST(rootArray);
		String outputStr = new ConstructStringfromBinaryTree().tree2str(node);
		System.out.println(outputStr);
	}
	
	public String tree2str(TreeNode t) {
		String outputStr = "";
		String leftVal = "";
		String rightVal = "";
		if(t==null) { 
				return outputStr;
		}
			outputStr = t.val+"";
			leftVal = tree2str(t.left);
			rightVal = tree2str(t.right);
			
	        if(leftVal=="" && rightVal=="") { 
				return outputStr;
				}
			if(leftVal=="") {
				outputStr =  outputStr + "()"+"("+rightVal+")";
				return outputStr;
			}
			if(rightVal=="") {
				outputStr =  outputStr + "("+leftVal+")";
				return outputStr;
			}
			if (leftVal == null && rightVal != null)
				outputStr =  outputStr + "()";
			outputStr  =  outputStr + "(" + leftVal + ")" + "(" + rightVal + ")";
			return outputStr;
			
	}
}
