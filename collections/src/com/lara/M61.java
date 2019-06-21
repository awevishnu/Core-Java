package com.lara;

import java.util.HashSet;

public class M61 {
	static class A {
		int i;

		A(int i) {
			this.i = i;
		}

		@Override
		public int hashCode() {
			int hash = Integer.toString(i).hashCode();
			System.out.println("hashCode for " + this + " is " + hash);
			return Integer.toString(i).hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			boolean flag = i == ((A) obj).i;
			System.out.println("equals b/w " + this + " and " + obj + " is " + flag);
			return flag;
		}

		public String toString() {
			return "(i=" + i + ")";
		}
	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println("adding status:"+set.add(new A(90)));
		System.out.println("adding status:"+set.add(new A(90)));
		System.out.println("adding status:"+set.add(new A(90)));
		System.out.println("adding status:"+set.add(new A(90)));
		System.out.println(set);

	}

}
/*

hashCode for (i=90) is 1815
true
hashCode for (i=90) is 1815
equals b/w (i=90) and (i=90) +flag+
false
hashCode for (i=90) is 1815
equals b/w (i=90) and (i=90) +flag+
false
hashCode for (i=90) is 1815
equals b/w (i=90) and (i=90) +flag+
false
[(i=90)]

HashSet internally calls equals and hashcode method.

Hashset internally using buckets to store the element.
while adding first element calling hashcode method, getting a hashnumber
storing first element in the first bucket.first element is not a duplicate method, so need to call equls method
bucket giving a label.if any other element also having the same hashcode value that element also adding in the same array.

 */
