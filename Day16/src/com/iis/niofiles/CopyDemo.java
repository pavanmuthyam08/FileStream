package com.iis.niofiles;

import java.io.IOException;
import java.nio.file.*;

public class CopyDemo {
	public static void main(String[] args) {
		
	
	Path path=Paths.get("/home/administrator/Documents/NioFiles/nioinput");
	Path path2=Paths.get("/home/administrator/Documents/NioFiles/niocopy");
	Path path3=Paths.get("/home/administrator/Documents/NioFiles/niooutput");
	Path p4=Paths.get("nioinput");
	try {
		if(Files.exists(path2))
		{
			System.out.println("File aready Exsist");
		}
		else
		{
			Files.copy(path,path2);
			System.out.println("data copied");
		}
		
		Files.deleteIfExists(path3);
		System.out.println("Delete Successful");
		System.out.println("The Time of last modification is "+Files.getLastModifiedTime(path2));
		System.out.println("The owener of path is "+Files.getOwner(path));
		System.out.println(Files.isDirectory(p4));
		Files.delete(path3);
		System.out.println("delet Suceesful");
		System.out.println();
		
		} catch (IOException e) {
		System.out.println("There is No File Present");
	
	}

	}
}
