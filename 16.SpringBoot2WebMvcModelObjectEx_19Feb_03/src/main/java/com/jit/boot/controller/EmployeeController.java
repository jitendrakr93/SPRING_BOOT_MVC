package com.jit.boot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jit.boot.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/data")
	public String showData(Model model) {
		List<Employee> emps = List.of(new Employee(10, "A", 3.3), new Employee(11, "B", 4.3),
				new Employee(12, "C", 5.6), new Employee(13, "D", 5.8));
		model.addAttribute("employees", emps);
		return "EmpData";
	}
}
