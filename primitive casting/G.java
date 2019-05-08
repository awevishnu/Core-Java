class G
{

public static void main(String[] args)
{
int i=100;
byte b1=(byte) i;
System.out.println("done: "+b1);
}
}
/*
done: 100
*/
//compiler won't do narrowing automatically.programmer has to do explicitly 