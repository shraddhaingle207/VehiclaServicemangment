package com.artarea.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artarea.entity.address;

@Repository
public interface Adressrepo extends JpaRepository<address, Integer> {

}
