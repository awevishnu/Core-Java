class O
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		try
		{
		System.out.println("1");
        int i=10/0;		
		System.out.println("2");
		}
		catch(ArithmeticException ex)//Throwable
		{
		System.out.println("3");	
		}
		System.out.println("main end");
	}
}

/*

main begin
1
3
main end

by using try catch we can handle any type of exception.
inside try block we can develop any number of , any type of statements.we have to keep catch immedietlyu after try.argument in the catch should be Throwable type.

in catch body we can provide any number of statements.
if raised exception object is not getting handled flow will terminate



                   Throwable
                      |
					  |	
					  |
				--------------
				|            | 
				|            |
              Error       Exception				
		

*/