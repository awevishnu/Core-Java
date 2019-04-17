class I
{
	static int count;
	I()
	{
		count++;
	}
	
	public static void main(String[] args)
	{
		I obj1=new I();
		I obj2=new I();
		I obj3=new I();
		I obj4=new I();
		//System.out.println(I.count+","+I.count","+I.count+","+I.count);
		System.out.println(I.count +","+ I.count +","+I.count+","I.count);
	}
}