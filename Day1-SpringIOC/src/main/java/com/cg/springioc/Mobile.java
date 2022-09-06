package com.cg.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	

	public static void main(String[] args) {
		// Agenda-Spring IOC
		//1.we should not touch the source code
		//2. this Application should be configurable
		//hard-coding
		//for vi class methods
		
		/*Vi a = new Vi();
		a.calling();
		a.data();
		//for Jio class methods
		jio a1 = new jio();
		a1.calling();
		a1.data();*/
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded...!");
		//Vi a =(Vi)c.getBean(Vi);
		//a.calling();
		//a.data();
		
		/*jio j =c.getBean(jio);
		j.calling();
		j.data();
		
		Sim s = c.getBean("sim",Sim.class);
		s.calling();
		s.data();*/
		
	}

}
