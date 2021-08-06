package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {

	@RequestMapping(value = "/show",method = RequestMethod.POST)
	public String showA() {
		return "Home";
	}

	@RequestMapping(value = "/show",method = RequestMethod.GET)
	public String showB() {
		return "Setup";
	}
}
