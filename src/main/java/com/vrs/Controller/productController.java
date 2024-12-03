package com.vrs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.vrs.binding.product;

@Controller
public class productController {
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("product",new product());
		
		return "index";
		}
	@PostMapping("/product")
	public String submitForm(product p,Model model) {
		System.out.println(p);
		model.addAttribute("msg","Form submitted successfully");
		
		return "index";
	}

}
