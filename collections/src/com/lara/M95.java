package com.lara;

import java.util.HashMap;
import java.util.TreeMap;

public class M95 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 4.5);
		map.put("abc", 4.1);
		map.put("check", 1.5);
		map.put("done", 5.5);
		map.put("xyz", 48);
		System.out.println(map);
		TreeMap map1=new TreeMap(map);
		System.out.println(map1);
	}
}

/*
sorting based on the keys.
{abc=4.1, test=4.5, xyz=48, check=1.5, done=5.5}
{abc=4.1, check=1.5, done=5.5, test=4.5, xyz=48}

 */