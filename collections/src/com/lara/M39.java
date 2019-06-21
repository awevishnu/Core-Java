package com.lara;

import java.util.ArrayList;
import java.util.Iterator;

public class M39 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(0);
		list.add(200);
		list.add(50);
		Iterator it = list.iterator();	  
		list.add(500);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(list);
		//System.out.println(list);
	}
}

/*
Exception in thread "main" java.util.ConcurrentModificationException.

we should not do any updatable operations before iterating.
because it is failfast iterator, it wont allow concurrent modifications
 */