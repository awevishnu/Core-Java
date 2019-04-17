class H
{
	static int count;
	H()
	{
		count++;
	}
	public static void main(String[] args)
	{
		H obj1=new H();
		System.out.println("obj1.count "+obj1.count );//System.out.println("obj4.count "+H.count )
		H obj2=new H();
		H obj3=new H();
		H obj4=new H();
		
		System.out.println("obj2.count "+obj2.count );//System.out.println("obj2.count "+H.count );
		System.out.println("obj3.count "+obj3.count );//System.out.println("obj3.count "+H.count );
		System.out.println("obj4.count "+obj4.count );//	System.out.println("obj4.count "+H.count );
	}
	}
}
/*
obj1.count 1
obj2.count 4
obj3.count 4
obj4.count 4
*/