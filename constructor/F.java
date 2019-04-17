class F
{
	F()
	{
	 this(90);
	 System.out.println("F()");
	}
	F(int i)
	{
	
	 System.out.println("F(int)");
	}
	{
	System.out.println("IIB");

	}
	public static void main(String args[])
	{
		F f1=new F();
		System.out.println("-------");
		F f2=new F(20);
	}
}