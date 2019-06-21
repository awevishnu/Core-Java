package com.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M53 {
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


static class B implements Comparator
{
	@Override
	public int compare(Object o1,Object o2)
	{
		return ((A)o1).i-((A)o2).i;
	}
}
static class C implements Comparator
{
	@Override
	public int compare(Object o1,Object o2)
	{
		return ((A)o1).j-((A)o2).j;
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
	Collections.sort(list,new B());
	System.out.println(list);
	Collections.sort(list,new C());
	System.out.println(list);
}
}
//while using comparable we can not use anonymus inner class and lamda expressions.