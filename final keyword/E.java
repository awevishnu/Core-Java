class E
{
	final int i=10;
	public static void main(String args[])
	{
		E e2=new E();
		e2=new E();
		System.out.println("done");
	}
			
}
//done
/*
we are reinitializing i only.i is not final
Not modifying d2
*/