package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component // bean creation
@RestController // rest and response from web
public class HomeController 
{
	@RequestMapping("/home")
	public String home()

	{
		System.out.println("Hey Guys! Very Good Moring");
		return "home.jsp";
	}

}
