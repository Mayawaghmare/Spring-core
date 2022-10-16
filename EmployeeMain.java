package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.beans.EmployeeBean;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("EmployeeConfig.xml");
		EmployeeBean emp1 = (EmployeeBean) context.getBean("employee1");
		EmployeeBean emp2 = (EmployeeBean) context.getBean("employee2");
		System.out.println(emp1);
		System.out.println(emp2);

		((ClassPathXmlApplicationContext) context).close();

	}

}
