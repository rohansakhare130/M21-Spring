package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringStarterProjectApplication.class, args);
		//String str = "Welcome to Spring Rest";
		//System.out.println(str);
		//Student s = new Student();//calling to default constructor
		
		//Using Spring IOC

		ConfigurableApplicationContext context=SpringApplication.run(SpringStarterProjectApplication.class, args);
		//Student s= context.getBean(Student.class);
		//s.print();
		
		HelloController h = context.getBean(HelloController.class);
		h.display();
	}

}
