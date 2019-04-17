class P
{
	int i=10;
	int j=20; //non static initializer
	public static void main(String args[])
	{
		P p=new P();
		System.out.println(p.i +", "+p.j);
	}
}
//10, 20