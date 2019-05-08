class D
{
static void test(double arg)
{
	System.out.println("test: "+arg);
}
public static void main(String[] args)
{
byte b1=10;
short s1= b1;
int i=s1;
float f1=10.5F;
test(b1);
test(s1);//test((double) s1)
test(i);
test(f1);
System.out.println("done");
}
}
/*
test: 10.0
test: 10.0
test: 10.0
test: 10.5
done
*/