package com.lara;

import java.util.HashMap;

public class M86 {

	static class A {
		int i;

		A(int i) {
			this.i = i;
		}

		@Override
		public String toString() {
			return "(i= " + i + ")";
		}

	}

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(new A(90),"test" );
		map.put(new A(90),"test" );
		map.put(new A(90),"test" );
		map.put(new A(90),"test" );
		map.put(new A(90),"test" );
		map.put(new A(90),"test" );
		System.out.println(map);
	}
}
/*
 
 {(i= 90)=test, (i= 90)=test, (i= 90)=test, (i= 90)=test, (i= 90)=test, (i= 90)=test}

 */