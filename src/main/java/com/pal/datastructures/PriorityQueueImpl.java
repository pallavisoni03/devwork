package com.pal.datastructures;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=1; i<=10; i++) {
			pq.add(i);
		}
		
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
		System.out.println("\n----------------------");
		System.out.println(pq.peek());
		//pq.remove(5);
			while(!pq.isEmpty()) {
				System.out.print(pq.poll()+",");
			}
		System.out.println(pq.peek());
		
	}

}
