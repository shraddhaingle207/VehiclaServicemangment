package com.artarea.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.artarea.entity.Customer;
import com.artarea.model.Response;

@Service
public class UserService implements UserDetailsService{
@Autowired
private customerService customerService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Customer customer=customerService.getcustomerUsingUserName(username);
		return new User(customer.getLogin().getUname(), customer.getLogin().getPass(), new ArrayList<>());
	}

}
