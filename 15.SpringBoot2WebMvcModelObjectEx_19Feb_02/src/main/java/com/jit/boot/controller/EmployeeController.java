package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jit.boot.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/data")
	public String showData(Model model) {
		Employee emp = new Employee();
		emp.setEid(5896);
		emp.setEname("ABC-ZYZ");
		emp.setEsal(50000.10);
		model.addAttribute("employee", emp);
		return "EmpData";
	}
}
