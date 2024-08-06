package com.artarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artarea.entity.Role;
import com.artarea.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleservice;
	
	@GetMapping(value="/getrole")
	public ResponseEntity<List<Role>> getAllRole(){
		List<Role>list=roleservice.getAllrole();
		return ResponseEntity.ok(list
				);
		
	}
	
	

}
