package com.cg.session.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.session.model.HotelDetails;

@Repository
public class BookingDAOImpl implements IBookingDAO {

	@PersistenceContext
	EntityManager manager;

	@Override
	public ArrayList<HotelDetails> getAllHotels() {
		ArrayList<HotelDetails> list = new ArrayList<>();
		String jpql = "Select hotel from HotelDetails hotel";
		TypedQuery<HotelDetails> query = manager.createQuery(jpql, HotelDetails.class);
		list = (ArrayList<HotelDetails>) query.getResultList();
		return list;
	}

	@Override
	public List<HotelDetails> findHotelName() {



		Query query=manager.createNativeQuery("Select * from HotelDetails hotel where hotel.name = ?",HotelDetails.class);
		query.setParameter(1,1);

		List<HotelDetails> hotelname = query.getResultList();
		System.out.println(hotelname);
		return hotelname;

		/*//final
		String jpql ="Select hotel.name from HotelDetails hotel where hotel.id = 1";
		TypedQuery<String> query = manager.createQuery(jpql,String.class);
		String hotelName = query.getSingleResult();System.out.println("sss" + hotelName);
		return hotelName;

		//final
		 */		 

		
	}
}
