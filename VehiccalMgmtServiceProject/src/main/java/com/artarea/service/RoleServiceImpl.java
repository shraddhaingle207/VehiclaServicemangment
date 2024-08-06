package com.artarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artarea.Repo.Rolerepo;
import com.artarea.entity.Role;
@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private Rolerepo Rolerepo;

	@Override
	public List<Role> getAllrole() {
		return Rolerepo.findAll();
	}

}
