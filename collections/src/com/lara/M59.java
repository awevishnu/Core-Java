package com.lara;

import java.util.HashSet;

public class M59 {
	static class A {
		int i;

		A(int i) {
			this.i = i;
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
true
true
true
[(i=90), (i=90), (i=90), (i=90)]
 */
