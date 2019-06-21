package com.lara;

import java.util.HashSet;

public class M58 {
public static void main(String[] args) {
	HashSet set=new HashSet();
	System.out.println(set.add(90));
	System.out.println(set.add(90));
	System.out.println(set.add(90));
	System.out.println(set.add(90));
	System.out.println(set);
	
}
	
}
/*
true
false
false
false
[90]
no compile and runtime error , it returns false in case of duplicates.
 */

