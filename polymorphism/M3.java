abstract class A
{
	abstract void test();
	
}
class B extends A
{
	void test()
	{
		System.out.println("from C.test()");
	}
}
class C extends B
{
	void test()
	{
		System.out.println("from B.test()");
	}
}
class M3
{
	public static void main(String args[])
	{
		A a1=new B();
		A a2=new C();
		
		A[] elements={a1,a2};
		for(A element:elements)
		{
			element.test();
		}
	}
}
//abstract method is getting overrided
/*
from C.test()
from B.test()

*/
