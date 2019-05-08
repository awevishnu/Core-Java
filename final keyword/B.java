class B
{
	public static void main(String args[])
	{
		final int i=10;
		int j=20;
		System.out.println(i);
		System.out.println(j);
		i=10;
		j=20;
		System.out.println(i);
		System.out.println(j);
	}
			
}
/*
B.java:9: error: cannot assign a value to final variable i
                i=10;
*/