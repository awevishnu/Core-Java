class M20
{
	public static void main(String []args)
	{
		B b1=new B();
		C c1=b1;
		System.out.println("---------");
		D d1=b1;
		System.out.println("---------");
	}
}
/*
M20.java:6: error: incompatible types: B cannot be converted to C
                C c1=b1;
                     ^
M20.java:8: error: incompatible types: B cannot be converted to D
                D d1=b1;
                     ^
2 errors
*/