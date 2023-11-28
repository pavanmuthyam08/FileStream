package com.iis.day15serilization;
import java.io.*;
import java.util.*;
public class FileWrite {
	Scanner sc;
	 FileOutputStream fout;
	ObjectOutputStream objout;
	public FileWrite() throws IOException
	{
		sc=new Scanner(System.in);
		try {
			fout=new FileOutputStream("/home/administrator/Documents/demo.txt");
			objout=new ObjectOutputStream(fout);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeData() throws IOException
	{
		
		Product p1=null;
		for(int i=0;i<2;i++)
		{
		p1=new Product();
		System.out.println("Enter the Product Id");
		p1.setProductid(sc.nextInt());
		System.out.println("Enter The Product Name");
		p1.setProductname(sc.next());
		System.out.println("Enter The Product price");
		p1.setPrice(sc.nextDouble());
		System.out.println("Enter The Quantity of Product");
		p1.setQuantity(sc.nextInt());
		System.out.println("Enter the total sale");
		p1.setTotalsales(sc.nextDouble());
		System.out.println("Data Added Successfully");
		objout.writeObject(p1);
		}	
		
	}

}
