class I
{

public static void main(String[] args)
{
int i= 30000;
short s1= i;
System.out.println(s1);
}
}
/*

I.java:7: error: incompatible types: possible lossy conversion from int to short
short s1= i;
          ^
1 error
*/