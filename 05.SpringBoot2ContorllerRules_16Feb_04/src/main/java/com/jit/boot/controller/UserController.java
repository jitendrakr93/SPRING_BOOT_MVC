package com.jit.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping(value = { "/login", "/home", "/logout" })
	public String showHome() {
		return "HomePage";
	}
}
