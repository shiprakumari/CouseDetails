package com.cg.springcrud.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_tb")
public class Course {
@Id
@Column(name="cid")
private int cid;
@Column(name="cname")
private String cname;
@Column(name="cfees")
private double cfees;
public int getCid() {
	return cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public double getCfees() {
	return cfees;
}
public void setCfees(double cfees) {
	this.cfees = cfees;
}
public void setCid(int cid) {
	this.cid = cid;
}
@Override
public String toString() {
	return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
}


}
