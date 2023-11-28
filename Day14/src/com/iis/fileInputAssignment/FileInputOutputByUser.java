package com.iis.fileInputAssignment;

import java.io.*;
import java.util.Scanner;

public class FileInputOutputByUser 
{
	Scanner sc=new Scanner(System.in);
	private FileInputStream fin;
	private FileOutputStream fout;
	public FileInputOutputByUser() {
		
	}
	public void readData()
	{
		try {
			fin=new FileInputStream("/home/administrator/Downloads/filedata.txt");
			//fin.getChannel().position(0);
		   byte data[]=new byte[fin.available()];
			
			
			fin.read(data);
			if(data.length==0)
			{
				System.out.println("Sorry No data present in the file please select the write option first");
			}
			else
			{
				for(int x=0;x<data.length;x++)
				{
					System.out.print((char)data[x]);
				}
			
				
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void writeData()
	{
		try {
			System.out.println("Enter the data to the File");
			 String str=sc.next();
			fout= new FileOutputStream("/home/administrator/Downloads/filedata.txt",true);
			fout.write(str.getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	FileInputOutputByUser fuser=new FileInputOutputByUser();
	String ch="y";
	while(ch.equals("y"))
	{
		System.out.println();
		System.out.println("Enter Your choice");
		System.out.println("1. Read The data");
		System.out.println("2. Write The Data");
		System.out.println("3. Exit");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			fuser.readData();
			break;
		case 2:
			fuser.writeData();
			fuser.readData();
			break;
		case 3:
			System.exit(0);

		}
		System.out.println();
		System.out.println("If you want to stay enter (y/n)");
		ch=sc.next();
				
	}
	
}
}
