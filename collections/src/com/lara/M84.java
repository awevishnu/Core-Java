  package com.lara;

import java.util.Comparator;
import java.util.PriorityQueue;

public class M84 {

	static class A {
		int i;

		A(int i) {
			this.i = i;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "(i= " + i + ")";
		}
		
		
	}

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				
				return ((A)o1).i-((A)o2).i;
			}
		});
		queue.add(new A(90));
		queue.add(new A(0));
		queue.add(new A(9));
		queue.add(new A(910));
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