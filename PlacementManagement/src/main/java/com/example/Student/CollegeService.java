package com.example.Student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CollegeService 
{
	@Autowired
	private CollegeRepository repi;  
	
	public List<College> listAll() {
		return repi.findAll();
	}
	
	public void save(College college) {
		repi.save(college);
	}
	
	public College get(Integer id) {
		return repi.findById(id).get();
	}
	
	public void delete(Integer id) {
		repi.deleteById(id);
	}
}
