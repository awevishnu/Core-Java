class M11
{
	
	public static void main(String []args)
	{
		B b1=new E();//upcasting
		C c1=(C) b1;//down casting
		D d1=(D) b1;
		E e1=(E) d1;
		E e2=(E) c1;
		E e3=(E) b1;
		
		System.out.println("done");
	}
}
