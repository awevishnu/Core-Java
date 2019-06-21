package com.lara;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class M98 {
	public static void main(String[] args) throws IOException{
		File f1=new File("data.txt");
		FileReader fin=new FileReader(f1);
		Properties pr=new Properties();
		pr.load(fin);
		System.out.println(pr);
		
	}
}

/*

{address=BTM, age=33, lastName=B, firstName=Vijay}


 */