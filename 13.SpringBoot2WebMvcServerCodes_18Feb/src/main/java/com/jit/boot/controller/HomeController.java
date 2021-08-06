package com.jit.boot.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	//@PostMapping("/show")
	@GetMapping("/show")
	public String showPage() {
		if (new Random().nextInt(100) < 100)
			throw new RuntimeException("DUMMY");
		return "Home";
	}
}