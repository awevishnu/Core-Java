package com.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M54 {
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
	Collections.sort(list,new Comparator()
			{
		public int compare(Object o1,Object o2)
		{
			return ((A)o1).i-((A)o2).i;
		}
			}
			);
	System.out.println(list);
	Collections.sort(list,new Comparator()
			{
		public int compare(Object o1,Object o2)
		{
			return ((A)o1).j-((A)o2).j;
		}
			});
	System.out.println(list);
}
}
//using anonymus inner class here.