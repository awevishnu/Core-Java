class N
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		M obj=new M();
		obj.test();
		System.out.println("main end");
	}
}

/*

main begin
main end

comment test method in M class.
run N
Exception in thread "main" java.lang.NoSuchMethodError: M.test()V
        at N.main(N.java:7)
abnormal condition due to extrnal resources.		
		

*/