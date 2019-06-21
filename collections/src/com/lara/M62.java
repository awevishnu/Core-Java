package com.lara;

import java.util.HashSet;

public class M62 {
	static class A {
		int i, j;

		A(int i, int j) {
			this.i = i;
			this.j = j;
		}

		public String toString() {
			return "(i=" + i + " , j=" + j + ")";
		}

		@Override
		public int hashCode() {
			int hash = Integer.toString(i).hashCode();
			hash += Integer.toString(j).hashCode();
			System.out.println("hashCode for " + this + " is " + hash);
			return Integer.toString(i).hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			boolean flag = (i == ((A) obj).i) && (j == ((A) obj).j);
			System.out.println("equals b/w " + this + " and " + obj + " is " + flag);
			return flag;
		}

	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println("adding status:" + set.add(new A(90, 20)));
		System.out.println("-----------");
		System.out.println("adding status:" + set.add(new A(90, 20)));
		System.out.println("-----------");
		System.out.println("adding status:" + set.add(new A(20, 90)));
		System.out.println("-----------");
		System.out.println("adding status:" + set.add(new A(90, 20)));
		System.out.println("-----------");
		System.out.println(set);

	}

}

/*

hashCode for (i=90 , j=20) is 3413
adding status:true
-----------
hashCode for (i=90 , j=20) is 3413
equals b/w (i=90 , j=20) and (i=90 , j=20) is true
adding status:false
-----------
hashCode for (i=20 , j=90) is 3413
adding status:true
-----------
hashCode for (i=90 , j=20) is 3413
equals b/w (i=90 , j=20) and (i=90 , j=20) is true
adding status:false
-----------
[(i=90 , j=20), (i=20 , j=90)]

 */
