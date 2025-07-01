package com.scholar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholar.entity.Scholar;
import com.scholar.repository.ScholarRepository;

@Service
public class ScholarService {
	
	@Autowired
	private ScholarRepository scholarRepository;
	
	public List<Scholar> getScholars(){
		return scholarRepository.findAll();
	}
	
	public Scholar getScholar(int id) {
		return scholarRepository.findById(id).get();
	}

	public void addScholarInfo(Scholar scholar) {
		scholarRepository.save(scholar);
		
	}
	
	public void updateScholar(int id) {
		Scholar scholar = scholarRepository.getReferenceById(id);
		scholar.setPercentage(89);
		scholarRepository.save(scholar);
	}
	
	public void deleteScholarByID(int id) {
		Scholar scholar = scholarRepository.findById(id).get();
		scholarRepository.delete(scholar);
	}
}
