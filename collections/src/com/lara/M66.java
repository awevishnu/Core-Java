package com.lara;

import java.util.HashSet;

public class M66 {
	static class A {
		int i;
	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		A a1 = new A();
		a1.i = 10;
		System.out.println("a1.hashCode(): " + a1.hashCode());
				
		A a2= a1;
		System.out.println("a2.hashCode(): " + a2.hashCode());
		
		A a3= a2;
		System.out.println("a3.hashCode(): " + a3.hashCode());
		
	}
}

/*
 
a1.hashCode(): 366712642
a2.hashCode(): 366712642
a3.hashCode(): 366712642

a1,a2,a3 pointing to same object.
*/
