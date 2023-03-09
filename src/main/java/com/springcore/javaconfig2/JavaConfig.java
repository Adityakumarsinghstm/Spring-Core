package com.springcore.javaconfig2;

import org.springframework.context.annotation.Bean;

public class JavaConfig {
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	@Bean
   public Student getStudent()
   {
	   Student student = new Student(getSamosa());
	   return student;
   }
}
