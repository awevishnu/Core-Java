class M44
{
	public static void main(String[] args)
	{
		A a1=new C();
		C c1=new C();
		System.out.println(a1.i);
		if(a1 instanceof C)
		{
			C obj=(C) a1;
			System.out.println(obj.i);
			System.out.println(obj.j);
		}
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
	
		
	}
}	
/*
0
0
0
0
0
0
*/