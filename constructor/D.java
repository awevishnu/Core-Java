class D
{
	D()
	{
		System.out.println("D()");
	}
	{
		System.out.println("IIB");
	}
	D(int i)
	{
		System.out.println("D(int)");
	}
	 public static void main(String[] args)
	 {
		 D d1=new D();
		System.out.println("---------");
		 D d2=new D(20);
		System.out.println("---------");
}
}
/*
IIB
D()
---------
IIB
D(int)
---------
*/