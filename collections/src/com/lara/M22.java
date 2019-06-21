package com.lara;

import java.util.ArrayList;
import java.util.Collections;

public class M22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =new ArrayList();
		list.add(100);
		list.add(10);
		list.add(0);
		list.add(200);
		list.add(50);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 200));		
		System.out.println(list);

	}

}
/*
  [100, 10, 0, 200, 50]
  3
[100, 10, 0, 200, 50]

with out sorting if binary search happening we will get junk results.//Collections.binarySearch(list, 100) return -4
Binary search should be in the sorted array.
*/
