package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.beans.StudentBean;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
		StudentBean student1 = context.getBean(StudentBean.class);
		System.out.println(student1);

		((ClassPathXmlApplicationContext) context).close();

	}

}
