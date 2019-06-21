package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M1 {
public static void main(String[] args) {
	List list=new ArrayList();
	/* Part 1 */
	list.add("test");
	list.add("abc");
	list.add("hello");
	
	list=Collections.synchronizedList(list);
	
	/*Part 2*/
	
	list.add("test");
	list.add("abc");
	list.add("hello");
	
	System.out.println(list);
}
}
