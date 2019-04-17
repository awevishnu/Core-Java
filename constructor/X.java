class X
{
	X()
	{
		System.out.println("X() :"+i);
	}
	{
		X x1=new X();
		System.out.println("IIB:" + x1.i);
	}
	int i;
	public static void main(String args[])
	{
		
		System.out.println("done");
			X obj=new X();		
		
	}
	
}
//compilation is successfull , RE due to recursion
/*
done
Exception in thread "main" java.lang.StackOverflowError
        at X.<init>(X.java:8)
        at X.<init>(X.java:8)
		
	
*/
