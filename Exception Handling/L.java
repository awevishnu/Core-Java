class L
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		K.x=20;
		System.out.println("main end");
	}
}

/*
RE

main begin
main end

comment x value in K, compile k and run L 

main begin
Exception in thread "main" java.lang.NoSuchFieldError: x
        at L.main(L.java:6)

Remove K.class file and run program with out compiling.

main begin
Exception in thread "main" java.lang.NoClassDefFoundError: K
        at L.main(L.java:6)
Caused by: java.lang.ClassNotFoundException: K
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        ... 1 more

*/