package com.lara;

import java.util.ArrayList;
import java.util.Collections;

public class M23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10.0);
		list.add(0);
		list.add(200);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
/*
 * [100, 10.0, 0, 200, 50] Exception in thread "main"
 * java.lang.ClassCastException: java.lang.Integer cannot be cast to
 * java.lang.Double
 * 
 All elements should be same type

 */