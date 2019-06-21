package com.lara;

import java.util.ArrayList;

public class M10 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("hello");
		list.add(true);
		list.add('y');
		list.add(9.5);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(true);
		System.out.println(list);
	}
}
