package com.iis.filedatatransfer;
import java.io.*;
import java.util.*;
public class FileRead {
	Scanner sc;
	File f;
	FileReader freader;
	FileWriter fwriter;
	public FileRead() throws IOException
	{
		sc=new Scanner(System.in);
		f=new File("/home/administrator/Documents/filereader.txt");
		freader=new FileReader(f);
		fwriter=new FileWriter(f);
	}
	public void writeData() throws IOException
	{
		System.out.println("Enter the String ");
		String ch=sc.next();
		fwriter.write(ch);
		System.out.println("Data written");
	}
	public void readData() throws IOException
	{
		freader.skip(0);
		char[] ch=new char[100];
		freader.read(ch);
		for(int x=0;x<ch.length;x++)
		{
			System.out.print(ch[x]);
		}
	}
	public static void main(String[] args) {
		try
		{
		FileRead fr=new FileRead();
		fr.writeData();
		fr.readData();
		}
		catch(IOException e)
		{
			System.out.println("Input Output Error");
		}
	}

}
