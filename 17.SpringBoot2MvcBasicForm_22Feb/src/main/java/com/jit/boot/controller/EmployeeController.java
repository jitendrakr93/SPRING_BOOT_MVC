package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jit.boot.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/register")
	public String showReg() {
		return "EmpReg";
	}
	
	@PostMapping("/save")
	public String readData(@ModelAttribute("employee") Employee emp, Model model) {
		System.out.println("Data is : "+emp);
		model.addAttribute("employee", emp);
		return "EmpData";
	}
}
