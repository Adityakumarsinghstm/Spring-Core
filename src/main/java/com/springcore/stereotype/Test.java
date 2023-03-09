package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student =context.getBean("obj",Student.class);
		/*
		 * System.out.println(student); System.out.println(student.getAddresses());
		 * System.out.println(student.getAddresses().getClass().getName());
		 */
		Student student4 = context.getBean("obj",Student.class);
		System.out.println(student4.hashCode());
		System.out.println(student.hashCode());
		Student student2 = context.getBean("student",Student.class);
		System.out.println(student2.hashCode());
		Student student3 = context.getBean("student",Student.class);
		System.out.println(student3.hashCode());

	}

}
