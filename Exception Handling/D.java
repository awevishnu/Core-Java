class D
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int[] x={10,20,30};
		int i=x[9];
		System.out.println("main end");
	}
}

/*
RE

main begin
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
        at D.main(D.java:7)

*/