package com.example.demo;

import org.springframework.stereotype.Component;
//using this annotation we need not to use any bean.xml file
@Component
public class Student {
	private int ID;
	private String Sud_Name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSud_Name() {
		return Sud_Name;
	}
	public void setSud_Name(String sud_Name) {
		Sud_Name = sud_Name;
	}
	//Conustuctor
	public Student() {
		System.out.println("Student Details:");
	
	}
	public void print() {
		System.out.println("IT Department");
	
	}

}
