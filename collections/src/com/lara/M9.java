package com.lara;

import java.util.ArrayList;

public class M9 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("hello");
		list.add(true);
		list.add('y');
		list.add(9.5);
		System.out.println(list);
		list.remove(5);
		System.out.println(list);

	}

}
