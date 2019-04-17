class W
{
	W()
	{
		System.out.println("W():" + i);
	}
	{
		W w1=new W();
		System.out.println("IIB:" + w1.i);
	}
	int i;
	public static void main(String args[])
	{
		
		System.out.println("done");
		
		
		
	}
}

//done 
//object is not getting created so IIB and constructor not getitng executed
