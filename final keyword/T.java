class T
{
	final int i;
	T()
	{
		i=10;
	}
	T(int x)
	{
		this();
		i=20;
	}
}
			

/*
T.java:11: error: variable i might already have been assigned
                i=20;
                ^
1 error

this() is again executing the constructor.attempting to reinitialize the i value.
*/