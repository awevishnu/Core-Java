package com.lara;

import java.util.HashMap;
import java.util.Set;

public class M93 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test",4.5);
		map.put("abc",4.5);
		map.put("check",4.5);
		map.put("done",4.5);
		map.put("xyz",4.5);
		map.put("xyz",5.5);
		System.out.println(map);
		Set set=map.keySet();
		for(Object key:set)
		{
			System.out.println(key +":"+map.get(key));
		}
	}
}

/*

{abc=4.5, test=4.5, xyz=4.5, check=4.5, done=4.5}
[abc, test, xyz, check, done]


 */