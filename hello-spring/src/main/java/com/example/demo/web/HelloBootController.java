package com.example.demo.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloBootController {

	public HelloBootController() {
		System.out.println("스프링이 생성자를 호출했습니다.");
	}
	@GetMapping("/hello") // 브라우저한테 어떠한 리소스를 돌려주려고 해서 Get 사용 
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("Hello Boot Controller", HttpStatus.OK);
	}
	
	@GetMapping("/jsp")
	public String viewJsp() {
		return "hellospring";
	}
	
	@GetMapping("/jsp2")
	public String viewJsp2(Model model) {
		model.addAttribute("name", "김경환");
		model.addAttribute("age", 34);
		model.addAttribute("isDeveloper", true);
		return "hellospring2";
	}
}
