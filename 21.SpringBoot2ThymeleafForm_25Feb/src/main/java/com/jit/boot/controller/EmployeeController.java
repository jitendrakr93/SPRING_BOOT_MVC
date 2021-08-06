package com.jit.boot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jit.boot.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	// 1. To show form with data
	@GetMapping("/edit")
	public String showEditPage(Model model) {
		Employee e = new Employee();
		e.setEmpId(500);
		e.setEmpName("ABC");
		e.setEmpSal(2500.0);
		e.setEmpGen("Male");
		e.setEmpProj("11");
		e.setEmpAddr("5-99/A, HYD");
		e.setEmpLangs(List.of("ENG", "SPN"));

		// Dropdown comes from DB
		Map<Integer, String> myprjs = Map.of(10, "P1", 11, "P2", 12, "P3", 13, "P4", 14, "P5");

		model.addAttribute("myprjs", myprjs);
		model.addAttribute("employee", e);
		return "EmployeeEdit";
	}

	// 2. To read form data on submit
	@PostMapping("/update")
	public String doUpdate(@ModelAttribute Employee employee, Model model) {
		model.addAttribute("emp", employee);
		return "EmployeeUpdate";
	}

	@GetMapping("/delete")
	public String doDeleted() {
		System.out.println("Delete Done....");
		return "redirect:all";
	}
	
	@GetMapping("/all")
	public String showAll() {
		System.out.println("FETCHING DATA FROM DB!");
		return "EmployeeData";
	}
}
