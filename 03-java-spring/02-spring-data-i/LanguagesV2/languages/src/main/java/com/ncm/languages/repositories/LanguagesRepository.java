package com.ncm.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ncm.languages.models.Language;

public interface LanguagesRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();
}