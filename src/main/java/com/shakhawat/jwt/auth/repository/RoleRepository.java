package com.shakhawat.jwt.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shakhawat.jwt.auth.enumeration.RoleType;
import com.shakhawat.jwt.auth.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByName(RoleType name);

}
