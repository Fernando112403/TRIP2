package com.trip.services;

import java.util.List;

import com.models.Trip;

public interface ITripServices {
	
	List<Trip> buscarTodo();
	Trip buscarPorId(Integer idTrip);

}
