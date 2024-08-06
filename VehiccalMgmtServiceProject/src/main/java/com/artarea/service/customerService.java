package com.artarea.service;

import java.util.List;

import com.artarea.entity.Customer;
import com.artarea.entity.VehicleParts;
import com.artarea.model.Response;

public interface customerService {

	void addCustomerData(Customer customer);

	Response getloginData(String uname, String pass);

	Customer getcustomerUsingUserName(String uname);

	Customer getCustomer(String uname, String pass);

	List<Customer> getAllEmployee();

	Customer getEmployee(String rolename);

	void updateCustomer(String uname);

	void deletecustomer(int cid);

	List<VehicleParts> getAllvehicleParts();

}
