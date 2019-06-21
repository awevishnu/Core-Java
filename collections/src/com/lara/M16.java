package com.lara;

import java.util.ArrayList;

public class M16 {
	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(10);
	list.add("hello");
	list.add(true);
	list.add('y');
	list.add(9.5);
	list.add(true);
	System.out.println(list);
	System.out.println(list.contains("hello"));
	System.out.println(list.contains(20));
	System.out.println(list.contains(true));
}
}
/*
[10, hello, true, y, 9.5, true]
true
false
true

*/