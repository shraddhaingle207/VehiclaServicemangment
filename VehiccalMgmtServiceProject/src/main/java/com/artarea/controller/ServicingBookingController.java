package com.artarea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.artarea.entity.servicingBooking;
import com.artarea.service.servicingbookingService;

@RestController
public class ServicingBookingController {
	
	@Autowired
	private servicingbookingService servicingbookingService;

	

	@PostMapping(value="/{uname}/saveServicingInfo")
	public ResponseEntity<String>UserRegisterData(@RequestBody  servicingBooking servicingBooking,
			@PathVariable String uname)	{
		System.out.println("Servicing booking "+servicingBooking);
		
		servicingbookingService.addServicingBooking(servicingBooking,uname);
		
		System.out.println("Register Data: "+servicingBooking);
				
		return ResponseEntity.ok("data stored");
		
	}
	

	
	
	

}
