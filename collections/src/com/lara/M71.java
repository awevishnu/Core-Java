package com.lara;

import java.util.PriorityQueue;

public class M71 {

	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue();
		queue.add(120);
		queue.add(12);
		queue.add(10);
		queue.add(0);
		queue.add(10);
		queue.add(40);
		System.out.println(queue);
		System.out.println(queue.poll());//reading and removing the head element.
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
	}
}
/*
peak method only for reading the head element.

poll reading and removing the head element.
we have to follow following 3 conditions for PQ.
1.every element should be same type of element.

2.elements should be comparable type, other wise we need to supply separate comparator.
3.No element should be null.
*/