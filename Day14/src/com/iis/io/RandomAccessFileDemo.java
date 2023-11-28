package com.iis.io;
import java.io.*;

public class RandomAccessFileDemo {
   private RandomAccessFile random;
   public RandomAccessFileDemo()
   {
	   try {
		random=new RandomAccessFile("/home/administrator/Downloads/file.txt","rw");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void readData()
   {
	   try {
		random.seek(0);
	
	   String s=random.readLine();
	   System.out.println("The Data inside the File is "+s);
	   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
   public void writedata()
   {
	   try {
		random.seek(random.length()+1);
		System.out.println("Current postion of cursor is "+random.getFilePointer());
		String ne="We are Writing data by write method";
		random.writeBytes(ne);;
		System.out.println("The data Writed");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public static void main(String[] args) {
	RandomAccessFileDemo rdemo=new RandomAccessFileDemo();
	rdemo.readData();
	rdemo.writedata();
	rdemo.readData();
}

}
