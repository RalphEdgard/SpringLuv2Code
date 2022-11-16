package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/showPage")
	public String showPage() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processPage")
	public String processPage() {
		return "helloworld";
	}
	
	// new controller method to read dat a
	
	// add data to the model
	
	@RequestMapping("ralphProcessPage")
	public String passTheNameAndShout(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		String message = "Yo! " + name.toUpperCase();
		model = model.addAttribute("message", message);
		return "helloworld";
	}
	
	@RequestMapping("ralphProcessPage2")
	public String passTheNameAndShout2(@RequestParam("studentName") String theName, Model model) {
		String message = "Yo!aasdfsdfa " + theName.toUpperCase();
		model = model.addAttribute("message", message);
		return "helloworld";
	}
}