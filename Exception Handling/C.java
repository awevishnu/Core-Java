class C
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i=Integer.parseInt("abc");
		System.out.println("main end");
	}
}

/*

main begin
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at C.main(C.java:6)
		
*/