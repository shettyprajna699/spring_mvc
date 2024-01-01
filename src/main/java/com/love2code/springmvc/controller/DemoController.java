package com.love2code.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	@GetMapping("/form")
	public String getStudentData() {
		return "demo";
		
	}
	@GetMapping("/name")
	public String getStudentName(@RequestParam("firstName")String theName,Model model) {
		model.addAttribute("student",theName);
		return "demo2";
	}
//	@PostMapping("/processform")
//	public String getFormData(@ModelAttribute("student") String thestudent) {
//		//System.out.println("theStudent:"+ thestudent.get+" "+thestudent.getLastName());
//		return "demo2";
//	}
}
