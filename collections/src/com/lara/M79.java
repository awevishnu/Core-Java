package com.lara;

import java.util.LinkedHashMap;

public class M79 {

	public static void main(String[] args) {
		LinkedHashMap map=new LinkedHashMap();
		map.put(123, "test");
		map.put('a', 22);
		map.put(45, true);
		map.put(true, 'u');
		map.put("abc", false);
		System.out.println(map);
	}
}
/*

order of addtion -insertion order.
 */