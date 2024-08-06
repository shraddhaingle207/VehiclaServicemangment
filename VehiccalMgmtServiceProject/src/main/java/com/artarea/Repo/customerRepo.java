package com.artarea.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artarea.entity.Customer;

@Repository
public interface customerRepo extends  JpaRepository<Customer, Integer>{
	
	Customer findByLoginUnameAndLoginPass(String uname,String pass);
	
	Customer findByLoginUname(String uname);
	
	Customer findByRoleRolename(String rolename);
	
	

}
