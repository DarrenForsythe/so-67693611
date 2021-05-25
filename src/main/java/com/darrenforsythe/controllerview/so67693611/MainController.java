package com.darrenforsythe.controllerview.so67693611;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MainController {
	@GetMapping("testing")
	public String testPage(Model model) {
		String name = "John";
		model.addAttribute("number", 42);
		model.addAttribute("firstName", name);
		return "test";
	}
}
