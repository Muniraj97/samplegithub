package org.demo;

import java.io.File;

public class CompanyName {
	public static void main(String[] args) {
		File f=new File("D:\\Selenium Class//kumar//muni//david");
		if(!f.exists()) {
			f.mkdirs();	
			System.out.println("ram");
			System.out.println("raj");
		}
		
	}
}

