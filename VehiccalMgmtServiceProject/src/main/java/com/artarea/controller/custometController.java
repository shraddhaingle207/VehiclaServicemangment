package com.artarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.artarea.entity.Customer;
import com.artarea.entity.VehicleParts;
import com.artarea.service.customerService;
import com.artarea.service.vehiclepartService;


@RestController
public class custometController {
	@Autowired
	private customerService customerservice;
	
	 @PostMapping(value="/addCust")
	public ResponseEntity<String> addCustomerdata(@RequestBody Customer customer){
		 
		 customerservice.addCustomerData(customer);
		return new ResponseEntity("data Stored",HttpStatus.CREATED);
		 
	
	}
	 
	 @GetMapping(value="/Login/{uname}/{pass}")
	 public ResponseEntity<Customer> getcustomer(@PathVariable String uname,String pass){
		 Customer customer=customerservice.getCustomer(uname, pass);
		return ResponseEntity.ok(customer);
		 
	 }
	 

	 
	 @GetMapping(value="/getAllEmployee")
	 public ResponseEntity<List<Customer>> getALlEmployee()
	 {
		 List<Customer>elist=customerservice.getAllEmployee();
		return ResponseEntity.ok(elist);
	 }
	 
	 @GetMapping(value="/getAllEmp/{rolename}")
		public ResponseEntity<Customer> getAllEmployee(@PathVariable("rolename")String rolename){
			Customer customer=customerservice.getEmployee(rolename);
			return ResponseEntity.ok(customer);
		}
		
	 @PutMapping(value="/updateCust/{uname}")
	 public ResponseEntity<String> updateCustomer(@PathVariable("uname") String uname)
	 {
		 customerservice.updateCustomer( uname);
		return ResponseEntity.ok("updated");
	 }
	 @DeleteMapping(value="/deletecustomer/{cid}")
	 public ResponseEntity<String>deleteCustomer(@PathVariable ("cid") int cid){
		 customerservice.deletecustomer(cid);
		return ResponseEntity.ok("Deleted");
	 }
	 
	 
	 @GetMapping(value="/getVehivleparts")
	 public ResponseEntity<List<VehicleParts>>getAllveicleParts(){
		 List<VehicleParts>list=customerservice.getAllvehicleParts();
		return ResponseEntity.ok(list);
	 }
}
	 
	 
