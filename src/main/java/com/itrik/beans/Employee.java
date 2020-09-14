package com.itrik.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Employee {

	private int eid;
	private String ename;
	private String eaddr;

	private List<String> equalification;
	private Set<String> ecources;
	private Map<String, String> eno_And_Factory;

	public Map<String, String> getEno_And_Factory() {
		return eno_And_Factory;
	}

	public void setEno_And_Factory(Map<String, String> eno_And_Factory) {
		this.eno_And_Factory = eno_And_Factory;
	}

	public Set<String> getEcources() {
		return ecources;
	}

	public void setEcources(Set<String> ecources) {
		this.ecources = ecources;
	}

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
		System.out.println("Employee Id                    ===> "+eid);
		System.out.println("Employee Name             ===> "+ename);
		System.out.println("Employee Address         ===> "+eaddr);
		System.out.println("Employee Qualification ===> "+equalification);
		System.out.println("Employee Cources          ===> "+ecources);
		System.out.println("Employee Factoryes       ===> "+eno_And_Factory );
	}

}
