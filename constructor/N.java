class N
{
	static int count;
	N()
	{
		this(90);
	}
	N(int i)
	{
		this(1,60);
	}
	N(int i,int j)
	{
		
	}
	{
		count++;
	}
	
	public static void main(String args[])
	{
		N obj1=new N();
		N obj2=new N();
		N obj3=new N(20);
		N obj4=new N(120);
		N obj5=new N(120,10);
		N obj6=new N(1,10);
		System.out.println(N.count);
	}
}