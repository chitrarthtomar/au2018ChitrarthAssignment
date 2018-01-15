package com.au2018.EmployeeDataForum;

public class Employee {
	private int eid;
	private String ename;
	private int eage;
	public Employee(int i, String string, int j) {
		this.eid=i;
		this.ename=string;
		this.eage = j;
	}
	public Employee() {}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
}
