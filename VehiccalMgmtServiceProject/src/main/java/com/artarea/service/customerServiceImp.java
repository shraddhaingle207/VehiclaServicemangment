package com.artarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.artarea.Repo.VehicleRepository;
import com.artarea.Repo.customerRepo;
import com.artarea.entity.Customer;
import com.artarea.entity.VehicleParts;
import com.artarea.model.Response;

@Service
public class customerServiceImp implements customerService {

	@Autowired
	private customerRepo customerRepo;

	@Autowired
	private VehicleRepository VehicleRepository;

	@Override
	public void addCustomerData(Customer customer) {
		customerRepo.save(customer);
	}

	@Override
	public Response getloginData(String uname, String pass) {
		// TODO Auto-generated method stub
		Customer customer = customerRepo.findByLoginUnameAndLoginPass(uname, pass);
		Response response = new Response();

		if (customer != null) {
			response.setName(customer.getName());
			response.setEmailId(customer.getEmailId());
			if (customer.getLogin() != null) {
				response.setName(customer.getLogin().getUname());
				response.setPass(customer.getLogin().getPass());
			}
			if (customer.getRole() != null) {
				response.setRolename( customer.getRolename());
			}
		}

		return response;
	}

	@Override
	public Customer getcustomerUsingUserName(String uname) {
		// TODO Auto-generated method stub
		Customer customer = customerRepo.findByLoginUname(uname);
		return customer;
	}

	@Override
	public Customer getCustomer(String uname, String pass) {
		Customer customer = customerRepo.findByLoginUnameAndLoginPass(uname, pass);
		return customer;
	}

	@Override
	public List<Customer> getAllEmployee() {
		List<Customer> elist = customerRepo.findAll();
		return elist;
	}

	@Override
	public Customer getEmployee(String rolename) {
		Customer customer = customerRepo.findByRoleRolename(rolename);
		return customer;
	}

	@Override
	public void updateCustomer(String uname) {
		// TODO Auto-generated method stub
		Customer customer2 = customerRepo.findByLoginUname(uname);
		if (customer2 != null) {
			customerRepo.save(customer2);
		}
	}

	@Override
	public void deletecustomer(int cid) {
		customerRepo.deleteById(cid);
	}

	@Override
	public List<VehicleParts> getAllvehicleParts() {
		List<VehicleParts> list = VehicleRepository.findAll();
		return list;
	}
}
