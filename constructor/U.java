class U
{
	int test()
	{
		return j;//indirect read is allowed before notifying JVM
		
	}
	int i=test();
	int j=10;
	public static void main(String args[])
	{
		U u1=new U();
		System.out.println(u1.i +", "+u1.j);
		
		
		
	}
}
//0, 10