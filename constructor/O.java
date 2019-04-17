class O
{
	int i=10;
	int j=20;
	public static void main(String args[])
	{
		System.out.println(i +", "+j);
	}
}

/*
O.java:7: error: non-static variable i cannot be referenced from a static context
                System.out.println(i +", "+j);
                                   ^
O.java:7: error: non-static variable j cannot be referenced from a static context
                System.out.println(i +", "+j);
				*/