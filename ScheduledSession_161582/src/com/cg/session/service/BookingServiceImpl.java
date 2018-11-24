package com.cg.session.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.session.dao.IBookingDAO;
import com.cg.session.model.HotelDetails;

@Service
@Transactional
public class BookingServiceImpl implements IBookingService{

	@Autowired
	IBookingDAO bookingDao;
	
	@Override
	public ArrayList<HotelDetails> getAllHotels() {
		return bookingDao.getAllHotels();
	}

	@Override
	public List<HotelDetails> findHotelName() {
		return bookingDao.findHotelName();
	}
	/*@Override
	public String findHotelName() {
		return bookingDao.findHotelName();
	}*/
}
