class A
{
	static
	{
		System.out.println("from A SIB");
	}
	public static  void test()
	{
		System.out.println("from A.test()");
	}
	
}
class B extends A
{
	static
	{
		System.out.println("from B SIB");
	}
}

class M7
{
	public static void main(String args[])
	{
		B.test();//A.test();
	}
}
/* B class not involving in the execution. so B is not loading into memory.
test() inherited from A to B. But it is the member of A only.
super class static member in subclass , compiler replaces to super class member
*/
/*
from A SIB
from A.test()

*/

