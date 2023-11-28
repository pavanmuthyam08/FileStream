package com.iis.io;
import java.io.*;
public class FileInputDemo {

	
	public void readData()
	{
		try {
			FileInputStream fin=new FileInputStream("//home//administrator//Downloads//fileInput.txt");
			byte data[]=new byte[fin.available()];
			fin.read(data);
			for(int x=0;x<data.length;x++)
			{
				System.out.print((char)data[x]);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	FileOutputStream fout;
	public void writeData()
	{
		try {
			String str="We are Using OutputStream";
			fout=new FileOutputStream("//home//administrator//Downloads//fileInput.txt",true);
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
		FileInputDemo fdemo=new FileInputDemo();
		System.out.println("hi ");
		fdemo.readData();
		System.out.println("After Writing the Data");
		fdemo.writeData();
	}
}
