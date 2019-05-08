class F
{

public static void main(String[] args)
{
int i=100;
byte b1=i;
System.out.println("done");
}
}
/*
F.java:7: error: incompatible types: possible lossy conversion from int to byte
byte b1=i;
        ^
1 error
*/
//compiler won't do narrowing automatically