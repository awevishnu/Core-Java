interface A
{
	abstract void test();
	
}
class B implements A
{
	public void test()
	{
		System.out.println("from C.test()");
	}
}
class C implements A
{
	public void test()
	{
		System.out.println("from B.test()");
	}
}
class M5
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
/*
if method is default
M5.java:8: error: test() in B cannot implement test() in A
        void test()
             ^
  attempting to assign weaker access privileges; was public
M5.java:15: error: test() in C cannot implement test() in A
        void test()
             ^
  attempting to assign weaker access privileges; was public
2 errors
*/
