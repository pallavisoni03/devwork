package com.pal.intops;
import com.pal.utils.ListNode;

public class ConvertLLBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ListNode ln = new ListNode();
		ListNode ln1 = new ListNode();
		ListNode ln2= new ListNode();
		ListNode ln3= new ListNode();
		ln.val = 1;
		ln1.val = 0; ln.next= ln1;
		ln2.val = 1; ln1.next= ln2;
		
		
		//ln3.val = 1; ln2.next= ln3;
		 */
		
		//ListNode head = new ConvertLLBinaryNumber().createListList(new int[] {1,0,0,1,0,0,1,1,1,0,0,0,0,0,0});
		//ListNode head = new ConvertLLBinaryNumber().createListList(new int[] {1,0,1});
		//ListNode head = new ConvertLLBinaryNumber().createListList(new int[] {0});
		//ListNode head = new ConvertLLBinaryNumber().createListList(new int[] {1});
		ListNode head = new ConvertLLBinaryNumber().createListList(new int[] {0,0});
		ListNode newHead = head; 
		while (head!=null) { 
			System.out.print(head.val+",");
			head = head.next;
		} 
		head = newHead;
		System.out.println(new ConvertLLBinaryNumber().getDecimalValue(head));
		
	}
	
	public int getDecimalValue(ListNode head) {
		int i = 0;
		ListNode newHead = head; 
		while (head!=null && head.next != null) { 
			head = head.next;
			i++;
		} 
		int total  = 0;
		head = newHead;
		while (head != null) { 
			int pow = (int)Math.pow(2, i);
			int calc = head.val*pow;
			//System.out.println(calc);
			total = total + calc;
			head = head.next;
			i--;
		}
		return total;
	}

	/*
	 * public int getDecimalValue(ListNode head) { //HashMap<Integer, Integer>
	 * nodeMap = new HashMap<Integer, Integer>(); ArrayList<Integer> nodeList = new
	 * ArrayList<Integer>(); //System.out.println(head); int i = 0; while (head !=
	 * null) { int headVal = head.val; System.out.print(i+ "-"+headVal+",");
	 * nodeList.add(headVal); head = head.next; i++; } System.out.println(i); i=i-1;
	 * // check this int total = 0; for(int value : nodeList) { int pow =
	 * (int)Math.pow(2, i); //System.out.println("pow--->"+pow+"--"+value); int calc
	 * = value*pow; System.out.println(calc); total = total + calc;
	 * //System.out.println(total); i--; } return total; }
	 */
	// Definition for singly-linked list.
	  
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




