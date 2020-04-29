package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(FirstProjApplication.class, args);
	
	Alien a =context.getBean(Alien.class);
	List x = new ArrayList();
	a.setFavTech("maven");
	a.setaId(123);
	a.setAname("kebe");
	
	x.add(a.getaId());
	x.add(a.getAname());
	x.add(a.getFavTech());
	

		System.out.println(x);

	
a.mock();
	}

}
