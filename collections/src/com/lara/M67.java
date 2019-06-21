package com.lara;

import java.util.HashSet;

public class M67 {
	static class A {
		int i;
	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		A a1 = new A();
		a1.i = 10;
		System.out.println("a1.hashCode(): " + a1.hashCode());
		
		A a2 = new A();		
		a2.i=10;
		System.out.println("a1.equals(a2): " + a1.equals(a2));
		
		A a3= a2;
		System.out.println("a3.equals(a2): " + a3.equals(a2));
		
	}
}

/*
 
a1.hashCode(): 366712642
a1.equals(a2): false
a3.equals(a2): true

Object class equals method comparing reference.
object class returns integer representation of memory address.

*/
