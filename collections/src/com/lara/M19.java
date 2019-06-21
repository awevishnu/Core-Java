package com.lara;

import java.util.ArrayList;

public class M19 {
	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(10);
	list.add("hello");
	list.add(true);
	list.add('y');
	list.add(9.5);
	list.add(true);
	for(Object obj: list)
	{
		System.out.println(obj);
	}
	}
}
/*
in collection size()

[10, hello, true, y, 9.5, true]
6

*/

