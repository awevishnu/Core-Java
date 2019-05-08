class M38
{
	public static void main(String[] args)
	{
	A b1=new B();
	b1.test1();
	System.out.println(b1.i);
	b1.test2();
	System.out.println(b1.j);		
	}
}	
/*
M38.java:8: error: cannot find symbol
        b1.test2();
          ^
  symbol:   method test2()
  location: variable b1 of type A
M38.java:9: error: cannot find symbol
        System.out.println(b1.j);
                             ^
  symbol:   variable j
  location: variable b1 of type A
2 errors
*/