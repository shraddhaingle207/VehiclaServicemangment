package com.artarea.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.artarea.Repo.ServicingBookinRepo;
import com.artarea.entity.servicingBooking;

@Service
public class servicingBookingImpl implements servicingbookingService {

	@Autowired
	private ServicingBookinRepo servicngBookingrepo;

	@Autowired
	private JavaMailSender javamailsender;

	@Override
	public String addServicingBooking(servicingBooking servicingBooking,String uname) {
		System.out.println("Booking details:"+servicingBooking);
		servicingBooking.setCreatedby(uname);
		servicngBookingrepo.save(servicingBooking);
		
		LocalDateTime localDateTime=LocalDateTime.now();
//		servicingBooking.setCreateddate(localDateTime);
		

		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo("shraddhaingle@gmail.com");
		message.setSubject("Confirmation mail");
		message.setText("Dear Customer,Your vehicle Service Booking Confirmed. : " + "Id: "+servicingBooking.getId()
		+"VehicleNo: "+servicingBooking.getVno()+"Person name: "+servicingBooking.getPname()+"MobileNo: "+servicingBooking.getPmobileno()
		+"YourlicenseNo: "+servicingBooking.getLicenseno()+"Adress: "+servicingBooking.getAdress()+"Date: "+servicingBooking.getDate()
		+"Slot: "+servicingBooking.getSlot()+"EmailId: "+servicingBooking.getEmail());

		javamailsender.send(message);
		

		return "Successfully added user Information ";
	}

}
