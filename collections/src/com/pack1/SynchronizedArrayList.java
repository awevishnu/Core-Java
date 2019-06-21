package com.pack1;

import java.util.ArrayList;

public class SynchronizedArrayList  extends ArrayList{
	private ArrayList list;
	public SynchronizedArrayList(ArrayList list)
	{
		this.list=list;
	}
	public boolean add(Object e)
	{
		boolean flag = false;
		synchronized(list)
		{
			flag=list.add(e);
		}
		return flag;
	}
	public Object get(int index)
	{
		Object obj=null;
		synchronized (list) 
		{
			obj=list.get(index);
		}
		return obj;
	}
  public Object set(int index,Object element)
  {
	 Object obj=null;
	 synchronized (list) 
	 {
		obj=list.set(index, element);
	}
	 return obj;
  }
  public Object remove(int index)
  {
	  Object obj=null;
		 synchronized (list) 
		 {
			obj=list.remove(index);
		}
		 return obj;
	  }  
  
  @Override
public boolean contains(Object o) {
	boolean flag=false;
	synchronized (list) {
	flag=list.contains(o);
	}
	return flag;
}
  //same other method also
public static void main(String[] args) {
	
}
}
