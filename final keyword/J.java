class J
{
	 static void test(int x, final int y)
	{
	x=10;
	y=10;
	System.out.println("---------");
	x=10;
	y=10;
	System.out.println("---------");
	}
}
			

/*
J.java:6: error: final parameter y may not be assigned
        y=10;
        ^
J.java:9: error: final parameter y may not be assigned
        y=10;
        ^
2 errors
*/