package com.lara;

import java.util.ArrayList;

public class M20 {
	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(10);
	list.add("hello");
	list.add(true);
	list.add('y');
	list.add(9.5);
	list.add(true);
	Object[] elements=list.toArray();
	for(Object obj:elements)
	{
		System.out.println(obj + ", ");
	}
	}
}
/*
ever

*/

