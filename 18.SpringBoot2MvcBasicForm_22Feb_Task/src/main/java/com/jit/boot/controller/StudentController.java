package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jit.boot.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/register")
	public String showRegPage() {
		return "register";
	}
	
	@PostMapping("/save")
	public String saveData(@ModelAttribute("student") Student stu, Model model) {
		System.out.println("Student Data is :: "+stu);
		model.addAttribute("studentData", stu);
		return "studentdata";
	}
}
