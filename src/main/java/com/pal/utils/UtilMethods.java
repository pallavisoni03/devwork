package com.pal.utils;

public class UtilMethods {
	
	
	public ListNode createListList(int[] input){
		ListNode head = null;
		ListNode ln = null;
		//for(int i=1; i<=input.length; i++) {
		for(int value : input) {
			if(head==null) {
				head = new ListNode(input[0]);
				ln = head;
			 }else {
				 ln.next = new ListNode(value);
				 ln = ln.next;
			 }		
		}
		return head;
	}    

}
