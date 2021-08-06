package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {
	
	@RequestMapping(value = "/home",method = {RequestMethod.GET,RequestMethod.POST})
	public String showA() {
		System.out.println("IT IS CALLED...");
		return "Home";
	}
}
