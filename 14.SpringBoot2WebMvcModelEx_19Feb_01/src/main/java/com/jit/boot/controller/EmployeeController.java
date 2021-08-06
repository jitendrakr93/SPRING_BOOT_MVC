package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/data")
	public String showData(Model model) {
		System.out.println(model.getClass().getName());
		
		//Adding data to model
		model.addAttribute("eid", 100);
		model.addAttribute("ename","ABC");
		model.addAttribute("esal", 3.3);
		return "EmpData";
	}
}
