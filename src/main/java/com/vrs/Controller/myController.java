package com.vrs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.vrs.binding.product;

@Controller
public class myController {
     
	@GetMapping("/we")
	public String welcomePage(Model model) {
		model.addAttribute("msg","Welcome to Thymeleaf");
		return "index";
	}

}
