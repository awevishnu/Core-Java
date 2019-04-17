class J
{
	static int count;
	J()
	{
		count++;
	}
	public static void main(String args[])
	{
		J obj1=new J();
		J obj2=new J();
		J obj3=new J();
		J obj4=new J();
		System.out.println(J.count);
	}
}
/*
4
*/