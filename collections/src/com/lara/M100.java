package com.lara;

import java.io.IOException;
import java.util.Properties;

public class M100 {
	public static void main(String[] args) throws IOException{
		Properties pr=System.getProperties();
		System.out.println(pr);
		System.out.println(pr.getProperty("java.runtime.name"));
		
	}
}

/*

{java.runtime.name=Java(TM) SE Runtime Environment, sun.boot.library.path=C:\Program Files\Java\jre1.8.0_201\bin, java.vm.version=25.201-b09, java.vm.vendor=Oracle Corporation, java.vendor.url=http://java.oracle.com/, path.separator=;, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg=sun.io, user.country=US, user.script=, sun.java.launcher=SUN_STANDARD, sun.os.patch.level=, java.vm.specification.name=Java Virtual Machine Specification, user.dir=C:\Users\viprahla\eclipse-workspace\lara\app2, java.runtime.version=1.8.0_201-b09, java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment, java.endorsed.dirs=C:\Program Files\Java\jre1.8.0_201\lib\endorsed, os.arch=amd64, java.io.tmpdir=C:\Users\viprahla\AppData\Local\Temp\, line.separator=
, java.vm.specification.vendor=Oracle Corporation, user.variant=, os.name=Windows 10, sun.jnu.encoding=Cp1252, java.library.path=C:\Program Files\Java\jre1.8.0_201\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:/Program Files/Java/jre1.8.0_201/bin/server;C:/Program Files/Java/jre1.8.0_201/bin;C:/Program Files/Java/jre1.8.0_201/lib/amd64;C:\ProgramData\DockerDesktop\version-bin;C:\Program Files\Docker\Docker\Resources\bin;C:\oraclexe\app\oracle\product\11.2.0\server\bin;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\app\oracle\product\12.1.0\client\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\ProgramData\Webex\Webex\Applications;C:\Program Files\Java\jdk1.7.0_71\bin;C:\Program Files\TortoiseHg\;C:\Program Files\PuTTY\;C:\Project\Softwares\apache-maven-3.1.1\bin;C:\Program Files\nodejs\;C:\Program Files\Amazon\AWSCLI\bin\;C:\Program Files\Git\cmd;C:\Users\viprahla\AppData\Local\Microsoft\WindowsApps;C:\Users\viprahla\AppData\Roaming\npm;C:\Users\viprahla\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\viprahla\AppData\Local\Box\Box Edit\;C:\minikube;C:\Program Files (x86)\Sennheiser\SoftphoneSDK\;C:\ProgramData\DockerDesktop\version-bin;C:\Program Files\Docker\Docker\Resources\bin;C:\oraclexe\app\oracle\product\11.2.0\server\bin;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\app\oracle\product\12.1.0\client\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\ProgramData\Webex\Webex\Applications;C:\Program Files\Java\jdk1.7.0_71\bin;C:\Program Files\TortoiseHg\;C:\Program Files (x86)\Sennheiser\SoftphoneSDK\;C:\Program Files\PuTTY\;C:\Project\Softwares\apache-maven-3.1.1\bin;C:\Program Files\nodejs\;C:\Program Files\Amazon\AWSCLI\bin\;C:\Program Files\Git\cmd;C:\Users\viprahla\AppData\Local\Microsoft\WindowsApps;C:\Users\viprahla\AppData\Roaming\npm;C:\Users\viprahla\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\viprahla\AppData\Local\Box\Box Edit" /m;C:\Users\viprahla\Desktop;;., java.specification.name=Java Platform API Specification, java.class.version=52.0, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.version=10.0, user.home=C:\Users\viprahla, user.timezone=, java.awt.printerjob=sun.awt.windows.WPrinterJob, file.encoding=Cp1252, java.specification.version=1.8, java.class.path=C:\Users\viprahla\eclipse-workspace\lara\app2\bin, user.name=viprahla, java.vm.specification.version=1.8, sun.java.command=com.lara.M100, java.home=C:\Program Files\Java\jre1.8.0_201, sun.arch.data.model=64, user.language=en, java.specification.vendor=Oracle Corporation, awt.toolkit=sun.awt.windows.WToolkit, java.vm.info=mixed mode, java.version=1.8.0_201, java.ext.dirs=C:\Program Files\Java\jre1.8.0_201\lib\ext;C:\WINDOWS\Sun\Java\lib\ext, sun.boot.class.path=C:\Program Files\Java\jre1.8.0_201\lib\resources.jar;C:\Program Files\Java\jre1.8.0_201\lib\rt.jar;C:\Program Files\Java\jre1.8.0_201\lib\sunrsasign.jar;C:\Program Files\Java\jre1.8.0_201\lib\jsse.jar;C:\Program Files\Java\jre1.8.0_201\lib\jce.jar;C:\Program Files\Java\jre1.8.0_201\lib\charsets.jar;C:\Program Files\Java\jre1.8.0_201\lib\jfr.jar;C:\Program Files\Java\jre1.8.0_201\classes, java.vendor=Oracle Corporation, file.separator=\, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, sun.io.unicode.encoding=UnicodeLittle, sun.cpu.endian=little, sun.desktop=windows, sun.cpu.isalist=amd64}
Java(TM) SE Runtime Environment

system properties s loading here.


 */