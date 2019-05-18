import java.util.Scanner;
class Z3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Some thing:");
String s1=sc.next();
		try
		{
		System.out.println("1");
		int i=Integer.parseInt(s1);
		System.out.println("2");
		int k=i/(i-9);
		System.out.println("3");
		}
		catch(ArithmeticException ex)//Throwable
		{
		System.out.println("4");			
		}
		System.out.println("main end ");
	}
}

/*
Enter Some thing:
hi
1
Exception in thread "main" java.lang.NumberFormatException: For input string: "hi"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at Z3.main(Z3.java:12)
		
Enter Some thing:
9
1
2
4
main end

Enter Some thing:
18
1
2
3
main end	


*/