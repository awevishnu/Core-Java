package com.lara;

import java.util.HashMap;
import java.util.Set;

public class M94 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 4.5);
		map.put("abc", 4.1);
		map.put("check", 1.5);
		map.put("done", 5.5);
		map.put("xyz", 48);
		System.out.println(map);
		Set entries = map.entrySet();
		for (Object entry : entries) {
			System.out.println(entry);
		}
	}
}

/*
Set object contains the entry objects
{abc=4.1, test=4.5, xyz=48, check=1.5, done=5.5}

abc=4.1
test=4.5
xyz=48
check=1.5
done=5.5

 */