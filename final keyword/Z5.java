interface A 
{
	int i;
}	

class Z5
{
	
public static void main(String args[])
{
	System.out.println(A.i);
	
}
}
			

/*
static final should be initialized with declaration itself.in interface we can not go for SIB 

Z5.java:3: error: = expected
        int i;
             ^
1 error
*/