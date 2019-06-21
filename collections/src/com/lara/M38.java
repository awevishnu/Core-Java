package com.lara;

import java.util.ArrayList;
import java.util.Iterator;

public class M38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(0);
		list.add(200);
		list.add(50);
		Iterator it = list.iterator();	  
		it.forEachRemaining((t) -> System.out.println(t));
		System.out.println(list);
		//System.out.println(list);
	}
}

/*
100
10
0
200
50
[100, 10, 0, 200, 50]

if we want to process element by element we can use forEachRemaining.which is introduced in JDK 1.8

 */