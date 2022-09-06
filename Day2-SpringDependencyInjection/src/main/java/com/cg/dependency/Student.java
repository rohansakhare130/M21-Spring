package com.cg.dependency;
//1)Dependency in the from of Literals
public class Student {
	private int id;
	private String StudentName;

	//using Setters method
	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public void display()
	{
		System.out.println("Name of the Student is:"+StudentName +" and ID is:"+id );
	}
}
