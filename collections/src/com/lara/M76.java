package com.lara;

import java.util.HashMap;

public class M76 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(123, null);
		map.put(null,"test");
		map.put(null, null);
		System.out.println(map);
	}
}
/*
HashMap allows null as key and value.
maximum one key can be null.
map.put(123, null);
 */