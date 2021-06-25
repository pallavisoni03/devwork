package com.pal.intops;

import com.pal.utils.ListNode;
import com.pal.utils.UtilMethods;

//https://leetcode.com/problems/reverse-linked-list/

	public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*ListNode head = new ListNode(1);
		ListNode ln = head;
		ln.next = new ListNode(2);
		ln.next = new ListNode(3);
		ln.next = new ListNode(4);
		ln.next = new ListNode(5);
		*/
		
		ListNode head = new UtilMethods().createListList(new int[] {1,2,3,4,5});
		ListNode newHead = head; 
		while (head!=null) { 
			System.out.print(head.val+",");
			head = head.next;
		} 
		head = newHead;
		
		ListNode revListHead = new ReverseLinkedList().reverseList(head);
		ListNode newRevHead = revListHead; 
		System.out.println("\n----------------------------");
		while (revListHead!=null) { 
			System.out.print(revListHead.val+",");
			revListHead = revListHead.next;
		} 
		revListHead = newRevHead;
		
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode newHead = null; 
		while(head!=null) {
			ListNode temp = head.next;
			head.next = newHead;
			newHead = head;
			head = temp;
			
		}
		
		return newHead;
		
    }

}
