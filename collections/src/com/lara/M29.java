package com.lara;

import java.util.ArrayList;
import java.util.Collections;

public class M29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =new ArrayList();
		list.add(100);
		list.add(10);
		list.add(0);
		list.add(200);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list,11));		

	}
}


/*
searching for the element which is not available.
[100, 10, 0, 200, 50]
[0, 10, 50, 100, 200]
-6

>200 -6
-10- -1
11- -3

*/