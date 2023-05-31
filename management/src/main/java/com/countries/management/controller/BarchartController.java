package com.countries.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.countries.management.dao.CountryAreaDAO;
import com.countries.management.dao.CountryDAO;
import com.countries.management.dao.GeneralMetricsForCountriesDAO;
import com.countries.management.dao.InternationalDatasetsDAO;
import com.countries.management.dao.MidyearPopulationAgeSexDAO;
import com.countries.management.model.InternationalDatasets;
import com.countries.management.service.JSONService;

@Controller
public class BarchartController {
	@Autowired
	JSONService jsonService;
	
	@PostMapping("/barcharts/countryArea")
	public String handleArea(@RequestParam("selectedCountries") List<String> selectedIsoCodes, Model theModel) {
		String jsonString = jsonService.getJSONStringForBarchartArea(selectedIsoCodes);
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/n-barchart-country-area";
	}
	
	@PostMapping("/barcharts/metrics")
	public String handleMetrics(@RequestParam("selectedCountries") List<String> selectedIsoCodes,
	        @RequestParam("selectedFields") List<String> selectedFields,
	        @RequestParam("firstYear") String firstYear, @RequestParam("lastYear") String lastYear, Model theModel) {
	    String jsonString = jsonService.getJSONStringForBarchartMetrics(selectedIsoCodes, selectedFields, firstYear, lastYear);
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/n-barchart-general-metrics";
	}
	
	@PostMapping("/barcharts/datasets")
	public String handleDatasets(@RequestParam("selectedCountries") List<String> selectedIsoCodes,
	        @RequestParam("selectedFields") List<String> selectedFields,
	        @RequestParam("firstYear") String firstYear, @RequestParam("lastYear") String lastYear, Model theModel) {
	    String jsonString = jsonService.getJSONStringForBarchartInternational(selectedIsoCodes, selectedFields, firstYear, lastYear);
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/n-barchart-international-datasets";
	}
	
	@PostMapping("/barcharts/midyearFemale")
	public String handleMidyearFemale(@RequestParam("selectedCountries") List<String> selectedIsoCodes,
	        @RequestParam("selectedFields") List<String> selectedFields,
	        @RequestParam("firstYear") String firstYear, @RequestParam("lastYear") String lastYear, Model theModel) {
	    String jsonString = jsonService.getJSONStringForBarchartPopulationFemale(selectedIsoCodes, selectedFields, firstYear, lastYear, "Female");
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/n-barchart-midyear-female";
	}
	
	@PostMapping("/barcharts/midyearMale")
	public String handleCountrySubmission(@RequestParam("selectedCountries") List<String> selectedIsoCodes,
	        @RequestParam("selectedFields") List<String> selectedFields,
	        @RequestParam("firstYear") String firstYear, @RequestParam("lastYear") String lastYear, Model theModel) {
	    String jsonString = jsonService.getJSONStringForBarchartPopulationFemale(selectedIsoCodes, selectedFields, firstYear, lastYear, "Female");
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/n-barchart-midyear-male";
	}

}
