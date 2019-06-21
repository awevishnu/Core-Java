package com.lara;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class M96 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("test", 4.5);
		map.put("abc", 4.1);
		map.put("check", 1.5);
		map.put("done", 5.5);
		map.put("xyz", 4.8);
		System.out.println(map);
		Comparator c1 = (o1, o2) -> ((Double) ((Map.Entry) o1).getValue())
				.compareTo((Double) ((Map.Entry) o2).getValue());

		Set entries = map.entrySet();
		TreeSet set = new TreeSet();
		set.addAll(entries);
		System.out.println(set);
		
	}
}

/*

sorting content of the hashmap based on the values.
{abc=4.1, test=4.5, xyz=48, check=1.5, done=5.5}
{abc=4.1, check=1.5, done=5.5, test=4.5, xyz=48}

 */