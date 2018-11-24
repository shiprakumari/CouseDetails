package com.cg.session.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.session.model.HotelDetails;

public interface IBookingDAO {
	public ArrayList<HotelDetails> getAllHotels();

	public List<HotelDetails> findHotelName();
}
