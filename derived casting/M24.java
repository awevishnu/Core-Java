class M24
{
	public static void main(String []args)
	{
		Object obj=new D();
		A a1=obj;
		System.out.println("---------");
		B b1=obj;
		System.out.println("---------");
		C c1=obj;
		System.out.println("---------");
		D d1=obj;
		System.out.println("---------");
		E e1=obj;
		System.out.println("---------");
	}
}
/*
M24.java:6: error: incompatible types: Object cannot be converted to A
                A a1=obj;
                     ^
M24.java:8: error: incompatible types: Object cannot be converted to B
                B b1=obj;
                     ^
M24.java:10: error: incompatible types: Object cannot be converted to C
                C c1=obj;
                     ^
M24.java:12: error: incompatible types: Object cannot be converted to D
                D d1=obj;
                     ^
M24.java:14: error: incompatible types: Object cannot be converted to E
                E e1=obj;
                     ^
5 errors
*/