class H
{

public static void main(String[] args)
{
int i= 130;
byte b1=(byte) i;
System.out.println("done: "+b1);
}
}
/*
done: -126
*/
//exceeds byte range. so its starting from - //narrowing is dangerous
//short range -128 to 128