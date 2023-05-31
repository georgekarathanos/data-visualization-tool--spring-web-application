package com.countries.management.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.countries.management.dao.CountryDAO;
import com.countries.management.dao.GeneralMetricsForCountriesDAO;
import com.countries.management.dao.InternationalDatasetsDAO;
import com.countries.management.dao.MidyearPopulationAgeSexDAO;
import com.countries.management.model.InternationalDatasets;
import com.countries.management.service.JSONService;

@Controller
public class TimelinesController {
	@Autowired
	JSONService jsonService;
	
	@Autowired
	GeneralMetricsForCountriesDAO metricsRepository;
	
	@Autowired
	InternationalDatasetsDAO datasetsRepository;
	
	@Autowired
	MidyearPopulationAgeSexDAO midyearRepository;
	
	@Autowired
	CountryDAO countryRepository;

	@PostMapping("/timelines/metrics")
	public String handleMetrics(@RequestParam("selectedCountries") List<String> selectedIsoCodes,
	        @RequestParam("selectedFields") List<String> selectedFields,
	        @RequestParam("firstYear") String firstYear, @RequestParam("lastYear") String lastYear, Model theModel) {
		String jsonString = jsonService.getJSONStringForTimelineMetrics(selectedIsoCodes, selectedFields, firstYear, lastYear);
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/n-timelines-general-metrics";
	}
	
	@PostMapping("/timelines/datasets")
	public String handleDatasets(@RequestParam("selectedCountries") List<String> selectedIsoCodes,
	        @RequestParam("selectedFields") List<String> selectedFields,
	        @RequestParam("firstYear") String firstYear, @RequestParam("lastYear") String lastYear, Model theModel) {
	    String jsonString = jsonService.getJSONStringForTimelineInternational(selectedIsoCodes, selectedFields, firstYear, lastYear);
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/n-timelines-international-datasets";
	}
	
	@PostMapping("/timelines/midyearFemale")
	public String handleMidyearFemale(@RequestParam("selectedCountries") List<String> selectedIsoCodes,
	        @RequestParam("selectedFields") List<String> selectedFields,
	        @RequestParam("firstYear") String firstYear, @RequestParam("lastYear") String lastYear, Model theModel) {
	    String jsonString = jsonService.getJSONStringForTimelinePopulationFemale(selectedIsoCodes, selectedFields, firstYear, lastYear, "Female");
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/n-timelines-midyear-female";
	}
	
	@PostMapping("/timelines/midyearMale")
	public String handleCountrySubmission(@RequestParam("selectedCountries") List<String> selectedIsoCodes,
	        @RequestParam("selectedFields") List<String> selectedFields,
	        @RequestParam("firstYear") String firstYear, @RequestParam("lastYear") String lastYear, Model theModel) {
		String jsonString = jsonService.getJSONStringForTimelinePopulationMale(selectedIsoCodes, selectedFields, firstYear, lastYear, "Female");
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/n-timelines-midyear-male";
	}
	
}
