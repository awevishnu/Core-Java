package com.lara;

import java.util.TreeMap;

public class M80 {

	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put("test",6000);
		map.put("abc", 500);
		map.put("java", 50);
		map.put("xyz", 4);
		map.put("btm", 8000);
		System.out.println(map);
	}
}
/*

sorted order.
sorting is based on the keys.

3 condtions with respect to keys

1.keys should be either comparable or separate comparator should be there.
2.same type.
3.keys can not be null

{abc=500, btm=8000, java=50, test=6000, xyz=4}

 */