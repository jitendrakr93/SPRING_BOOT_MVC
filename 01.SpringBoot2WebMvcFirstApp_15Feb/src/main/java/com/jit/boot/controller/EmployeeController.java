package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	//@GetMapping("/emp")
	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public String showHome() {
		return "EmpHome";
	}

}
