package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
	private int aId;
	private String aname;
	private String favTech;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getFavTech() {
		return favTech;
	}
	public void setFavTech(String favTech) {
		this.favTech = favTech;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void mock() {
		System.out.println("this is a test !!!!" );
		laptop.compile();
	}
	

}
