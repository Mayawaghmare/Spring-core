package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.beans.PatientBean;

public class PatientMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("PatientConfig.xml");
		PatientBean patient1 = (PatientBean) context.getBean("patient1");
		PatientBean patient2 = (PatientBean) context.getBean("patient2");
		PatientBean patient3 = (PatientBean) context.getBean("patient3");
		System.out.println(patient1);
		System.out.println(patient2);
		System.out.println(patient3);
		((ClassPathXmlApplicationContext) context).close();
	}

}
