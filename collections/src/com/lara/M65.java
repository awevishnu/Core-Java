package com.lara;

import java.util.HashSet;

public class M65 {
	static class A {
		int i;
	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		A a1 = new A();
		a1.i = 10;
		System.out.println("a1.hashCode(): " + a1.hashCode());
		System.out.println("a1.equals(a1): " + a1.equals(a1));
		
		A a2= new A();
		a2.i = 10;
		System.out.println("a2.hashCode(): " + a2.hashCode());
		
		A a3= new A();
		a3.i = 10;
		System.out.println("a3.hashCode(): " + a3.hashCode());
		
	}
}

/*
 
a1.hashCode(): 366712642
a1.equals(a1): true
a2.hashCode(): 1829164700
a3.hashCode(): 2018699554

it s default hashcode method.object class hashcode method which returns memory address.hexadecimal value.
 */
