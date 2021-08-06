package com.jit.boot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@GetMapping("/show")
	public String readData(@RequestParam("sname") String name, Model model) {
		model.addAttribute("name", name);
		return "StdHome";
	}

	@GetMapping("/show_optional")
	public String readdata(@RequestParam(value = "sname", required = false) String name, Model model) {
		model.addAttribute("name", name);
		return "StdHome";
	}

	@GetMapping("/show_optional_default")
	public String readdatas(@RequestParam(value = "sname", required = false, defaultValue = "NONE") String name,
			Model model) {
		model.addAttribute("name", name);
		return "StdHome";
	}

	@GetMapping("/get_multiple_data")
	public String getData(@RequestParam("sub") List<String> sub, Model model) {
		model.addAttribute("sub", sub);
		return "StdNew";
	}

	@GetMapping("/show_optional_exception")
	public String showData(@RequestParam(value = "sid", required = false) int id,
			@RequestParam(value = "sname", required = false, defaultValue = "NONE") String name, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		return "StdHomes";
	}

}
