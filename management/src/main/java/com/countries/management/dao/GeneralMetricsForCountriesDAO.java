package com.countries.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.countries.management.model.GeneralMetricsForCountries;
import com.countries.management.model.GeneralMetricsForCountriesId;

@Repository
public interface GeneralMetricsForCountriesDAO extends JpaRepository<GeneralMetricsForCountries, GeneralMetricsForCountriesId>{
	
	GeneralMetricsForCountries findByIdIsoCodeAndIdYear(int isoCode, int year);
	
}
