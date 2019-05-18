class H
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int[] x=new int[999999999];
		System.out.println("main end");
	}
}

/*
RE

main begin
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at H.main(H.java:6)
*/