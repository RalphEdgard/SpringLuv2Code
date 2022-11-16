package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("showForm")
	public String getMethod(Model model) {
		Student student = new Student();
		model.addAttribute("studentName", student);
		return "student-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("studentName") Student student) {
		return "student-confirmation";
	}
	
}