package com.lara;

import java.util.HashSet;

public class M70 {
	static class A {
		int i, j, k;

		public A(int i, int j, int k) {
			super();
			this.i = i;
			this.j = j;
			this.k = k;
		}

		@Override
		public String toString() {

			return "A[i=" + i + ", j=" + j + ",k=" + k + "]";
		}

		@Override
		public int hashCode() {

			int hash = Integer.toString(i).hashCode();
			hash += Integer.toString(j).hashCode();
			hash += Integer.toString(k).hashCode();
			System.out.println("hashCode for "+this+" is "+hash+"");
			return hash;
		}

		@Override
		public boolean equals(Object obj) {
			boolean flag = (i == ((A) obj).i && j == ((A) obj).j && k == ((A) obj).k);
			System.out.println("equals b/w "+ this +" and "+obj+" is "+flag+"");
			return flag;
		}
	}

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		
		A a1 = new A(10, 20, 30);
		A a2 = new A(10, 20, 30);
		A a3 = new A(20, 10, 30);
		A a4 = new A(20, 10, 30);
		A a5 = new A(10, 30, 20);
		A a6 = new A(10, 30, 20);
		A a7 = new A(20, 30, 10);
		A a8 = new A(20, 30, 10);
		A a9 = new A(30, 30, 30);
		A a10 = new A(20, 20, 20);

        System.out.println("adding status of "+a1+" + is : " + set.add(a1));
        System.out.println("------------------------------------------------");
        System.out.println("adding status of "+a2+" + is : " + set.add(a2));
        System.out.println("------------------------------------------------");
        System.out.println("adding status of "+a3+" + is : " + set.add(a3));
        System.out.println("------------------------------------------------");
        System.out.println("adding status of "+a4+" + is : " + set.add(a4));
        System.out.println("------------------------------------------------");
        System.out.println("adding status of "+a5+" + is : " + set.add(a5));
        System.out.println("------------------------------------------------");
        System.out.println("adding status of "+a6+" + is : " + set.add(a6));
        System.out.println("------------------------------------------------");
        System.out.println("adding status of "+a7+" + is : " + set.add(a7));
        System.out.println("------------------------------------------------");
        System.out.println("adding status of "+a8+" + is : " + set.add(a8));
        System.out.println("------------------------------------------------");
        System.out.println("adding status of "+a9+" + is : " + set.add(a9));
        System.out.println("------------------------------------------------");
        System.out.println("adding status of "+a10+" + is : " + set.add(a10));
        System.out.println("------------------------------------------------");
        System.out.println(set);
	}
}

/*

adding status of A[i=10, j=20,k=30] + is : true
------------------------------------------------
adding status of A[i=10, j=20,k=30] + is : false
------------------------------------------------
adding status of A[i=20, j=10,k=30] + is : true
------------------------------------------------
adding status of A[i=20, j=10,k=30] + is : false
------------------------------------------------
adding status of A[i=10, j=30,k=20] + is : true
------------------------------------------------
adding status of A[i=10, j=30,k=20] + is : false
------------------------------------------------
adding status of A[i=20, j=30,k=10] + is : true
------------------------------------------------
adding status of A[i=20, j=30,k=10] + is : false
------------------------------------------------
adding status of A[i=30, j=30,k=30] + is : true
------------------------------------------------
adding status of A[i=20, j=20,k=20] + is : true
------------------------------------------------
[A[i=30, j=30,k=30], A[i=10, j=20,k=30], A[i=20, j=10,k=30], A[i=10, j=30,k=20], A[i=20, j=30,k=10], A[i=20, j=20,k=20]] 
 
linkedlist concept .
current  element is comparing with previous element.
inside the bucket linkedlist
 */
