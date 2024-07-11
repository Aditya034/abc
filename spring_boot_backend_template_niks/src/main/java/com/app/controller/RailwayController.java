package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Railway;
import com.app.service.RailwayService;



@RestController
public class RailwayController {

	@Autowired
	RailwayService service;
	
	@GetMapping("/")
	public String home()
	{
		return "this is railway home";
	}
//	
	@PostMapping("/railway")
	public Railway insert(@RequestBody Railway railway)
	{
//		System.out.println(railway);
		return service.insert(railway);
		
	}
	
	@PutMapping("/railway")
	public String update(@RequestBody Railway railway)
	{
//		System.out.println(railway);
		return service.update(railway);
		
	}
	
	@GetMapping("/railway")
	public List<Railway> GetAll()
	{
//		System.out.println(railway);
		return service.getAll();
		
	}
	
	@DeleteMapping("/railway/{id}")
	public String delete(@PathVariable Long id)
	{
//		System.out.println(railway);
		return service.delete(id);
		
	}
	
	@GetMapping("/railway/{id}")
	public Railway getById(@PathVariable Long id)
	{
//		System.out.println(railway);
		return service.getById(id);
		
	}
}
