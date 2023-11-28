package com.iis.day15serilization;
import java.util.*;
import java.io.*;
public class FileRead {
	Scanner sc;
	FileInputStream fin;
	ObjectInputStream oinput;
	public FileRead() throws IOException
	{
		sc=new Scanner(System.in);
		
		try {
			fin=new FileInputStream("/home/administrator/Documents/demo.txt");
			oinput=new ObjectInputStream(fin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void readData() throws IOException
	{
		Product p;
		try {
			while(fin.available()>0)
			{
			p = (Product)oinput.readObject();
		 System.out.println("The Product Id in the File is "+p.getProductid());
		System.out.println("The Product name in the File is "+p.getProductname());
		System.out.println("The Total Sale in The file is "+p.getTotalsales());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		try {
			FileWrite fw=new FileWrite();
			fw.writeData();
			FileRead fr=new FileRead();
			fr.readData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
