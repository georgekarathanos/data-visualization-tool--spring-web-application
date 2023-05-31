package com.countries.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.countries.management.model.CountryArea;

@Repository
public interface CountryAreaDAO extends JpaRepository<CountryArea, Integer>{
	public CountryArea findByIsoCode(int isoCode);
}