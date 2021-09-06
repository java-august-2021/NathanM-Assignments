package com.nathan.dojosNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathan.dojosNinjas.models.Dojo;
import com.nathan.dojosNinjas.models.Ninja;
import com.nathan.dojosNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	
	private NinjaRepository nR;
	
	public Ninja newNinja(Ninja ninja) {
		return nR.save(ninja);
	}
	
	public Ninja getNinja(Long id) {
		return nR.findById(id).orElse(null);
	}
	
	public List<Ninja> allNinjas(Dojo dojo){
		return nR.findAll();
	}



}
