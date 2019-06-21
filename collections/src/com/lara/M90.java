package com.lara;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class M90 {

	static class A  {
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

	}

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new A(90), "test");
		map.put(new A(9), "test");
		map.put(new A(0), "test");
		map.put(new A(80), "test");
		System.out.println(map);
		TreeMap map1 = new TreeMap((o1,o2)-> ((A)o1).i-((A)o2).i);
		map1.putAll(map);
		System.out.println(map1);
	}
}

/*
Comparator used here

{(i= 0)=test, (i= 90)=test, (i= 80)=test, (i= 9)=test}
{(i= 0)=test, (i= 9)=test, (i= 80)=test, (i= 90)=test}


 */