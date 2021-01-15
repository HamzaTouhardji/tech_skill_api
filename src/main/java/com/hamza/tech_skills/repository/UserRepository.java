package com.hamza.tech_skills.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamza.tech_skills.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User getUserByEmail (String email);
	
	

}
