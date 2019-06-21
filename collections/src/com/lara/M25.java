package com.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(0);
		list.add(200);
		list.add(50);
		System.out.println(list);
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);

	}

}
/*
[100, 10, 0, 200, 50]
[200, 100, 50, 10, 0]

 */