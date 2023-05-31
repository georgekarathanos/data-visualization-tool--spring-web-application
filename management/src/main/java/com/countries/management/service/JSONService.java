package com.countries.management.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.countries.management.model.Country;

@Service
public interface JSONService {
	
	public String getJSONStringForBarchartArea(List<String> selectedIsoCodes);
	
	public String getJSONStringForBarchartMetrics(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear);
	
	public String getJSONStringForBarchartInternational(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear);
	
	public String getJSONStringForBarchartPopulationMale(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear, String sex);
	
	public String getJSONStringForBarchartPopulationFemale(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear, String sex);
		
	public String getJSONStringForTimelineMetrics(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear);
	
	public String getJSONStringForTimelineInternational(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear);

	public String getJSONStringForTimelinePopulationMale(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear, String sex);

	public String getJSONStringForTimelinePopulationFemale(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear, String sex);

	public String getJSONStringForScatter(List<String> selectedIsoCodes,List<String> selectedFields);
}
