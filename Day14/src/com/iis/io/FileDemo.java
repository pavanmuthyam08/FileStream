package com.iis.io;
import java.io.*;
public class FileDemo {
	private File fdir;
	private File ffile;
	public FileDemo()
	{
		fdir=new File("/home/administrator/Documents/io/input/inpit1");
		ffile=new File("/home/administrator/Downloads/jls8.pdf");
	}
	public void check()
	{
		System.out.println("This directory or not "+fdir.isDirectory());
		System.out.println("This File is or not "+ffile.isFile());
		System.out.println("The Parent floder is "+fdir.getParent());
		System.out.println("Absoulte Path of file is "+ffile.getAbsolutePath());
		System.out.println(ffile.canRead());
		System.out.println(fdir.canRead());
		System.out.println(fdir.canExecute());
		System.out.println(fdir.canRead());
		System.out.println(fdir.delete());
		System.out.println(fdir.exists());
			boolean result = fdir.mkdirs();
			
			if(result)
			{
				System.out.println("floders created");
			}
			else
			{
				System.out.println("Flodersnot created");
			}
			
			/*String filename[]=fflie.list();
			for(String name:filename)
			{
				System.out.println(name);
			}*/
		
	}
	public static void main(String[] args) {
		FileDemo fd=new FileDemo();
		fd.check();
	}

}
