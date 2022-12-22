package com.demo.d_05;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate dob = LocalDate.of(2000, 01, 01);
		
		System.out.println("Today: "+today);
		System.out.println("Dob: "+dob);
		
		System.out.println(LocalDateTime.now());
	}
	
}
