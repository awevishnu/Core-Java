class M21
{
	public static void main(String []args)
	{
		B b1=new B();
		C c1=(C) b1;
		System.out.println("---------");
		D d1=(D) b1;
		System.out.println("---------");
	}
}
/*
RE:
Exception in thread "main" java.lang.ClassCastException: B cannot be cast to C
        at M21.main(M21.java:6)
*/