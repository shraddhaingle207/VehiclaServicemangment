package com.artarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.artarea.entity.VehicleParts;
import com.artarea.service.vehiclepartService;

@RestController
public class vehiclepartCintroller {
	
	@Autowired
	private vehiclepartService vehiclepartService;
	
	@PostMapping(value="/AddParts")
	 public ResponseEntity<String>addVehicleParts(@RequestBody VehicleParts vehicleParts){
		 vehiclepartService.addvehicleParts(vehicleParts);
		return ResponseEntity.ok("Added VehicleParts");
		
	 }
		
	
	
	@GetMapping(value="/getParts")
	public ResponseEntity<List<VehicleParts>>getAllParts(){
		List<VehicleParts>vlist=vehiclepartService.getAllVehicalParts();
		return ResponseEntity.ok(vlist);
		
	}
	@PutMapping(value="/upadtaeParts/{partno}")
	public ResponseEntity<String>updateVehicleParts(@RequestBody VehicleParts vehicleParts,@PathVariable("partno")int partno){
		vehiclepartService.updateVehicleParts(vehicleParts, partno);
		return ResponseEntity.ok("Upadte successfully");
	}
	
	

}
