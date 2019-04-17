class G
{
	int count;
	
	G()
	{
		count++;
	}
	public static void main(String[] args)
	{
		G obj1=new G();
		G obj2=new G();
		G obj3=new G();
		G obj4=new G();
		System.out.println("obj1.count "+obj1.count );
		System.out.println("obj2.count "+obj2.count );
		System.out.println("obj3.count "+obj3.count );
		System.out.println("obj4.count "+obj4.count );
	}
}