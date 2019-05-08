class A 
{
	static final void test1()
	{
	}
	static void test2()
	{
	}
}
class B extends A 
{
	static void test1()
	{
	}
	static void test2()
	{
	}
}	

class M4
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
	}
}

/*
M4.java:12: error: test1() in B cannot override test1() in A
        static void test1()
                    ^
  overridden method is static,final
1 error

static method is not involving in polymorphism.
test1 is final method.

*/