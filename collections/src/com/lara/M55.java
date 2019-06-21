package com.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M55 {
public static class A
{
	int i,j;

	public A(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "(i="+ i +",j="+j+")";
	}
}

public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(new A(25,0));
	list.add(new A(49,10));
	list.add(new A(19,40));
	list.add(new A(39,5));
	list.add(new A(29,20));
	System.out.println(list);
	Collections.sort(list,(o1,o2) -> ((A)o1).i-((A)o2).i);
	System.out.println(list);
	Collections.sort(list,(o1,o2) -> ((A)o1).j-((A)o2).j);
	System.out.println(list);
}
}
//using lamda expressions here.
/*

[(i=25,j=0), (i=49,j=10), (i=19,j=40), (i=39,j=5), (i=29,j=20)]
[(i=19,j=40), (i=25,j=0), (i=29,j=20), (i=39,j=5), (i=49,j=10)]
[(i=25,j=0), (i=39,j=5), (i=49,j=10), (i=29,j=20), (i=19,j=40)]

*/