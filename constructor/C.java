class C
{
 C()
 { 
 System.out.println("C()");
 }
 
 { 
 System.out.println("IIB");//instance initialization block, For every object creation IIB has to execute
 }
 
 public static void main(String[] args)
	{
		C c1=new C();
		System.out.println("---------");
		C c2=new C();
		System.out.println("---------");
}
}

/*
IIB
C()
---------
IIB
C()
---------
*/