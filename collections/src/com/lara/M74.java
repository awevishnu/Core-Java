package com.lara;

import java.util.HashMap;

public class M74 {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put("test", 300);
		map.put(500,"abc");
		map.put(true,'t');
		map.put(5.5,"done" );
		System.out.println(map);
	}
}
/*
{test=300, 500=abc, 5.5=done, true=t}

put method is taking two arguments, key and value.
keys can be any data type values also can be any data type.
*/