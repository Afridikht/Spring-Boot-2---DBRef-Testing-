package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.TestingService;

/**
 * @author Zafar Iqbal
 * @since Apr 23, 2018
 */

@RestController
public class TestingController {

	@Autowired
	private TestingService service;
	
	@PostMapping("/add")
	public void addUser(){
		service.addUser();
	}
	
	@PostMapping("/get")
	public String getUser(){
		return service.getUser();
	}
}
