class N
{

public static void main(String[] args)
{
int i= 130;
short s1= (short)(byte)(short) i;
System.out.println(s1);
}
}
/*
right to left short->byte->short->short
-126
*/