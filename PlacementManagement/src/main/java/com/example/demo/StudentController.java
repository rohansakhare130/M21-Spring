package com.example.demo;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



public class StudentController {
	@Autowired
	private StudentService Service;
	//RESTFUL API method for Create operation
	@PostMapping("students")
	public void add(@RequestBody Student s)
	{
		Service.create(s);
	}
	//RESTFUL API method for delete operation
	@DeleteMapping("students")
	public void remove(@PathVariable Integer id)
	{
		Service.delete(id);
	}
	
	//RESTFUL API method for update operation
	@PutMapping("students")
	public ResponseEntity<?> update(@RequestBody Student s,@PathVariable Integer id)
	{
		try
		{
			@SuppressWarnings("unused")
			Student existObject=Service.retrieve(id);
			Service.create(s);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
		//RESTFUL API method for retrieve operation
		@GetMapping("/students/(id)")
		public ResponseEntity<Student> get(@PathVariable Integer id)
		{
			try
			{
				@SuppressWarnings("unused")
				Student s =Service.retrieve(id);
				return new ResponseEntity<Student>(s,HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
			}
			
			
		}
		//RESTFUL API method for retrieveAll operation
		@GetMapping("/students")
		public List<Student>listAll()
		{
			return Service.retrieveAll();
		}
	
}
