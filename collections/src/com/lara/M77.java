package com.lara;

import java.util.Hashtable;

public class M77 {

	public static void main(String[] args) {
		Hashtable table=new Hashtable();
		table.put(123, null);
		//table.put(null,1);
		System.out.println(table);
	}
}
/*

Hashtable not allowing null as value and key.
Exception in thread "main" java.lang.NullPointerException
	at java.util.Hashtable.put(Unknown Source)
	at com.lara.M77.main(M77.java:9)
 */