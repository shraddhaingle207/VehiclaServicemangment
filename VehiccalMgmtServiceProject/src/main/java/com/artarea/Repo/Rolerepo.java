package com.artarea.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artarea.entity.Role;
@Repository
public interface Rolerepo  extends JpaRepository<Role, Integer>
{
}
