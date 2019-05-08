class A
{
	public static  void test()
	{
		System.out.println("from A.test()");
	}
	
}
class B extends A
{
		public static void test()
		{
		System.out.println("from B.test()");
		}
}

class M6
{
	public static void main(String args[])
	{
		A a1=new A();
		A a2=new B();
		
		A[] elements={a1,a2};
		for(A element:elements)
		{
			element.test();//A.test();
			
		}
	}
}
//static method is not part of the object.when ever creating the object static members are not loading.so here we can't achive polymorphism using static members.
//static members are class members.A class static member always be A class member even though it is inheriting to B it will act as A member only.
//we can not over ride static members.
//static members can not be abstract.becoz can not override into subclass
/*
from A.test()
from A.test()

*/

