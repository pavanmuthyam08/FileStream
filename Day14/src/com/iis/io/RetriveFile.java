package com.iis.io;
import java.io.*;
public class RetriveFile {
   private File fdir;
   
   public static void rettrive(File fsearch)
   {
	  System.out.println("The Nmae of the Folder is "+fsearch);
	  File farray[]=fsearch.listFiles();
	  for(File fobj:farray)
	  {
		  if(fobj.isDirectory())
		  {
			  System.out.println("Directory Name "+fobj.getName());
			  rettrive(fobj);
		  }
		  else
		  {
			  System.out.println("File Name is "+fobj.getName());
		  }
	  }
   }
   public static void main(String[] args) {
	RetriveFile rf=new RetriveFile();
	rf.rettrive(new File("/home/administrator/Documents"));
}
}
