package com.example.Student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService 
{
	@Autowired
	private UserRepository repi;  
	
	public List<User> listAll() {
		return repi.findAll();
	}
	
	public void save(User user) {
		repi.save(user);
	}
	public User get(Integer id) {
		return repi.findById(id).get();
	}
	
	public void delete(Integer id) {
		repi.deleteById(id);
	}
}
