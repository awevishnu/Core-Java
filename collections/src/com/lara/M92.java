package com.lara;

import java.util.HashMap;
import java.util.Set;

public class M92 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test",4.5);
		map.put("abc",4.5);
		map.put("check",4.5);
		map.put("done",4.5);
		map.put("xyz",4.5);
		System.out.println(map);
		System.out.println(map.get("check"));
		System.out.println(map.get("xyz"));
		System.out.println(map.get("hello"));

	}
}

/*

{abc=4.5, test=4.5, xyz=4.5, check=4.5, done=4.5}
4.5
4.5
null



 */