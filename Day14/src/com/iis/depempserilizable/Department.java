package com.iis.depempserilizable;

import java.io.Serializable;

public class Department implements Serializable
{
	private Employee emp;
	private int deptid;
	private String deptname;
	public int getDeptid() {
		return deptid;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	

}
