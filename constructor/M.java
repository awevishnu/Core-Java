class M
{
	static int count;
	M()
	{
	}
	M(int i)
	{
	}
	M(int i,int j)
	{
	}
	
	{
		count++;
	}
	
	public static void main(String args[])
	{
		M obj1=new M();
		M obj2=new M();
		M obj3=new M(20);
		M obj4=new M(120);
		M obj5=new M(120,10);
		M obj6=new M(1,10);
		System.out.println(M.count);
	}
}
// 6, in prev class in every constructor we wrote the common code count ++ , instead of that we can use IIB to add the common code .