package com.artarea.service;

import java.util.List;

import com.artarea.entity.VehicleParts;

public interface vehiclepartService {
	
	void addvehicleParts(VehicleParts vehicleParts);
	
	List<VehicleParts>getAllVehicalParts();
	
	void updateVehicleParts(VehicleParts vehicleParts ,int partno);
	
	

}
