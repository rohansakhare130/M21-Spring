package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class StudentService 
{
	@Autowired // to inject object dependency
	private StudentRepository repo;
	//Create or Insert Or Update
	public void create(Student s)
	{
		repo.save(s);
	}
	//retrieve
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//retrieve All the data
	public List<Student>retrieveAll()
	{
		return repo.findAll();
	}
	//delete
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
