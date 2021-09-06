package com.nathan.dojosNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathan.dojosNinjas.models.Dojo;
import com.nathan.dojosNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	
	private DojoRepository dR;
	
	public Dojo newDojo(Dojo dojo) {
		return dR.save(dojo);
	}
	
	public Dojo oneDojo(Long id) {
		return dR.findById(id).orElse(null);
	}
	
	public List<Dojo> showDojos(){
		return dR.findAll();
	}
	
	

}
