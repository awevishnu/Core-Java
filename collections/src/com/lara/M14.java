package com.lara;

import java.util.ArrayList;

public class M14 {
	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(10);
	list.add("hello");
	list.add(true);
	list.add('y');
	list.add(9.5);
	list.add(true);
	System.out.println(list);
	list.set(6,"test");
	System.out.println(list);
}
}