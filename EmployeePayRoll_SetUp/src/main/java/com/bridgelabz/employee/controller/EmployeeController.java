package com.bridgelabz.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employee.dto.ResponseDTO;
import com.bridgelabz.employee.model.EmployeeEntity;

@RestController
public class EmployeeController 
{
	@GetMapping(value = "/retrive")
	public ResponseEntity<ResponseDTO> getEmployeePayRollData()
	{		
		return new ResponseEntity("Data retrived successfully (:",HttpStatus.OK);
	}
	
	@RequestMapping(value = "/retrive/{id}",method = RequestMethod.GET)
	public ResponseEntity<String> getEmployeePayRollData(@PathVariable int id)
	{
		return new ResponseEntity("Data retrived successfully (: for id"+ id,HttpStatus.OK);
	}
	
	@PostMapping(value = "/insert")
	public ResponseEntity<String> addEmployeePayRollData(@RequestBody ResponseDTO dto)
	{
		return new ResponseEntity("Record added successfully"+dto,HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<String> updateEmployeePayRollData(@RequestBody ResponseDTO dto,@PathVariable int id)
	{
		return new ResponseEntity("Record updated successfully (: for id"+id,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		return new ResponseEntity("Record deleted successfully (:",HttpStatus.ACCEPTED);
	}
}
