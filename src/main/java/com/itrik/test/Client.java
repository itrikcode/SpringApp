package com.itrik.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itrik.beans.Employee;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/itrik/resources/applicationContext.xml");
		Employee emp = (Employee)context.getBean("emp");
		emp.getEmployee();
	}
}
