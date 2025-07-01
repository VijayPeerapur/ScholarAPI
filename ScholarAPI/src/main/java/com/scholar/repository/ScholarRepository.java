package com.scholar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scholar.entity.Scholar;

@Repository
public interface ScholarRepository extends JpaRepository<Scholar, Integer>{
	
		
	

}
