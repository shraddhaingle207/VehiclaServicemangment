package com.artarea.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artarea.Repo.VehicleRepository;
import com.artarea.entity.VehicleParts;

@Service
public class vehiclepartserviceImpl implements vehiclepartService {
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public void addvehicleParts(VehicleParts vehicleParts) {
		// TODO Auto-generated method stub
		vehicleRepository.save(vehicleParts);
		
	}

	@Override
	public List<VehicleParts> getAllVehicalParts() {
		List<VehicleParts>list=vehicleRepository.findAll();
		return list;
	}

	@Override
	public void updateVehicleParts(VehicleParts vehicleParts,int partno) {
		
		VehicleParts vehiParts=vehicleRepository.findByPartno(partno);
		if(vehicleParts!=null) {
			vehicleRepository.save(vehicleParts);
		}
		
		
	}

	
	
	

}
