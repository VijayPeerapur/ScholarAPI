package com.scholar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.scholar.entity.Scholar;
import com.scholar.service.ScholarService;

@RestController
public class ScholarController {
	
	@Autowired
	private ScholarService scholarService;

	@GetMapping("/scholars")
	public List<Scholar> getAllScholars(){
		
		List<Scholar> allScholar = scholarService.getScholars();
		return allScholar;
	}
	
	@GetMapping("/scholars/{id}")
	public Scholar getScholar(@PathVariable int id) {
		Scholar scholar = scholarService.getScholar(id);
		return scholar;
	}
	
	@PostMapping("/scholars/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addScholar(@RequestBody Scholar scholar) {
		scholarService.addScholarInfo(scholar);
	}
	
	@PutMapping("/scholars/update/{id}")
	public void updateScholar(@PathVariable int id) {
		scholarService.updateScholar(id);
	}
	
	@DeleteMapping("/scholars/delete/{id}")
	public void deleteScholar(@PathVariable int id) {
		scholarService.deleteScholarByID(id);
	}
}
