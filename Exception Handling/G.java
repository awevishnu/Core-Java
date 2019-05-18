class G
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		main(args);
		System.out.println("main end");
	}
}

/*
RE

main begin

//recursive invocation is happening here.method is not ending here. it will print main begin many times.
abnormal condition due to stack memory will become full.StackOverFlow error.
*/