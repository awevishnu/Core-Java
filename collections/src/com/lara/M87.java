package com.lara;

import java.util.HashMap;
import java.util.PriorityQueue;

public class M87 {

	static class A {
		int i;

		A(int i) {
			this.i = i;
		}

		@Override
		public String toString() {
			return "(i= " + i + ")";
		}

		@Override
		public int hashCode() {
			return Integer.toString(i).hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
			return i==((A) obj).i;
		}
	}

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new A(90), "test");
		map.put(new A(90), "test");
		map.put(new A(90), "test");
		map.put(new A(90), "test");
		map.put(new A(90), "test");
		map.put(new A(90), "test");
		System.out.println(map);
	}
}
/*
 
{(i= 90)=test}

 */