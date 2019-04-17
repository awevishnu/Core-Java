class Z
{
	Z()
	{
		Z z1=new Z();
	}
	
	public static void main(String args[])
	{
		Z z1=new Z();
		System.out.println("done");
		
	}
}
/*
Exception in thread "main" java.lang.StackOverflowError
        at Z.<init>(Z.java:5)
        at Z.<init>(Z.java:5)
*/

//for the same class dont create the object in constructor or IIB
