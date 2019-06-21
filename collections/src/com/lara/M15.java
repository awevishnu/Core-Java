package com.lara;

import java.util.ArrayList;

public class M15 {
	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(10);
	list.add("hello");
	list.add(true);
	list.add('y');
	list.add(9.5);
	list.add(true);
	System.out.println(list);
	if(list.contains(9.5))
	{
		System.out.println("9.5 is available");
	}
	System.out.println(list);
}
}