class Z1
{
	final static int i=100;
	static 
	{
		i=10;
	}
}
			

/*
Z1.java:6: error: cannot assign a value to final variable i
        i=10;
        ^
1 error
*/