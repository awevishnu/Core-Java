package com.lara;

import java.util.ArrayList;

public class M18 {
	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(10);
	list.add("hello");
	list.add(true);
	list.add('y');
	list.add(9.5);
	list.add(true);
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i)+",");
}
	}
}
/*
in collection size()

[10, hello, true, y, 9.5, true]
6

*/

