package com.pack1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class M3 {
public static void main(String[] args) {
	CopyOnWriteArraySet list=new CopyOnWriteArraySet();
	list.add(90);
	list.add(910);
	list.add(910);
	list.add(1901);
	System.out.println(list);
	Iterator it=list.iterator();
	list.add(9000);
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println(list);
}
}
/*
this is fail safe iterator.iterator in concurrent package is fail safe, it allowing concurrent modifications
with out data corruption.

in memory elements are duplicated, for avoiding the data corruption.
memory overhead is happening here, but more performance.
no data corruption, performance increased.
=================================================================
[90, 910, 1901]
90
910
1901
[90, 910, 1901, 9000]
*/