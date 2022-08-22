package com.example.Student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlacementService 
{
	@Autowired
	private PlacementRepository repi;  
	
	public List<Placement> listAll() {
		return repi.findAll();
	}
	
	public void save(Placement placement) {
		repi.save(placement);
	}
	
	public Placement get(Integer id) {
		return repi.findById(id).get();
	}
	
	public void delete(Integer id) {
		repi.deleteById(id);
	}
}
