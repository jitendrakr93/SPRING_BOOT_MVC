package com.jit.boot.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	public EmpController() {
		System.out.println("Object Created");
	}
	
	@PostConstruct
	public void mysetup() {
		System.out.println("FROM INIT");
	}
	
	@RequestMapping("/save")
	public String saveEmp() {
		System.out.println("FROM SERVICE METHOD");
		return "EmpSave";
	}
	
	@PreDestroy
	public void clearsetup() {
		System.out.println("FROM DESTROY");
	}
}
