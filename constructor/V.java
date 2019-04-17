class V

{
	V()
	{
		System.out.println("V():" + i);// we can use any variable in constructor which is currently not notified to JVM
	}
	{
		System.out.println("IIB:" + i);
	}
	int i;
	public static void main(String args[])
	{
		
		System.out.println("done");
		
		
		
	}
}

/*
V.java:9: error: illegal forward reference
                System.out.println("IIB:" + i);
                                            ^
1 error
*/
