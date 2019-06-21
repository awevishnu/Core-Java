package com.lara;

import java.util.HashSet;

public class M64 {
	static class A {
		int i;
	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		A a1 = new A();
		a1.i = 10;
		System.out.println("a1.hashCode(): "+a1.hashCode());
		System.out.println("a1.equals(a1): "+a1.equals(a1));
		System.out.println(set.add(a1));
		System.out.println("-----------");
		System.out.println(set.add(a1));
		System.out.println("-----------");
		System.out.println(set.add(a1));
		System.out.println("-----------");
		System.out.println(set.add(a1));
		System.out.println("-----------");
		System.out.println(set);

	}
}

/*
 
a1.hashCode(): 366712642
a1.equals(a1): true
true
-----------
false
-----------
false
-----------
false
-----------
[com.lara.M64$A@15db9742]

 */
