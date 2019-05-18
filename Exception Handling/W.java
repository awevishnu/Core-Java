class W
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		try
		{
		int i=10;
		i=10/0;
		}
		catch(ArithmeticException ex)//Throwable
		{
		i=20;
		}
		System.out.println("main end");
	}
}

/*
Compiletime Error.
W.java:13: error: cannot find symbol
                i=20;
                ^
  symbol:   variable i
  location: class W
1 error

Local members of the catch can not be accessed from outside the try.
*/