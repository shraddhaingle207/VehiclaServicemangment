package com.artarea.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class servicingBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String vno;

	private String vname;

	private String pname;

	private String pmobileno;

	private String licenseno;

	private String adress;

	private String pincode;

	private String date;

	private String slot;

	private String email;

//	private LocalDateTime createddate;

	private String createdby;

	private String modifyby;

	@OneToMany(cascade = CascadeType.DETACH)
	private List<extradetails> extradetails = new ArrayList<extradetails>();

	public void setCreatedby(String uname) {
		// TODO Auto-generated method stub
		
	}

	public String getVno() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLicenseno() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPname() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPmobileno() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSlot() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAdress() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

}
