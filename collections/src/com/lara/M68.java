package com.lara;

public class M68 {
	static class A {
		int i;

		@Override
		public int hashCode() {
			return i;
		}

		@Override
		public boolean equals(Object obj) {
			return i == ((A) obj).i;
		}
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;

		A a2 = new A();
		a2.i = 10;

		A a3=a2;
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a3));
	}
}

/*
 
10
10
10
true
true

 */
