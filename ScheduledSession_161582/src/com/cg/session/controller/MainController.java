
/*

Author: Hitee Sachdeva
Title : Scheduled Session



*/

package com.cg.session.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.session.model.HotelDetails;
import com.cg.session.service.IBookingService;

@Controller
public class MainController {

	@Autowired
	IBookingService service;

	@RequestMapping("/home")
	public String displayPage(Model model) {
		String view = "ScheduledSession";
		ArrayList<HotelDetails> list = service.getAllHotels();
		model.addAttribute("hotellist", list);
		return view;
	}

	@RequestMapping("/booking")
	public String bookingPage(Model model) {
		String view = "";
		
		List<HotelDetails> hotelName = service.findHotelName();
		//String hotelName = service.findHotelName();
		
		model.addAttribute("hotelname", hotelName);
		view = "Success";
		return view;
	}
}
