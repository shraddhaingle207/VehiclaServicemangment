package com.artarea.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artarea.entity.Login;

@Repository
public interface LoginrRpo extends JpaRepository<Login, Integer>{

}
