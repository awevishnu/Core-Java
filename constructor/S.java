class S
{
	int i=j;
	int j=20; //
	public static void main(String args[])
	{
		S s1=new S();
		System.out.println(s1.i +", "+s1.j);
		
	}
}
/*
S.java:3: error: illegal forward reference
        int i=j;
              ^
*/