package com.countries.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.countries.management.dao.CountryDAO;
import com.countries.management.model.Country;

@Controller
public class CountryController {
	
	@Autowired
	CountryDAO countryRepository;
	
	@RequestMapping("/timelineGeneralMetrics")
    public String prepareTimelinesMetrics(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "timelines-general-metrics";
    }
	
	@RequestMapping("/timelineInternational")
    public String prepareTimelinesInternational(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "timelines-international-datatsets";
    }
	
	@RequestMapping("/timelineMidyearFemale")
    public String prepareTimelinesMidyearFemale(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "timelines-midyear-female";
    }
	
	@RequestMapping("/timelineMidyearMale")
    public String prepareTimelinesMidyearMale(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "timelines-midyear-male";
    }
	
	@RequestMapping("/barchartCountryArea")
    public String prepareBarchartArea(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "barchart-country-area";
    }
	
	@RequestMapping("/barchartGeneralMetrics")
    public String prepareBarchartMetrics(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "barchart-general-metrics";
    }
	
	@RequestMapping("/barchartInternational")
    public String prepareBarchartInternational(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "barchart-international-datasets";
    }
	
	@RequestMapping("/barchartMidyearFemale")
    public String prepareBarchartMidyearFemale(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "barchart-midyear-female";
    }
	
	@RequestMapping("/barchartMidyearMale")
    public String prepareBarchartMidyearMale(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "barchart-midyear-male";
    }
	
	@RequestMapping("/scatter")
    public String prepareScatters(Model theModel){
		List<Country> countries = countryRepository.findAll();
		theModel.addAttribute("countries", countries);
        return "scatters";
    }
	
}
