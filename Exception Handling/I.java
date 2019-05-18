class I 
{
}
class J
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		I obj=new I();
		System.out.println("main end");
	}
}

/*
RE

main begin
main end


Remove I.class file and run program with out compiling.

main begin
Exception in thread "main" java.lang.NoClassDefFoundError: I
        at J.main(I.java:9)
Caused by: java.lang.ClassNotFoundException: I
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        ... 1 more

*/