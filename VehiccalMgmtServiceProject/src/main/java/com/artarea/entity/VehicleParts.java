package com.artarea.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class VehicleParts {
	@Id
	private int partno;
	private String partname;

	private String partcost;

	private String qunatity;


}