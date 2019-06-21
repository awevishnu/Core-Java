package com.pack1;

import java.util.ArrayList;

public class M2 {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	/* Part 1 - non synchronized*/
	
	list=new SynchronizedArrayList(list);
	
	/*Part 2*/
	
	list.add(90);
	list.add(910);
	
	System.out.println(list);
}
}
/*
list.add(90);
list.set(1,"abc");
both are different method, for both method we are passing the same object, so lock will be there.

accuracy increasing performance decreasing in this approach.
no data corruption - poor performance.
*/