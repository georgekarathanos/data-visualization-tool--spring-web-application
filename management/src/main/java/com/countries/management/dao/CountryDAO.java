package com.countries.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.countries.management.model.Country;

@Repository
public interface CountryDAO extends JpaRepository<Country, Integer>{
	public Country findByIsoCode(int isoCode);
}
