package com.lara;

import java.util.ArrayList;
import java.util.Iterator;

public class M32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(0);
		list.add(200);
		list.add(50);
		Iterator it = list.iterator();
		while (it.hasNext()) {
          System.out.println(it.next());
		}
		System.out.println("-----");
		while (it.hasNext()) {
	          System.out.println(it.next());
			}
		System.out.println(list);
	}
}

/*
 100
10
0
200
50
-----
[100, 10, 0, 200, 50]

by using iterator we can read only one time .not more than one time.
 */