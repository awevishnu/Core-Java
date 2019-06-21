package com.lara;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class M34 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(0);
		list.add(200);
		list.add(50);
		Iterator it = list.iterator();
	Consumer c1=new Consumer()
			{
		public void accept(Object t)
		{
			System.out.println(t);
		}
			};
		it.forEachRemaining(c1);
		System.out.println(list);
	}
}

/*
 Consumer is a functional interface.
 forEachRemaining method require consumer type argument.
 */