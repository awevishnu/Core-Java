class M30
{
	public static void main(String[] args)
	{
		Object obj=new E();
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
		System.out.println(obj instanceof D);
		System.out.println(obj instanceof E);
	}
}	
/*
true
true
true
true
true
true
*/
//instanceof checks the specified class type or not. The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).