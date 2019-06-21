package com.lara;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class M88 {

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
		TreeMap map1 = new TreeMap(map);
		System.out.println(map1);
	}
}

/*

{(i= 0)=test, (i= 90)=test, (i= 80)=test, (i= 9)=test}
Exception in thread "main" java.lang.ClassCastException: com.lara.M88$A cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(Unknown Source)
	at java.util.TreeMap.put(Unknown Source)
	at java.util.AbstractMap.putAll(Unknown Source)
	at java.util.TreeMap.putAll(Unknown Source)
	at java.util.TreeMap.<init>(Unknown Source)
	at com.lara.M88.main(M88.java:39)

 */