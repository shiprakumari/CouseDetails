package com.cg.session.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.session.model.HotelDetails;

public interface IBookingService {

	public ArrayList<HotelDetails> getAllHotels();

	public List<HotelDetails> findHotelName();
	//public String findHotelName();

}
