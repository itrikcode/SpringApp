package com.itrik.beans;

import java.util.List;

public class Employee {

	private int eid;
	private String ename;
	private String eaddr;

	private List<String> equalification;

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

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

	public List<String> getEqualification() {
		return equalification;
	}

	public void setEqualification(List<String> equalification) {
		this.equalification = equalification;
	}
	
	public void getEmployee() {
		System.out.println("Employee Details");
		System.out.println("---------------------------------");
		System.out.println("Employee Id ===> "+eid);
		System.out.println("Employee Name ====> "+ename);
		System.out.println("Employee Address ===> "+eaddr);
		System.out.println("Employee Qualification ===> "+equalification);
	}

}
