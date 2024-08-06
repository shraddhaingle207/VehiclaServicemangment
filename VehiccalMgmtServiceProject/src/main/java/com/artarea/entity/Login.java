package com.artarea.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	
	private String uname;
	
	private String pass;
	

}
