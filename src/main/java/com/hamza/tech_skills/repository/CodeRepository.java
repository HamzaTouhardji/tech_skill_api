package com.hamza.tech_skills.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamza.tech_skills.model.Code;

@Repository
public interface CodeRepository extends JpaRepository<Code, Long>{
	
	public Code getCodeById(Long id);
	
	boolean existsById(Long id);
}
