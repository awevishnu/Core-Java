class M39
{
	public static void main(String[] args)
	{
	A b1=new B();
	b1.test1();
	System.out.println(b1.i);
	B b2=b1;
	b2.test2();
	System.out.println(b2.j);		
	}
}	
/*
M39.java:8: error: incompatible types: A cannot be converted to B
        B b2=b1;
             ^
1 error
*/