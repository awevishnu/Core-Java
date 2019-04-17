class E
{
	{
		System.out.println("E IIB 1");

	}
	E()
	{
		System.out.println("E()");

	}
	
	{
		System.out.println("E IIB 2");

	}
	E(int i)
	{
		System.out.println("E(int)");
	}
	public static void main(String[] args)
	 {
		 E e1=new E();
		 System.out.println("-------");
		 E e2=new E(90);

	 }
}
/*
E IIB 1
E IIB 2
E()
-------
E IIB 1
E IIB 2
E(int)
*/