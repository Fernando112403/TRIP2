package com.trips;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

	@GetMapping("/")
	public String mostrarHome(Model model)	
	{
		System.out.println("Hola");
		model.addAttribute("mensaje","Hola mundo");
		
		return "home";
	}
}
