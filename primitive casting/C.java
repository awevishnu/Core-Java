class C
{
static void test(long arg)
{
	System.out.println("test: "+arg);
}
public static void main(String[] args)
{
byte b1=10;
short s1= b1;
int i=s1;
test(b1);
test(s1);//test((long) s1)
test(i);
System.out.println("done");
}
}
/*

test: 10
test: 10
test: 10
done
*/