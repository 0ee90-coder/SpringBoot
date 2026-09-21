package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringController {
	
	@GetMapping("/me")
	public String viewIntro(Model model) {
		model.addAttribute("name", "김경환");
		model.addAttribute("job", "없음");
		model.addAttribute("age", "34");
		return "helloboot";
	}
}
