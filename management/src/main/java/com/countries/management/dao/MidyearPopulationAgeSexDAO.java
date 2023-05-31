package com.countries.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.countries.management.model.MidyearPopulationAgeSex;
import com.countries.management.model.MidyearPopulationAgeSexId;

@Repository
public interface MidyearPopulationAgeSexDAO extends JpaRepository<MidyearPopulationAgeSex, MidyearPopulationAgeSexId>{
	
	MidyearPopulationAgeSex findByIdIsoCodeAndIdYearAndIdSex(int isoCode, int year, String sex);
	
}
