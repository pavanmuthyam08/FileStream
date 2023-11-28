package com.iis.depempserilizable;
import java.util.*;
import java.io.*;
public class DepartmentMain 
{
    Department dept;
    Employee emp;
    Scanner sc;
    FileInputStream fin;
    
    ObjectOutputStream objout;
    FileOutputStream fout;
    public DepartmentMain()throws IOException
    {
    	dept=new Department();
    	emp=new Employee();
    	sc=new Scanner(System.in);
    	fin=new FileInputStream("/home/administrator/Documents/deptemp.txt");
    	
    	fout=new FileOutputStream("/home/administrator/Documents/deptemp.txt");
    	objout=new ObjectOutputStream(fout);
    }
    public void writeData() throws IOException
    {
    	System.out.println("Enter the Department Id ");
    	dept.setDeptid(sc.nextInt());
    	System.out.println("Enter Department Name");
    	dept.setDeptname(sc.next());
    	System.out.println("Enter the Employee Id");
    	emp.setEmpid(sc.nextInt());
    	System.out.println("Enter Employee Name ");
    	emp.setEmpname(sc.next());
    	System.out.println("Enter Employee Salary");
    	emp.setSalary(sc.nextDouble());
        dept.setEmp(emp);
        
        objout.writeObject(dept);
    
    }
    public void readData()throws IOException
    {
    	if(fin.available()>0)
    	{
    		System.out.println("The Department Name in File is "+dept.getDeptid());
    		System.out.println("The Department name in file is "+dept.getDeptname());
    		System.out.println("The Employee id in file is "+dept.getEmp().getEmpid());
    		System.out.println("The Employee name in the file is "+dept.getEmp().getEmpname());
    		System.out.println("The Employee Salary in the File is "+dept.getEmp().getSalary());
    	}
    }
    public static void main(String[] args) {
		try 
		{
			DepartmentMain dm=new DepartmentMain();
			dm.writeData();
			dm.readData();
		}
		catch(IOException e)
		{
			System.out.println("Input Output Error");
		}
	}
}
