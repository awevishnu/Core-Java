package com.lara;

import java.util.HashSet;

public class M57 {
public static void main(String[] args) {
	HashSet set=new HashSet();
	System.out.println(set.add("hello"));
	System.out.println(set.add("hello"));
	System.out.println(set.add("hello"));
	System.out.println(set.add("hello"));
	System.out.println(set);
	
}
	
}
/*
true
true
false
false
false
[hello]
no compile and runtime error , it returns false in case of duplicates.
add method return type is boolean.
How hashset able to identify duplicates.
it internally use hashcode() and equals() , in wrapper classes ,string class both of the methods are overriding.

 */

