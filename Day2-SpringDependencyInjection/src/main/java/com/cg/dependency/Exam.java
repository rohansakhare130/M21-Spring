package com.cg.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded...!");
		Student s = c.getBean("s1",Student.class);
		Student s1 = c.getBean("s2",Student.class);
		s.display();
		s1.display();
	}
 
}
