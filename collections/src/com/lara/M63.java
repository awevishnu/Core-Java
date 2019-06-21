package com.lara;

import java.util.HashSet;

public class M63 {
	static class A {
		int i;
	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		A a1 = new A();
		a1.i = 10;
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
 
 true
-----------
false
-----------
false
-----------
false
-----------
[com.lara.M63$A@15db9742]
 */
