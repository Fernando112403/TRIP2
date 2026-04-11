package com.trips;

import org.springframework.ui.Model;
import java.util.LinkedList;
import java.util.List;

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
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("En la Montaña");
		lista.add("En la Ciudad");
		lista.add("En los pueblos");
		lista.add("En las playas");
		model.addAttribute("listadoTrips",lista);
		return "listado";
	}
	
	
}
