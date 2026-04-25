package com.trips;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trip.services.ITripServices;

@Controller
@RequestMapping("/trips")
public class TripController {

	@Autowired
	private ITripServices serviceTrip;
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id")int idTrip, Mode
			
			Trip trip=serviceTrip.buscarPorId(idTrip);
             System.err.println("Trip"+trip);
             model.addAttribute("trip",idTrip.getId());
}
