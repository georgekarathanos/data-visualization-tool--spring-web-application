package com.countries.management.service;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.countries.management.dao.CountryAreaDAO;
import com.countries.management.dao.CountryDAO;
import com.countries.management.dao.GeneralMetricsForCountriesDAO;
import com.countries.management.dao.InternationalDatasetsDAO;
import com.countries.management.dao.MidyearPopulationAgeSexDAO;
import com.countries.management.model.Country;
import com.countries.management.model.CountryArea;
import com.countries.management.model.GeneralMetricsForCountries;
import com.countries.management.model.InternationalDatasets;
import com.countries.management.model.MidyearPopulationAgeSex;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class JSONServiceImpl implements JSONService{
	
	@Autowired
	CountryDAO countryRepository;
	
	@Autowired
	CountryAreaDAO countryAreaRepository;
	
	@Autowired
	GeneralMetricsForCountriesDAO metricsRepository;
	
	@Autowired
	InternationalDatasetsDAO datasetsRepository;
	
	@Autowired
	MidyearPopulationAgeSexDAO populationRepository;
	
	@Override
	@Transactional
	public String getJSONStringForBarchartArea(List<String> selectedIsoCodes) {
		String jsonString = "[\r\n";
		
		for(int i = 0; i<selectedIsoCodes.size(); i++) {
			int isoCode = Integer.parseInt(selectedIsoCodes.get(i));
			CountryArea currentCountryArea = countryAreaRepository.findByIsoCode(isoCode);
			if(currentCountryArea == null) {
				continue;
			}
			jsonString += "    {\r\n"
					+ "        \"categorie\": \"" + currentCountryArea.getCountryName() +"\", \r\n"
					+ "        \"values\": [\r\n";
			
			jsonString += "            {\r\n";
			jsonString += "                \"value\": ";
			jsonString += currentCountryArea.getCountryArea();		//TODO METRIC VALUE
			jsonString += ", \r\n";					 
			jsonString += "                \"rate\": \"";
			jsonString += currentCountryArea.getCountryName();
			jsonString +="\"\r\n";
			jsonString += "            }\r\n"; 
			 
			
			if((i==selectedIsoCodes.size()-1)) {
				 jsonString += "        ]\r\n"
							+ "    }\r\n"; 
			 }else {
				 jsonString += "        ]\r\n"
							+ "    }, \r\n";
			 }
		}
		
		jsonString += "]";
	    //System.out.println(jsonString);
		return jsonString;
	}
	
	@Override
	@Transactional
	public String getJSONStringForBarchartMetrics(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear) {
		String jsonString = "[\r\n";
		
		int first_Year = Integer.parseInt(firstYear);
		int last_Year = Integer.parseInt(lastYear);
		
		while(first_Year <= last_Year) {
			jsonString += "    {\r\n"
					+ "        \"categorie\": \"" + first_Year +"\", \r\n"
					+ "        \"values\": [\r\n";
			//gia kathe xora
			for(int i = 0; i<selectedIsoCodes.size(); i++) {
				 int isoCode = Integer.parseInt(selectedIsoCodes.get(i));
				 Country currentCountry = countryRepository.findByIsoCode(isoCode);
				 
				 //gia kathe metriki pou zitithike apo ton xristi
				 for(int j = 0; j<selectedFields.size(); j++) {
					 String countryMetricCombination = currentCountry.getOfficialName() + " - " + selectedFields.get(j);
					 jsonString += "            {\r\n";
					 jsonString += "                \"value\": ";
					 jsonString += this.getMetricValue(isoCode, selectedFields.get(j), first_Year);		
					 jsonString += ", \r\n";					 
					 jsonString += "                \"rate\": \"";
					 jsonString += countryMetricCombination;
					 jsonString +="\"\r\n";
					 if((i==selectedIsoCodes.size()-1) && (j==selectedFields.size()-1)) {
						 jsonString += "            }\r\n"; 
					 }else {
						 jsonString += "            }, \r\n"; 
					 }
				 }
			}
			if(first_Year == last_Year) {
				 jsonString += "        ]\r\n"
							+ "    }\r\n"; 
			 }else {
				 jsonString += "        ]\r\n"
							+ "    }, \r\n";
			 }
			first_Year++;
		}
		
		jsonString += "]";
		return jsonString;
	}
	
	@Override
	@Transactional
	public String getJSONStringForBarchartInternational(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear) {
		String jsonString = "[\r\n";
		
		int first_Year = Integer.parseInt(firstYear);
		int last_Year = Integer.parseInt(lastYear);
		
		while(first_Year <= last_Year) {
			jsonString += "    {\r\n"
					+ "        \"categorie\": \"" + first_Year +"\", \r\n"
					+ "        \"values\": [\r\n";
			//gia kathe xora
			for(int i = 0; i<selectedIsoCodes.size(); i++) {
				 int isoCode = Integer.parseInt(selectedIsoCodes.get(i));
				 Country currentCountry = countryRepository.findByIsoCode(isoCode);
				 
				 //gia kathe metriki pou zitithike apo ton xristi
				 for(int j = 0; j<selectedFields.size(); j++) {
					 String countryMetricCombination = currentCountry.getOfficialName() + " - " + selectedFields.get(j);
					 jsonString += "            {\r\n";
					 jsonString += "                \"value\": ";
					 jsonString += this.getDatasetValue(isoCode, selectedFields.get(j), first_Year);		//TODO METRIC VALUE
					 jsonString += ", \r\n";					 
					 jsonString += "                \"rate\": \"";
					 jsonString += countryMetricCombination;
					 jsonString +="\"\r\n";
					 if((i==selectedIsoCodes.size()-1) && (j==selectedFields.size()-1)) {
						 jsonString += "            }\r\n"; 
					 }else {
						 jsonString += "            }, \r\n"; 
					 }
				 }
			}
			if(first_Year == last_Year) {
				 jsonString += "        ]\r\n"
							+ "    }\r\n"; 
			 }else {
				 jsonString += "        ]\r\n"
							+ "    }, \r\n";
			 }
			first_Year++;
		}
		
		jsonString += "]";
		return jsonString;
	}
	
	@Override
	@Transactional
	public String getJSONStringForBarchartPopulationMale(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear, String sex) {
		String jsonString = "[\r\n";
		
		int first_Year = Integer.parseInt(firstYear);
		int last_Year = Integer.parseInt(lastYear);
		
		while(first_Year <= last_Year) {
			jsonString += "    {\r\n"
					+ "        \"categorie\": \"" + first_Year +"\", \r\n"
					+ "        \"values\": [\r\n";
			//gia kathe xora
			for(int i = 0; i<selectedIsoCodes.size(); i++) {
				 int isoCode = Integer.parseInt(selectedIsoCodes.get(i));
				 Country currentCountry = countryRepository.findByIsoCode(isoCode);
				 
				 //gia kathe metriki pou zitithike apo ton xristi
				 for(int j = 0; j<selectedFields.size(); j++) {
					 String countryMetricCombination = currentCountry.getOfficialName() + " - " + selectedFields.get(j);
					 jsonString += "            {\r\n";
					 jsonString += "                \"value\": ";
					 jsonString += this.getPopulationValue(isoCode, selectedFields.get(j), first_Year, "Male");		//TODO METRIC VALUE
					 jsonString += ", \r\n";					 
					 jsonString += "                \"rate\": \"";
					 jsonString += countryMetricCombination;
					 jsonString +="\"\r\n";
					 if((i==selectedIsoCodes.size()-1) && (j==selectedFields.size()-1)) {
						 jsonString += "            }\r\n"; 
					 }else {
						 jsonString += "            }, \r\n"; 
					 }
				 }
			}
			if(first_Year == last_Year) {
				 jsonString += "        ]\r\n"
							+ "    }\r\n"; 
			 }else {
				 jsonString += "        ]\r\n"
							+ "    }, \r\n";
			 }
			first_Year++;
		}
		
		jsonString += "]";
		//System.out.println("barchart - Male");
	    //System.out.println(jsonString);
		return jsonString;
	}
	
	@Override
	@Transactional
	public String getJSONStringForBarchartPopulationFemale(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear, String sex) {
		String jsonString = "[\r\n";
		
		int first_Year = Integer.parseInt(firstYear);
		int last_Year = Integer.parseInt(lastYear);
		
		while(first_Year <= last_Year) {
			jsonString += "    {\r\n"
					+ "        \"categorie\": \"" + first_Year +"\", \r\n"
					+ "        \"values\": [\r\n";
			//gia kathe xora
			for(int i = 0; i<selectedIsoCodes.size(); i++) {
				 int isoCode = Integer.parseInt(selectedIsoCodes.get(i));
				 Country currentCountry = countryRepository.findByIsoCode(isoCode);
				 
				 //gia kathe metriki pou zitithike apo ton xristi
				 for(int j = 0; j<selectedFields.size(); j++) {
					 String countryMetricCombination = currentCountry.getOfficialName() + " - " + selectedFields.get(j);
					 jsonString += "            {\r\n";
					 jsonString += "                \"value\": ";
					 jsonString += this.getPopulationValue(isoCode, selectedFields.get(j), first_Year, "Female");		//TODO METRIC VALUE
					 jsonString += ", \r\n";					 
					 jsonString += "                \"rate\": \"";
					 jsonString += countryMetricCombination;
					 jsonString +="\"\r\n";
					 if((i==selectedIsoCodes.size()-1) && (j==selectedFields.size()-1)) {
						 jsonString += "            }\r\n"; 
					 }else {
						 jsonString += "            }, \r\n"; 
					 }
				 }
			}
			if(first_Year == last_Year) {
				 jsonString += "        ]\r\n"
							+ "    }\r\n"; 
			 }else {
				 jsonString += "        ]\r\n"
							+ "    }, \r\n";
			 }
			first_Year++;
		}
		
		jsonString += "]";
		//System.out.println("barchart - Female");
	    //System.out.println(jsonString);
		return jsonString;
	}
	
	private double getMetricValue(int isoCode, String metric, int year) {
		GeneralMetricsForCountries result = metricsRepository.findByIdIsoCodeAndIdYear(isoCode, year);
		if(result == null) {
			return 0;
		}
		double metricValue = -1;
		if (metric.equals("incomeIndex")) {
			metricValue = result.getIncomeIndex();
		} 
		else if (metric.equals("labourShareGDP")) {
			metricValue = result.getLabourShareGDP();
		} 
		else if (metric.equals("grossFixedCapitalFormation")) {
			metricValue = result.getGrossFixedCapitalFormation();
		} 
		else if (metric.equals("gdpTotal")) {
			metricValue = result.getGdpTotal();
		} 
		else if (metric.equals("gdpPerCapita")) {
			metricValue = result.getGdpPerCapita();
		} 
		else if (metric.equals("gniPerCapita")) {
			metricValue = result.getGniPerCapita();
		} 
		else if (metric.equals("estimatedGNIMale")) {
		    metricValue = result.getEstimatedGNIMale();
		} 
		else if (metric.equals("estimatedGNIFemale")) {
			metricValue = result.getEstimatedGNIFemale();
		} 
		else if (metric.equals("domesticCredits")) {
			metricValue = result.getDomesticCredits();
		}
		
		if (metricValue != -1) {
	    	return metricValue;
	    } else {
	        return 0;
	    }
	}
	
	private double getDatasetValue(int isoCode, String metric, int year) {
	    InternationalDatasets result = datasetsRepository.findByIdIsoCodeAndIdYear(isoCode, year);
	    if (result == null) {
	        return 0;
	    }
	    
	    double metricValue = -1;
	    
	    if (metric.equals("fertilityRate1519")) {
	        metricValue = result.getFertilityRate1519();
	    } 
	    else if (metric.equals("fertilityRate2024")) {
	        metricValue = result.getFertilityRate2024();
	    }
	    else if (metric.equals("fertilityRate2529")) {
	        metricValue = result.getFertilityRate2529();
	    }
	    else if (metric.equals("fertilityRate3034")) {
	        metricValue = result.getFertilityRate3034();
	    }
	    else if (metric.equals("fertilityRate3539")) {
	        metricValue = result.getFertilityRate3539();
	    }
	    else if (metric.equals("fertilityRate4044")) {
	        metricValue = result.getFertilityRate4044();
	    }
	    else if (metric.equals("fertilityRate4549")) {
	        metricValue = result.getFertilityRate4549();
	    }
	    else if (metric.equals("totalFertilityRate")) {
	        metricValue = result.getTotalFertilityRate();
	    }
	    else if (metric.equals("grossReproductionRate")) {
	        metricValue = result.getGrossReproductionRate();
	    }
	    else if (metric.equals("sexRatioAtBirth")) {
	        metricValue = result.getSexRatioAtBirth();
	    }
	    else if (metric.equals("crudeBirthRate")) {
	        metricValue = result.getCrudeBirthRate();
	    }
	    else if (metric.equals("crudeDeathRate")) {
	        metricValue = result.getCrudeDeathRate();
	    }
	    else if (metric.equals("netMigration")) {
	        metricValue = result.getNetMigration();
	    }
	    else if (metric.equals("rateNaturalIncrease")) {
	        metricValue = result.getRateNaturalIncrease();
	    }
	    else if (metric.equals("growthRate")) {
	        metricValue = result.getGrowthRate();
	    }
	    else if (metric.equals("midyearPopulation")) {
	        metricValue = result.getMidyearPopulation();
	    }
	    else if (metric.equals("infantMortality")) {
	        metricValue = result.getInfantMortality();
	    }
	    else if (metric.equals("infantMortalityMale")) {
	        metricValue = result.getInfantMortalityMale();
	    }
	    else if (metric.equals("infantMortalityFemale")) {
	        metricValue = result.getInfantMortalityFemale();
	    }
	    else if (metric.equals("lifeExpectancy")) {
	        metricValue = result.getLifeExpectancy();
	    }
	    else if (metric.equals("lifeExpectancyMale")) {
	        metricValue = result.getLifeExpectancyMale();
	    }
	    else if (metric.equals("lifeExpectancyFemale")) {
	        metricValue = result.getLifeExpectancyFemale();
	    }
	    else if (metric.equals("mortalityRateUnder5")) {
	        metricValue = result.getMortalityRateUnder5();
	    }
	    else if (metric.equals("mortalityRateUnder5Male")) {
	        metricValue = result.getMortalityRateUnder5Male();
	    }
	    else if (metric.equals("mortalityRateUnder5Female")) {
	        metricValue = result.getMortalityRateUnder5Female();
	    }
	    else if (metric.equals("mortalityRate1to4")) {
	        metricValue = result.getMortalityRate1to4();
	    }
	    else if (metric.equals("mortalityRate1to4Male")) {
	        metricValue = result.getMortalityRate1to4Male();
	    }
	    else if (metric.equals("mortalityRate1to4Female")) {
	        metricValue = result.getMortalityRate1to4Female();
	    }
	    
	    if (metricValue != -1) {
	        return metricValue;
	    } else {
	        return 0;
	    }
	}
	
	private double getDatasetValue(InternationalDatasets dataset, String metric) {
	    int isoCode = dataset.getId().getIsoCode();
	    int year = dataset.getId().getYear();
	    double metricValue = -1;

	    if (metric.equals("fertilityRate1519")) {
	        metricValue = dataset.getFertilityRate1519();
	    } else if (metric.equals("fertilityRate2024")) {
	        metricValue = dataset.getFertilityRate2024();
	    } else if (metric.equals("fertilityRate2529")) {
	        metricValue = dataset.getFertilityRate2529();
	    } else if (metric.equals("fertilityRate3034")) {
	        metricValue = dataset.getFertilityRate3034();
	    } else if (metric.equals("fertilityRate3539")) {
	        metricValue = dataset.getFertilityRate3539();
	    } else if (metric.equals("fertilityRate4044")) {
	        metricValue = dataset.getFertilityRate4044();
	    } else if (metric.equals("fertilityRate4549")) {
	        metricValue = dataset.getFertilityRate4549();
	    } else if (metric.equals("totalFertilityRate")) {
	        metricValue = dataset.getTotalFertilityRate();
	    } else if (metric.equals("grossReproductionRate")) {
	        metricValue = dataset.getGrossReproductionRate();
	    } else if (metric.equals("sexRatioAtBirth")) {
	        metricValue = dataset.getSexRatioAtBirth();
	    } else if (metric.equals("crudeBirthRate")) {
	        metricValue = dataset.getCrudeBirthRate();
	    } else if (metric.equals("crudeDeathRate")) {
	        metricValue = dataset.getCrudeDeathRate();
	    } else if (metric.equals("netMigration")) {
	        metricValue = dataset.getNetMigration();
	    } else if (metric.equals("rateNaturalIncrease")) {
	        metricValue = dataset.getRateNaturalIncrease();
	    } else if (metric.equals("growthRate")) {
	        metricValue = dataset.getGrowthRate();
	    } else if (metric.equals("midyearPopulation")) {
	        metricValue = dataset.getMidyearPopulation();
	    } else if (metric.equals("infantMortality")) {
	        metricValue = dataset.getInfantMortality();
	    } else if (metric.equals("infantMortalityMale")) {
	        metricValue = dataset.getInfantMortalityMale();
	    } else if (metric.equals("infantMortalityFemale")) {
	        metricValue = dataset.getInfantMortalityFemale();
	    } else if (metric.equals("lifeExpectancy")) {
	        metricValue = dataset.getLifeExpectancy();
	    } else if (metric.equals("lifeExpectancyMale")) {
	        metricValue = dataset.getLifeExpectancyMale();
	    } else if (metric.equals("lifeExpectancyFemale")) {
	        metricValue = dataset.getLifeExpectancyFemale();
	    } else if (metric.equals("mortalityRateUnder5")) {
	        metricValue = dataset.getMortalityRateUnder5();
	    } else if (metric.equals("mortalityRateUnder5Male")) {
	        metricValue = dataset.getMortalityRateUnder5Male();
	    } else if (metric.equals("mortalityRateUnder5Female")) {
	        metricValue = dataset.getMortalityRateUnder5Female();
	    } else if (metric.equals("mortalityRate1to4")) {
	        metricValue = dataset.getMortalityRate1to4();
	    } else if (metric.equals("mortalityRate1to4Male")) {
	        metricValue = dataset.getMortalityRate1to4Male();
	    } else if (metric.equals("mortalityRate1to4Female")) {
	        metricValue = dataset.getMortalityRate1to4Female();
	    }

	    if (metricValue != -1) {
	        return metricValue;
	    } else {
	        return 0;
	    }
	}


	
	private int getPopulationValue(int isoCode, String metric, int year, String sex) {
	    MidyearPopulationAgeSex result = populationRepository.findByIdIsoCodeAndIdYearAndIdSex(isoCode, year, sex);
	    if (result == null) {
	        return 0;
	    }

	    int metricValue = -1;

	    if (metric.equals("populationAge0")) {
	        metricValue = result.getPopulationAge0();
	    }
	    else if (metric.equals("populationAge1")) {
	        metricValue = result.getPopulationAge1();
	    }
	    else if (metric.equals("populationAge2")) {
	        metricValue = result.getPopulationAge2();
	    }
	    else if (metric.equals("populationAge3")) {
	        metricValue = result.getPopulationAge3();
	    }
	    else if (metric.equals("populationAge4")) {
	        metricValue = result.getPopulationAge4();
	    }
	    else if (metric.equals("populationAge5")) {
	        metricValue = result.getPopulationAge5();
	    }
	    else if (metric.equals("populationAge6")) {
	        metricValue = result.getPopulationAge6();
	    }
	    else if (metric.equals("populationAge7")) {
	        metricValue = result.getPopulationAge7();
	    }
	    else if (metric.equals("populationAge8")) {
	        metricValue = result.getPopulationAge8();
	    }
	    else if (metric.equals("populationAge9")) {
	        metricValue = result.getPopulationAge9();
	    }
	    else if (metric.equals("populationAge10")) {
	        metricValue = result.getPopulationAge10();
	    }
	    else if (metric.equals("populationAge11")) {
	        metricValue = result.getPopulationAge11();
	    }
	    else if (metric.equals("populationAge12")) {
	        metricValue = result.getPopulationAge12();
	    }
	    else if (metric.equals("populationAge13")) {
	        metricValue = result.getPopulationAge13();
	    }
	    else if (metric.equals("populationAge14")) {
	        metricValue = result.getPopulationAge14();
	    }
	    else if (metric.equals("populationAge15")) {
	        metricValue = result.getPopulationAge15();
	    }
	    else if (metric.equals("populationAge16")) {
	        metricValue = result.getPopulationAge16();
	    }
	    else if (metric.equals("populationAge17")) {
	        metricValue = result.getPopulationAge17();
	    }
	    else if (metric.equals("populationAge18")) {
	        metricValue = result.getPopulationAge18();
	    }
	    else if (metric.equals("populationAge19")) {
	        metricValue = result.getPopulationAge19();
	    }
	    else if (metric.equals("populationAge20")) {
	        metricValue = result.getPopulationAge20();
	    }
	    else if (metric.equals("populationAge21")) {
	        metricValue = result.getPopulationAge21();
	    }
	    else if (metric.equals("populationAge22")) {
	        metricValue = result.getPopulationAge22();
	    }
	    else if (metric.equals("populationAge23")) {
	        metricValue = result.getPopulationAge23();
	    }
	    else if (metric.equals("populationAge24")) {
	        metricValue = result.getPopulationAge24();
	    }
	    else if (metric.equals("populationAge25")) {
	        metricValue = result.getPopulationAge25();
	    }
	    else if (metric.equals("populationAge26")) {
	        metricValue = result.getPopulationAge26();
	    }
	    else if (metric.equals("populationAge27")) {
	        metricValue = result.getPopulationAge27();
	    }
	    else if (metric.equals("populationAge28")) {
	        metricValue = result.getPopulationAge28();
	    }
	    else if (metric.equals("populationAge29")) {
	        metricValue = result.getPopulationAge29();
	    }
	    else if (metric.equals("populationAge30")) {
	        metricValue = result.getPopulationAge30();
	    }
	    else if (metric.equals("populationAge31")) {
	        metricValue = result.getPopulationAge31();
	    }
	    else if (metric.equals("populationAge32")) {
	        metricValue = result.getPopulationAge32();
	    }
	    else if (metric.equals("populationAge33")) {
	        metricValue = result.getPopulationAge33();
	    }
	    else if (metric.equals("populationAge34")) {
	        metricValue = result.getPopulationAge34();
	    }
	    else if (metric.equals("populationAge35")) {
	        metricValue = result.getPopulationAge35();
	    }
	    else if (metric.equals("populationAge36")) {
	        metricValue = result.getPopulationAge36();
	    }
	    else if (metric.equals("populationAge37")) {
	        metricValue = result.getPopulationAge37();
	    }
	    else if (metric.equals("populationAge38")) {
	        metricValue = result.getPopulationAge38();
	    }
	    else if (metric.equals("populationAge39")) {
	        metricValue = result.getPopulationAge39();
	    }
	    else if (metric.equals("populationAge40")) {
	        metricValue = result.getPopulationAge40();
	    }
	    else if (metric.equals("populationAge41")) {
	        metricValue = result.getPopulationAge41();
	    }
	    else if (metric.equals("populationAge42")) {
	        metricValue = result.getPopulationAge42();
	    }
	    else if (metric.equals("populationAge43")) {
	        metricValue = result.getPopulationAge43();
	    }
	    else if (metric.equals("populationAge44")) {
	        metricValue = result.getPopulationAge44();
	    }
	    else if (metric.equals("populationAge45")) {
	        metricValue = result.getPopulationAge45();
	    }
	    else if (metric.equals("populationAge46")) {
	        metricValue = result.getPopulationAge46();
	    }
	    else if (metric.equals("populationAge47")) {
	        metricValue = result.getPopulationAge47();
	    }
	    else if (metric.equals("populationAge48")) {
	        metricValue = result.getPopulationAge48();
	    }
	    else if (metric.equals("populationAge49")) {
	        metricValue = result.getPopulationAge49();
	    }
	    else if (metric.equals("populationAge50")) {
	        metricValue = result.getPopulationAge50();
	    }
	    else if (metric.equals("populationAge51")) {
	        metricValue = result.getPopulationAge51();
	    }
	    else if (metric.equals("populationAge52")) {
	        metricValue = result.getPopulationAge52();
	    }
	    else if (metric.equals("populationAge53")) {
	        metricValue = result.getPopulationAge53();
	    }
	    else if (metric.equals("populationAge54")) {
	        metricValue = result.getPopulationAge54();
	    }
	    else if (metric.equals("populationAge55")) {
	        metricValue = result.getPopulationAge55();
	    }
	    else if (metric.equals("populationAge56")) {
	        metricValue = result.getPopulationAge56();
	    }
	    else if (metric.equals("populationAge57")) {
	        metricValue = result.getPopulationAge57();
	    }
	    else if (metric.equals("populationAge58")) {
	        metricValue = result.getPopulationAge58();
	    }
	    else if (metric.equals("populationAge59")) {
	        metricValue = result.getPopulationAge59();
	    }
	    else if (metric.equals("populationAge60")) {
	        metricValue = result.getPopulationAge60();
	    }
	    else if (metric.equals("populationAge61")) {
	        metricValue = result.getPopulationAge61();
	    }
	    else if (metric.equals("populationAge62")) {
	        metricValue = result.getPopulationAge62();
	    }
	    else if (metric.equals("populationAge63")) {
	        metricValue = result.getPopulationAge63();
	    }
	    else if (metric.equals("populationAge64")) {
	        metricValue = result.getPopulationAge64();
	    }
	    else if (metric.equals("populationAge65")) {
	        metricValue = result.getPopulationAge65();
	    }
	    else if (metric.equals("populationAge66")) {
	        metricValue = result.getPopulationAge66();
	    }
	    else if (metric.equals("populationAge67")) {
	        metricValue = result.getPopulationAge67();
	    }
	    else if (metric.equals("populationAge68")) {
	        metricValue = result.getPopulationAge68();
	    }
	    else if (metric.equals("populationAge69")) {
	        metricValue = result.getPopulationAge69();
	    }
	    else if (metric.equals("populationAge70")) {
	        metricValue = result.getPopulationAge70();
	    }
	    else if (metric.equals("populationAge71")) {
	        metricValue = result.getPopulationAge71();
	    }
	    else if (metric.equals("populationAge72")) {
	        metricValue = result.getPopulationAge72();
	    }
	    else if (metric.equals("populationAge73")) {
	        metricValue = result.getPopulationAge73();
	    }
	    else if (metric.equals("populationAge74")) {
	        metricValue = result.getPopulationAge74();
	    }
	    else if (metric.equals("populationAge75")) {
	        metricValue = result.getPopulationAge75();
	    }
	    else if (metric.equals("populationAge76")) {
	        metricValue = result.getPopulationAge76();
	    }
	    else if (metric.equals("populationAge77")) {
	        metricValue = result.getPopulationAge77();
	    }
	    else if (metric.equals("populationAge78")) {
	        metricValue = result.getPopulationAge78();
	    }
	    else if (metric.equals("populationAge79")) {
	        metricValue = result.getPopulationAge79();
	    }
	    else if (metric.equals("populationAge80")) {
	        metricValue = result.getPopulationAge80();
	    }
	    else if (metric.equals("populationAge81")) {
	        metricValue = result.getPopulationAge81();
	    }
	    else if (metric.equals("populationAge82")) {
	        metricValue = result.getPopulationAge82();
	    }
	    else if (metric.equals("populationAge83")) {
	        metricValue = result.getPopulationAge83();
	    }
	    else if (metric.equals("populationAge84")) {
	        metricValue = result.getPopulationAge84();
	    }
	    else if (metric.equals("populationAge85")) {
	        metricValue = result.getPopulationAge85();
	    }
	    else if (metric.equals("populationAge86")) {
	        metricValue = result.getPopulationAge86();
	    }
	    else if (metric.equals("populationAge87")) {
	        metricValue = result.getPopulationAge87();
	    }
	    else if (metric.equals("populationAge88")) {
	        metricValue = result.getPopulationAge88();
	    }
	    else if (metric.equals("populationAge89")) {
	        metricValue = result.getPopulationAge89();
	    }
	    else if (metric.equals("populationAge90")) {
	        metricValue = result.getPopulationAge90();
	    }
	    else if (metric.equals("populationAge91")) {
	        metricValue = result.getPopulationAge91();
	    }
	    else if (metric.equals("populationAge92")) {
	        metricValue = result.getPopulationAge92();
	    }
	    else if (metric.equals("populationAge93")) {
	        metricValue = result.getPopulationAge93();
	    }
	    else if (metric.equals("populationAge94")) {
	        metricValue = result.getPopulationAge94();
	    }
	    else if (metric.equals("populationAge95")) {
	        metricValue = result.getPopulationAge95();
	    }
	    else if (metric.equals("populationAge96")) {
	        metricValue = result.getPopulationAge96();
	    }
	    else if (metric.equals("populationAge97")) {
	        metricValue = result.getPopulationAge97();
	    }
	    else if (metric.equals("populationAge98")) {
	        metricValue = result.getPopulationAge98();
	    }
	    else if (metric.equals("populationAge99")) {
	        metricValue = result.getPopulationAge99();
	    }
	    else if (metric.equals("populationAge100")) {
	        metricValue = result.getPopulationAge100();
	    }

	    if (metricValue != -1) {
	        return metricValue;
	    } else {
	        return 0;
	    }
	}
	
	@Override
	@Transactional
	public String getJSONStringForTimelineMetrics(List<String> selectedIsoCodes, List<String> selectedFields, String firstYear, String lastYear) {
	    ObjectMapper objectMapper = new ObjectMapper();

		StringBuilder jsonString = new StringBuilder("{\n");
	    
	    int first_Year = Integer.parseInt(firstYear);
	    int last_Year = Integer.parseInt(lastYear);
	    
	    for (String isoCode : selectedIsoCodes) {
	        Country currentCountry = countryRepository.findByIsoCode(Integer.parseInt(isoCode));
	        List<Map<String, Object>> metricData = new ArrayList<>();
	        
	        for (int year = first_Year; year <= last_Year; year++) {
	            //Map<String, Object> metricItem = new HashMap<>();
	            Map<String, Object> metricItem = new LinkedHashMap<>(); // Use LinkedHashMap to preserve insertion order
	        	metricItem.put("Year", year);
	            
	            for (String field : selectedFields) {
	            	double metricValue = getMetricValue(currentCountry.getIsoCode(), field, year);
	                metricItem.put(field, metricValue);
	            }
	            
	            metricData.add(metricItem);
	        }
	        
	        try {
	            String json = objectMapper.writeValueAsString(metricData);
	            jsonString.append("  \"").append(currentCountry.getDisplayName()).append("\": ")
	                      .append(json).append(",\n");
	        } catch (JsonProcessingException e) {
	            // Handle the exception
	            e.printStackTrace(); // or use logger to log the error
	        }

	    }
	    
	    if (!selectedIsoCodes.isEmpty()) {
	        jsonString.deleteCharAt(jsonString.length() - 2); // Remove the trailing comma
	    }
	    
	    jsonString.append("}");
	    //System.out.println(jsonString);
	    return jsonString.toString();
	}
	
	public String getJSONStringForTimelineInternational(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear) {
		   ObjectMapper objectMapper = new ObjectMapper();

			StringBuilder jsonString = new StringBuilder("{\n");
		    
		    int first_Year = Integer.parseInt(firstYear);
		    int last_Year = Integer.parseInt(lastYear);
		    
		    for (String isoCode : selectedIsoCodes) {
		        Country currentCountry = countryRepository.findByIsoCode(Integer.parseInt(isoCode));
		        List<Map<String, Object>> metricData = new ArrayList<>();
		        
		        for (int year = first_Year; year <= last_Year; year++) {
		            //Map<String, Object> metricItem = new HashMap<>();
		            Map<String, Object> metricItem = new LinkedHashMap<>(); // Use LinkedHashMap to preserve insertion order
		        	metricItem.put("Year", year);
		            
		            for (String field : selectedFields) {
		            	double metricValue = getDatasetValue(currentCountry.getIsoCode(), field, year);
		                metricItem.put(field, metricValue);
		            }
		            
		            metricData.add(metricItem);
		        }
		        
		        try {
		            String json = objectMapper.writeValueAsString(metricData);
		            jsonString.append("  \"").append(currentCountry.getDisplayName()).append("\": ")
		                      .append(json).append(",\n");
		        } catch (JsonProcessingException e) {
		            // Handle the exception
		            e.printStackTrace(); // or use logger to log the error
		        }

		    }
		    
		    if (!selectedIsoCodes.isEmpty()) {
		        jsonString.deleteCharAt(jsonString.length() - 2); // Remove the trailing comma
		    }
		    
		    jsonString.append("}");
		    //System.out.println(jsonString);
		    return jsonString.toString();
		
	}
	
	public String getJSONStringForTimelinePopulationMale(List<String> selectedIsoCodes,List<String> selectedFields,String firstYear,String lastYear, String sex) {
		ObjectMapper objectMapper = new ObjectMapper();

	    StringBuilder jsonString = new StringBuilder("{\n");

	    int first_Year = Integer.parseInt(firstYear);
	    int last_Year = Integer.parseInt(lastYear);

	    for (String isoCode : selectedIsoCodes) {
	        Country currentCountry = countryRepository.findByIsoCode(Integer.parseInt(isoCode));
	        List<Map<String, Object>> metricData = new ArrayList<>();

	        for (int year = first_Year; year <= last_Year; year++) {
	            Map<String, Object> metricItem = new LinkedHashMap<>();
	            metricItem.put("Year", year);

	            for (String field : selectedFields) {
	                double metricValue = getPopulationValue(currentCountry.getIsoCode(), field, year, "Male");
	                metricItem.put(field, metricValue);
	            }

	            metricData.add(metricItem);
	        }

	        try {
	            String json = objectMapper.writeValueAsString(metricData);
	            jsonString.append("  \"").append(currentCountry.getDisplayName()).append("\": ")
	                    .append(json).append(",\n");
	        } catch (JsonProcessingException e) {
	            e.printStackTrace();
	        }
	    }

	    if (!selectedIsoCodes.isEmpty()) {
	        jsonString.deleteCharAt(jsonString.length() - 2); // Remove the trailing comma
	    }

	    jsonString.append("}");
	    //System.out.println("timeline - Male");
	    //System.out.println(jsonString);
	    return jsonString.toString();
	}
	
	public String getJSONStringForTimelinePopulationFemale(List<String> selectedIsoCodes, List<String> selectedFields, String firstYear, String lastYear, String sex) {
	    ObjectMapper objectMapper = new ObjectMapper();

	    StringBuilder jsonString = new StringBuilder("{\n");

	    int first_Year = Integer.parseInt(firstYear);
	    int last_Year = Integer.parseInt(lastYear);

	    for (String isoCode : selectedIsoCodes) {
	        Country currentCountry = countryRepository.findByIsoCode(Integer.parseInt(isoCode));
	        List<Map<String, Object>> metricData = new ArrayList<>();

	        for (int year = first_Year; year <= last_Year; year++) {
	            Map<String, Object> metricItem = new LinkedHashMap<>();
	            metricItem.put("Year", year);

	            for (String field : selectedFields) {
	                double metricValue = getPopulationValue(currentCountry.getIsoCode(), field, year, "Female");
	                metricItem.put(field, metricValue);
	            }

	            metricData.add(metricItem);
	        }

	        try {
	            String json = objectMapper.writeValueAsString(metricData);
	            jsonString.append("  \"").append(currentCountry.getDisplayName()).append("\": ")
	                    .append(json).append(",\n");
	        } catch (JsonProcessingException e) {
	            e.printStackTrace();
	        }
	    }

	    if (!selectedIsoCodes.isEmpty()) {
	        jsonString.deleteCharAt(jsonString.length() - 2); // Remove the trailing comma
	    }

	    jsonString.append("}");
	    //System.out.println("timeline - Female");
	    //System.out.println(jsonString);
	    return jsonString.toString();
	}

	
	@Override
	@Transactional
	public String getJSONStringForScatter(List<String> selectedIsoCodes, List<String> selectedFields) {
	    ObjectMapper objectMapper = new ObjectMapper();

	    StringBuilder jsonString = new StringBuilder("{\n");

	    for (String isoCode : selectedIsoCodes) {
	        Country currentCountry = countryRepository.findByIsoCode(Integer.parseInt(isoCode));
	        List<Map<String, Object>> metricData = new ArrayList<>();

	        List<InternationalDatasets> datasetList = datasetsRepository.findByIdIsoCode(Integer.parseInt(isoCode));

	        for (InternationalDatasets dataset : datasetList) {
	            int year = dataset.getId().getYear();
	            Map<String, Object> metricItem = new LinkedHashMap<>(); // Use LinkedHashMap to preserve insertion order
	            metricItem.put("Year", year);

	            for (String field : selectedFields) {
	                double metricValue = getDatasetValue(dataset, field);
	                metricItem.put(field, metricValue);
	            }

	            metricData.add(metricItem);
	        }

	        try {
	            String json = objectMapper.writeValueAsString(metricData);
	            jsonString.append("  \"").append(currentCountry.getDisplayName()).append("\": ")
	                    .append(json).append(",\n");
	        } catch (JsonProcessingException e) {
	            // Handle the exception
	            e.printStackTrace(); // or use logger to log the error
	        }
	    }

	    if (!selectedIsoCodes.isEmpty()) {
	        jsonString.deleteCharAt(jsonString.length() - 2); // Remove the trailing comma
	    }

	    jsonString.append("}");
	    System.out.println(jsonString);
	    return jsonString.toString();
	}

	
	

}
