class M10
{
	
	public static void main(String []args)
	{
		B b1=new E();//upcasting
		C c1=b1;
		D d1=b1;
		E e1=d1;
		E e2=c1;
		E e3=b1;
		
		System.out.println("done");
	}
}
/*
M10.java:7: error: incompatible types: B cannot be converted to C
                C c1=b1;
                     ^
M10.java:8: error: incompatible types: B cannot be converted to D
                D d1=b1;
                     ^
M10.java:9: error: incompatible types: D cannot be converted to E
                E e1=d1;
                     ^
M10.java:10: error: incompatible types: C cannot be converted to E
                E e2=c1;
                     ^
M10.java:11: error: incompatible types: B cannot be converted to E
                E e3=b1;
                     ^
5 errors
*/
/*
only first assignment is upcasting .remaining are downcasting.compiler wont do downcasting automatically.