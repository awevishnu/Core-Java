package com.lara;

import java.util.HashMap;

public class M75 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		System.out.println(map.put("test", 300));
		System.out.println("-------------------");
		System.out.println(map);
		System.out.println(map.put("test", 500));
		System.out.println("-------------------");
		System.out.println(map);
		System.out.println(map.put("test", "abc"));
		System.out.println("-------------------");
		System.out.println(map.put("test", 't'));
		System.out.println("-------------------");
		System.out.println(map);
		System.out.println(map.put("test", true));
		System.out.println("-------------------");
		System.out.println(map);
		System.out.println(map.put("test", 500));
		System.out.println("-------------------");
		System.out.println(map);
	}
}
/*
keys can not be duplicate in map.
while storing 300 nothing is replacing , thats why null.
next 300 is replacing is 500 , 300 is showing.
put method return type is Object, which ever value is replacing that value is returning.
 */