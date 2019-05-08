//byte < short < int < long < float < double
class E
{
static float test1(short arg)
{
	System.out.println("test1: "+arg);
	return test2(arg); // return (float) test2((int) arg;
}
static long test2(int arg)
{
	System.out.println("test2: "+arg);
	return arg; //return (long) arg;
}
public static void main(String[] args)
{
byte b1=10;
double d1=test1(b1);//double d1=(double) test1((short) b1);
System.out.println("done: " +d1);
}
}
/*
test1: 10
test2: 10
done: 10.0
*/
/*

compiler is doing widening
long is widening float
*/