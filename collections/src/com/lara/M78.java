package com.lara;

import java.util.Hashtable;

public class M78 {

	public static void main(String[] args) {
		Hashtable table=new Hashtable();
		table.put(null, "test");
		//table.put(null,1);
		System.out.println(table);
	}
}
/*

Hashtable not allowing null as value and key.
Hashtable is synchronized.
Exception in thread "main" java.lang.NullPointerException
	at java.util.Hashtable.put(Unknown Source)
	at com.lara.M78.main(M78.java:9)
 */