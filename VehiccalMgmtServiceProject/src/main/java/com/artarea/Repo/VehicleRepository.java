package com.artarea.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artarea.entity.VehicleParts;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleParts, Integer> {

	VehicleParts findByPartno(int partno);
}
