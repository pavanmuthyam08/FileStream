package com.iis.filedatatransfer;
import java.io.*;
public class FileReaderWriter 
{
     FileReader fin;
     FileWriter fout;
     public FileReaderWriter() throws IOException
     {
    	fin=	 new FileReader("/home/administrator/Documents/random.txt");
    	fout= new FileWriter("/home/administrator/Documents/io/demo.txt",true);
     }
     public void read() throws IOException
     {
    	 
    	int c;
    	
			while((c=fin.read())!=-1)
			{
				fout.write((char)c);
				System.out.print((char)c);
				fout.flush();
			  	
			}
			System.out.println("Writing is fineshed");
			
     }
     
     public static void main(String[] args) {
	
		try {
			FileReaderWriter	fr = new FileReaderWriter();
			fr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Io Exception");
		}
		
	}
}
