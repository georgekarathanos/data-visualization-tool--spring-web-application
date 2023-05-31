package com.countries.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.countries.management.service.JSONService;

@Controller
public class ScatterController {

	@Autowired
	JSONService jsonService;
	
	@PostMapping("/scatter/metrics")
	public String handleArea(@RequestParam("selectedCountries") List<String> selectedIsoCodes,
	        @RequestParam("selectedFields") List<String> selectedFields,  Model theModel) {
		String jsonString = jsonService.getJSONStringForScatter(selectedIsoCodes, selectedFields);
	    theModel.addAttribute("dataGiven", jsonString);
	    return "diagrams/scatter-test";
	    //return "diagrams/n-scatters";
	}
}
