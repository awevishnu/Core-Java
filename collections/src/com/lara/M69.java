package com.lara;

public class M69 {
	static class A {
		int i, j;

		A(int i, int j) {
			this.i = i;
			this.j = j;
		}

		@Override
		public int hashCode() {
			return i + j;
		}

		@Override
		public boolean equals(Object obj) {
			return i == ((A) obj).i && j == ((A) obj).j;
		}
	}

	public static void main(String[] args) {
		A a1 = new A(10, 20);
		A a2 = new A(10, 20);
		A a3 = new A(20, 10);
		A a4 = new A(20, 10);
		A a5 = new A(20, 20);
		
		System.out.println("a1.hashCode(): " + a1.hashCode());
		System.out.println("a2.hashCode(): " + a2.hashCode());
		System.out.println("a3.hashCode(): " + a3.hashCode());
		System.out.println("a4.hashCode(): " + a4.hashCode());
		System.out.println("a5.hashCode(): " + a5.hashCode());

		System.out.println("a1.equals(a2): " + a1.equals(a2));
		System.out.println("a1.equals(a3): " + a1.equals(a3));
		System.out.println("a1.equals(a4): " + a1.equals(a4));
		System.out.println("a1.equals(a5): " + a1.equals(a5));

		System.out.println("a2.equals(a3): " + a2.equals(a3));
		System.out.println("a2.equals(a4): " + a2.equals(a4));
		System.out.println("a2.equals(a5): " + a2.equals(a5));

		System.out.println("a3.equals(a4): " + a3.equals(a4));
		System.out.println("a3.equals(a5): " + a3.equals(a5));

		System.out.println("a4.equals(a5): " + a4.equals(a5));
	}
}

/*

a1.hashCode(): 30
a2.hashCode(): 30
a3.hashCode(): 30
a4.hashCode(): 30
a5.hashCode(): 40

a1.equals(a2): true
a1.equals(a3): false
a1.equals(a4): false
a1.equals(a5): false
a2.equals(a3): false
a2.equals(a4): false
a2.equals(a5): false
a3.equals(a4): true
a3.equals(a5): false
a4.equals(a5): false

hashcode() introduced for inequality.
but it can not confirm equality.

equals() can be used for equality and inequality.

from equals() itself we can check the equality and inequality. then what is the need of hashcode()?

in equals() boolean expression have to evaluate, if 20 values are there equals() have to execute. it will take time.
equals method is comparing attribute by attribute.

if you are looking for performance go with hashcode().--ultimate performance.
if you want more accuracy go for equals().

we can use both togother- real time equality will be less , inequality will be more.
 */
