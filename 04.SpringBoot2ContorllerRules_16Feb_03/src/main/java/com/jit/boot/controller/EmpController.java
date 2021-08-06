package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

	@RequestMapping("/show")
	public String showA() {
		return "Home";
	}

	@RequestMapping("/show")
	public String showB() {
		return "Setup";
	}
}
