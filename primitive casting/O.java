class O
{

public static void main(String[] args)
{
double d1=2.9;
int i=d1;
System.out.println(i);
}
}
/*
O.java:7: error: incompatible types: possible lossy conversion from double to int
int i=d1;
      ^
1 error
*/

//explicit narrowing is required