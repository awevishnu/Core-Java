class K
{
	static int count;
	K()
	{
		count ++;
	}
	K(int i)
	{
		//count ++;	in this case output will be 4
	}
	public static void main(String args[])
	{
		K obj1=new K();
		K obj2=new K();
		K obj3=new K(20);
		K obj4=new K(120);
		System.out.println(K.count);
	}
}
//2
