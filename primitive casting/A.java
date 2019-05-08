//byte <short<int<long<float<double
class A
{
public static void main(String[] args)
{
	byte b1=10;
	short s1=b1;
	int i=b1;//int i=(int) b1;
	int j=s1;//int j=(int) s1;
	double d=j;
	//float f=d;
	System.out.println("done");

}
}

/*2 types
Auto widening
Explicit narrowing

Always assignment is from right to left
*/