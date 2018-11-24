/*http://localhost:8080/ScheduledSession_161582/*/
package com.cg.session.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoteldetails")
public class HotelDetails {

	@Id
	private String name;//
	private Integer duration;//
	private String faculty;
	private String mode1;
	public HotelDetails() {
		// TODO Auto-generated constructor stub
	}
	public HotelDetails(String name, Integer duration, String faculty,
			String mode1) {
		super();
		this.name = name;
		this.duration = duration;
		this.faculty = faculty;
		this.mode1 = mode1;
	}
	public String getName() {
		return name;
	}
	public Integer getDuration() {
		return duration;
	}
	public String getFaculty() {
		return faculty;
	}
	public String getMode1() {
		return mode1;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}
	@Override
	public String toString() {
		return "HotelDetails [id=" + ", name=" + name + ", duration="
				+ duration + ", faculty=" + faculty + ", mode1=" + mode1 + "]";
	}
	
	

}
