package com.lara;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class M72 {

	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet();
		set.add(120);
		set.add(12);
		set.add(10);
		set.add(0);
		set.add(10);
		set.add(40);
		System.out.println(set);
	}
}
/*
[120, 12, 10, 0, 40]

this is maintining the inserion order.
*/