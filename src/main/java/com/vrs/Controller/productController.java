package com.vrs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.vrs.binding.product;

import jakarta.validation.Valid;

@Controller
public class productController {
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("product",new product());
		
		return "index";
		}
	@PostMapping("/product")
	public String submitForm(@Valid product p,BindingResult res,Model model) {
		System.out.println(p);
		if(res.hasErrors()) {
			return "index";
		}else {
			model.addAttribute("msg","Form submitted successfully");
		}
		//model.addAttribute("msg","Form submitted successfully");
		
		return "index";
	}

}
