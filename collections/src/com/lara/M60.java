package com.lara;

import java.util.HashSet;

public class M60 {
	static class A {
		int i;

		A(int i) {
		this.i = i;
		}
		@Override
		public int hashCode() {
			return Integer.toString(i).hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return i==((A)obj).i;
		}
		public String toString() {
			return "(i=" + i + ")";
		}
	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set);

	}

}
/*

true
false
false
false
[(i=90)]

 */
