package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@RequestMapping("/save")
	// @RequestMapping("/emp/save")
	public String saveEmp() {
		return "EmpSave";
	}
}
