package com.day15.mynotesprograms;

import java.io.DataInputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) throws IOException {
		String name;
		int age;
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter name");
		name=dis.readLine();
		System.out.println("Enter Age");
		age=Integer.parseInt(dis.readLine());
		Person p=new Person(name,age);
		
		
	}

}
