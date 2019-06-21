package com.lara;

import java.util.PriorityQueue;

public class M81 {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add("test");
		queue.add("abc");
		queue.add("xyz");
		queue.add("java");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
/*
 * 
 * sorted order. sorting is based on the keys.
 * 
 * 3 condtions with respect to keys
 * 
 * 1.keys should be either comparable or separate comparator should be there.
 * 2.same type. 3.keys can not be null
 * 
 * {abc=500, btm=8000, java=50, test=6000, xyz=4}
 * 
 */