package com.artarea.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artarea.entity.servicingBooking;
@Repository
public interface ServicingBookinRepo extends JpaRepository<servicingBooking, Integer> {
	

}
