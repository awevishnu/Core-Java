package com.lara;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class M89 {

	static class A implements Comparable {
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
			return i == ((A) obj).i;
		}

		@Override
		public int compareTo(Object o) {
			return i - ((A) o).i;

		}
	}

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new A(90), "test");
		map.put(new A(9), "test");
		map.put(new A(0), "test");
		map.put(new A(80), "test");
		System.out.println(map);
		TreeMap map1 = new TreeMap(map);
		System.out.println(map1);
	}
}

/*

{(i= 0)=test, (i= 90)=test, (i= 80)=test, (i= 9)=test}
{(i= 0)=test, (i= 9)=test, (i= 80)=test, (i= 90)=test}


 */