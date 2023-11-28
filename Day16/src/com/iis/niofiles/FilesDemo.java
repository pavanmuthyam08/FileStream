package com.iis.niofiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {
	public static void main(String[] args) {
		
	
	Path path=Paths.get("/home/administrator/Documents/create.txt");
	String str="welcome to Java Nio Package ";
	try {
		Path p1=Files.createFile(path);
		Files.write(path,str.getBytes());
		System.out.println("Data written");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
}
