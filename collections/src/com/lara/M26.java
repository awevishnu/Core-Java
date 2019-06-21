package com.lara;

import java.util.ArrayList;
import java.util.Collections;

public class M26 {
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
		System.out.println(Collections.binarySearch(list, 50));		
		System.out.println(list);

	}
}
//binary search should be in the sorted array.
/*
[100, 10, 0, 200, 50]
2
[0, 10, 50, 100, 200]
*/