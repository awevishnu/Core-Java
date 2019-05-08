abstract class A 
{
	static abstract  void test1();

	
	}


class M3
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
	}
}

/*
M3.java:3: error: illegal combination of modifiers: abstract and static
        static abstract  void test1();
                              ^
1 error


if it is static we are not able to modify further. that's static abstract is the illegal combination.
*/