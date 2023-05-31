package com.countries.management.model;

import javax.persistence.*;

@Entity
@Table(name = "international_datasets")
public class InternationalDatasets {
	@EmbeddedId
	private InternationalDatasetsId id;

	@Column(name = "country_code", nullable = true)
	private String countryCode;

	@Column(name = "country_name", nullable = true)
	private String countryName;

	@Column(name = "fertility_rate_15_19", nullable = true)
	private Double fertilityRate1519;

	@Column(name = "fertility_rate_20_24", nullable = true)
	private Double fertilityRate2024;

	@Column(name = "fertility_rate_25_29", nullable = true)
	private Double fertilityRate2529;

	@Column(name = "fertility_rate_30_34", nullable = true)
	private Double fertilityRate3034;

	@Column(name = "fertility_rate_35_39", nullable = true)
	private Double fertilityRate3539;

	@Column(name = "fertility_rate_40_44", nullable = true)
	private Double fertilityRate4044;

	@Column(name = "fertility_rate_45_49", nullable = true)
	private Double fertilityRate4549;

	@Column(name = "total_fertility_rate", nullable = true)
	private Double totalFertilityRate;

	@Column(name = "gross_reproduction_rate", nullable = true)
	private Double grossReproductionRate;

	@Column(name = "sex_ratio_at_birth", nullable = true)
	private Double sexRatioAtBirth;

	@Column(name = "crude_birth_rate", nullable = true)
	private Double crudeBirthRate;

	@Column(name = "crude_death_rate", nullable = true)
	private Double crudeDeathRate;

	@Column(name = "net_migration", nullable = true)
	private Double netMigration;

	@Column(name = "rate_natural_increase", nullable = true)
	private Double rateNaturalIncrease;

	@Column(name = "growth_rate", nullable = true)
	private Double growthRate;

	@Column(name = "midyear_population", nullable = true)
	private Integer midyearPopulation;

	@Column(name = "total_flag", nullable = true)
	private String totalFlag;

	@Column(name = "starting_age", nullable = true)
	private Integer startingAge;

	@Column(name = "age_group_indicator", nullable = true)
	private String ageGroupIndicator;

	@Column(name = "ending_age", nullable = true)
	private Integer endingAge;

	@Column(name = "midyear_population_sex", nullable = true)
	private Integer midyearPopulationSex;

	@Column(name = "midyear_population_male", nullable = true)
	private Integer midyearPopulationMale;

	@Column(name = "midyear_population_female", nullable = true)
	private Integer midyearPopulationFemale;

	@Column(name = "infant_mortality", nullable = true)
	private Double infantMortality;

	@Column(name = "infant_mortality_male", nullable = true)
	private Double infantMortalityMale;

	@Column(name = "infant_mortality_female", nullable = true)
	private Double infantMortalityFemale;

	@Column(name = "life_expectancy", nullable = true)
	private Double lifeExpectancy;

	@Column(name = "life_expectancy_male", nullable = true)
	private Double lifeExpectancyMale;

	@Column(name = "life_expectancy_female", nullable = true)
	private Double lifeExpectancyFemale;

	@Column(name = "mortality_rate_under5", nullable = true)
	private Double mortalityRateUnder5;

	@Column(name = "mortality_rate_under5_male", nullable = true)
	private Double mortalityRateUnder5Male;

	@Column(name = "mortality_rate_under5_female", nullable = true)
	private Double mortalityRateUnder5Female;

	@Column(name = "mortality_rate_1to4", nullable = true)
	private Double mortalityRate1to4;

	@Column(name = "mortality_rate_1to4_male", nullable = true)
	private Double mortalityRate1to4Male;

	@Column(name = "mortality_rate_1to4_female", nullable = true)
	private Double mortalityRate1to4Female;


	public InternationalDatasets(InternationalDatasetsId id, String countryCode, String countryName,
			double fertilityRate1519, double fertilityRate2024, double fertilityRate2529, double fertilityRate3034,
			double fertilityRate3539, double fertilityRate4044, double fertilityRate4549, double totalFertilityRate,
			double grossReproductionRate, double sexRatioAtBirth, double crudeBirthRate, double crudeDeathRate,
			double netMigration, double rateNaturalIncrease, double growthRate, int midyearPopulation, String totalFlag,
			int startingAge, String ageGroupIndicator, int endingAge, int midyearPopulationSex,
			int midyearPopulationMale, int midyearPopulationFemale, double infantMortality, double infantMortalityMale,
			double infantMortalityFemale, double lifeExpectancy, double lifeExpectancyMale, double lifeExpectancyFemale,
			double mortalityRateUnder5, double mortalityRateUnder5Male, double mortalityRateUnder5Female,
			double mortalityRate1to4, double mortalityRate1to4Male, double mortalityRate1to4Female) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.fertilityRate1519 = fertilityRate1519;
		this.fertilityRate2024 = fertilityRate2024;
		this.fertilityRate2529 = fertilityRate2529;
		this.fertilityRate3034 = fertilityRate3034;
		this.fertilityRate3539 = fertilityRate3539;
		this.fertilityRate4044 = fertilityRate4044;
		this.fertilityRate4549 = fertilityRate4549;
		this.totalFertilityRate = totalFertilityRate;
		this.grossReproductionRate = grossReproductionRate;
		this.sexRatioAtBirth = sexRatioAtBirth;
		this.crudeBirthRate = crudeBirthRate;
		this.crudeDeathRate = crudeDeathRate;
		this.netMigration = netMigration;
		this.rateNaturalIncrease = rateNaturalIncrease;
		this.growthRate = growthRate;
		this.midyearPopulation = midyearPopulation;
		this.totalFlag = totalFlag;
		this.startingAge = startingAge;
		this.ageGroupIndicator = ageGroupIndicator;
		this.endingAge = endingAge;
		this.midyearPopulationSex = midyearPopulationSex;
		this.midyearPopulationMale = midyearPopulationMale;
		this.midyearPopulationFemale = midyearPopulationFemale;
		this.infantMortality = infantMortality;
		this.infantMortalityMale = infantMortalityMale;
		this.infantMortalityFemale = infantMortalityFemale;
		this.lifeExpectancy = lifeExpectancy;
		this.lifeExpectancyMale = lifeExpectancyMale;
		this.lifeExpectancyFemale = lifeExpectancyFemale;
		this.mortalityRateUnder5 = mortalityRateUnder5;
		this.mortalityRateUnder5Male = mortalityRateUnder5Male;
		this.mortalityRateUnder5Female = mortalityRateUnder5Female;
		this.mortalityRate1to4 = mortalityRate1to4;
		this.mortalityRate1to4Male = mortalityRate1to4Male;
		this.mortalityRate1to4Female = mortalityRate1to4Female;
	}

	public InternationalDatasets(String countryCode, String countryName, double fertilityRate1519,
			double fertilityRate2024, double fertilityRate2529, double fertilityRate3034, double fertilityRate3539,
			double fertilityRate4044, double fertilityRate4549, double totalFertilityRate, double grossReproductionRate,
			double sexRatioAtBirth, double crudeBirthRate, double crudeDeathRate, double netMigration,
			double rateNaturalIncrease, double growthRate, int midyearPopulation, String totalFlag, int startingAge,
			String ageGroupIndicator, int endingAge, int midyearPopulationSex, int midyearPopulationMale,
			int midyearPopulationFemale, double infantMortality, double infantMortalityMale,
			double infantMortalityFemale, double lifeExpectancy, double lifeExpectancyMale, double lifeExpectancyFemale,
			double mortalityRateUnder5, double mortalityRateUnder5Male, double mortalityRateUnder5Female,
			double mortalityRate1to4, double mortalityRate1to4Male, double mortalityRate1to4Female) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.fertilityRate1519 = fertilityRate1519;
		this.fertilityRate2024 = fertilityRate2024;
		this.fertilityRate2529 = fertilityRate2529;
		this.fertilityRate3034 = fertilityRate3034;
		this.fertilityRate3539 = fertilityRate3539;
		this.fertilityRate4044 = fertilityRate4044;
		this.fertilityRate4549 = fertilityRate4549;
		this.totalFertilityRate = totalFertilityRate;
		this.grossReproductionRate = grossReproductionRate;
		this.sexRatioAtBirth = sexRatioAtBirth;
		this.crudeBirthRate = crudeBirthRate;
		this.crudeDeathRate = crudeDeathRate;
		this.netMigration = netMigration;
		this.rateNaturalIncrease = rateNaturalIncrease;
		this.growthRate = growthRate;
		this.midyearPopulation = midyearPopulation;
		this.totalFlag = totalFlag;
		this.startingAge = startingAge;
		this.ageGroupIndicator = ageGroupIndicator;
		this.endingAge = endingAge;
		this.midyearPopulationSex = midyearPopulationSex;
		this.midyearPopulationMale = midyearPopulationMale;
		this.midyearPopulationFemale = midyearPopulationFemale;
		this.infantMortality = infantMortality;
		this.infantMortalityMale = infantMortalityMale;
		this.infantMortalityFemale = infantMortalityFemale;
		this.lifeExpectancy = lifeExpectancy;
		this.lifeExpectancyMale = lifeExpectancyMale;
		this.lifeExpectancyFemale = lifeExpectancyFemale;
		this.mortalityRateUnder5 = mortalityRateUnder5;
		this.mortalityRateUnder5Male = mortalityRateUnder5Male;
		this.mortalityRateUnder5Female = mortalityRateUnder5Female;
		this.mortalityRate1to4 = mortalityRate1to4;
		this.mortalityRate1to4Male = mortalityRate1to4Male;
		this.mortalityRate1to4Female = mortalityRate1to4Female;
	}

	public InternationalDatasets() {}

	public InternationalDatasetsId getId() {
		return id;
	}

	public void setId(InternationalDatasetsId id) {
		this.id = id;
	}

	public String getCountryCode() {
	    return countryCode != null ? countryCode : "";
	}

	public void setCountryCode(String countryCode) {
	    this.countryCode = countryCode;
	}

	public String getCountryName() {
	    return countryName != null ? countryName : "";
	}

	public void setCountryName(String countryName) {
	    this.countryName = countryName;
	}

	public Double getFertilityRate1519() {
	    return fertilityRate1519 != null ? fertilityRate1519 : -1;
	}

	public void setFertilityRate1519(double fertilityRate1519) {
	    this.fertilityRate1519 = fertilityRate1519;
	}

	public double getFertilityRate2024() {
	    return fertilityRate2024 != null ? fertilityRate2024 : -1;
	}

	public void setFertilityRate2024(double fertilityRate2024) {
	    this.fertilityRate2024 = fertilityRate2024;
	}

	public double getFertilityRate2529() {
	    return fertilityRate2529 != null ? fertilityRate2529 : -1;
	}

	public void setFertilityRate2529(double fertilityRate2529) {
	    this.fertilityRate2529 = fertilityRate2529;
	}

	public double getFertilityRate3034() {
	    return fertilityRate3034 != null ? fertilityRate3034 : -1;
	}

	public void setFertilityRate3034(double fertilityRate3034) {
	    this.fertilityRate3034 = fertilityRate3034;
	}

	public double getFertilityRate3539() {
	    return fertilityRate3539 != null ? fertilityRate3539 : -1;
	}

	public void setFertilityRate3539(double fertilityRate3539) {
	    this.fertilityRate3539 = fertilityRate3539;
	}

	public double getFertilityRate4044() {
	    return fertilityRate4044 != null ? fertilityRate4044 : -1;
	}

	public void setFertilityRate4044(double fertilityRate4044) {
	    this.fertilityRate4044 = fertilityRate4044;
	}

	public double getFertilityRate4549() {
	    return fertilityRate4549 != null ? fertilityRate4549 : -1;
	}

	public void setFertilityRate4549(double fertilityRate4549) {
	    this.fertilityRate4549 = fertilityRate4549;
	}

	public double getTotalFertilityRate() {
	    return totalFertilityRate != null ? totalFertilityRate : -1;
	}

	public void setTotalFertilityRate(double totalFertilityRate) {
	    this.totalFertilityRate = totalFertilityRate;
	}

	public double getGrossReproductionRate() {
	    return grossReproductionRate != null ? grossReproductionRate : -1;
	}

	public void setGrossReproductionRate(double grossReproductionRate) {
	    this.grossReproductionRate = grossReproductionRate;
	}

	public double getSexRatioAtBirth() {
	    return sexRatioAtBirth != null ? sexRatioAtBirth : -1;
	}

	public void setSexRatioAtBirth(double sexRatioAtBirth) {
	    this.sexRatioAtBirth = sexRatioAtBirth;
	}

	public double getCrudeBirthRate() {
	    return crudeBirthRate != null ? crudeBirthRate : -1;
	}

	public void setCrudeBirthRate(double crudeBirthRate) {
	    this.crudeBirthRate = crudeBirthRate;
	}

	public double getCrudeDeathRate() {
	    return crudeDeathRate != null ? crudeDeathRate : -1;
	}

	public void setCrudeDeathRate(double crudeDeathRate) {
	    this.crudeDeathRate = crudeDeathRate;
	}

	public double getNetMigration() {
	    return netMigration != null ? netMigration : -1;
	}

	public void setNetMigration(double netMigration) {
	    this.netMigration = netMigration;
	}

	public double getRateNaturalIncrease() {
	    return rateNaturalIncrease != null ? rateNaturalIncrease : -1;
	}

	public void setRateNaturalIncrease(double rateNaturalIncrease) {
	    this.rateNaturalIncrease = rateNaturalIncrease;
	}

	public double getGrowthRate() {
	    return growthRate != null ? growthRate : -1;
	}

	public void setGrowthRate(double growthRate) {
	    this.growthRate = growthRate;
	}
	
	public int getMidyearPopulation() {
	    return midyearPopulation != null ? midyearPopulation : -1;
	}

	public void setMidyearPopulation(int midyearPopulation) {
	    this.midyearPopulation = midyearPopulation;
	}

	public String getTotalFlag() {
	    return totalFlag != null ? totalFlag : "";
	}

	public void setTotalFlag(String totalFlag) {
	    this.totalFlag = totalFlag;
	}

	public int getStartingAge() {
	    return startingAge != null ? startingAge : -1;
	}

	public void setStartingAge(int startingAge) {
	    this.startingAge = startingAge;
	}

	public String getAgeGroupIndicator() {
	    return ageGroupIndicator != null ? ageGroupIndicator : "";
	}

	public void setAgeGroupIndicator(String ageGroupIndicator) {
	    this.ageGroupIndicator = ageGroupIndicator;
	}

	public int getEndingAge() {
	    return endingAge != null ? endingAge : -1;
	}

	public void setEndingAge(int endingAge) {
	    this.endingAge = endingAge;
	}

	public int getMidyearPopulationSex() {
	    return midyearPopulationSex != null ? midyearPopulationSex : -1;
	}

	public void setMidyearPopulationSex(int midyearPopulationSex) {
	    this.midyearPopulationSex = midyearPopulationSex;
	}

	public int getMidyearPopulationMale() {
	    return midyearPopulationMale != null ? midyearPopulationMale : -1;
	}

	public void setMidyearPopulationMale(int midyearPopulationMale) {
	    this.midyearPopulationMale = midyearPopulationMale;
	}

	public int getMidyearPopulationFemale() {
	    return midyearPopulationFemale != null ? midyearPopulationFemale : -1;
	}

	public void setMidyearPopulationFemale(int midyearPopulationFemale) {
	    this.midyearPopulationFemale = midyearPopulationFemale;
	}

	public double getInfantMortality() {
	    return infantMortality != null ? infantMortality : -1;
	}

	public void setInfantMortality(double infantMortality) {
	    this.infantMortality = infantMortality;
	}

	public double getInfantMortalityMale() {
	    return infantMortalityMale != null ? infantMortalityMale : -1;
	}

	public void setInfantMortalityMale(double infantMortalityMale) {
	    this.infantMortalityMale = infantMortalityMale;
	}

	public double getInfantMortalityFemale() {
	    return infantMortalityFemale != null ? infantMortalityFemale : -1;
	}

	public void setInfantMortalityFemale(double infantMortalityFemale) {
	    this.infantMortalityFemale = infantMortalityFemale;
	}

	public double getLifeExpectancy() {
	    return lifeExpectancy != null ? lifeExpectancy : -1;
	}

	public void setLifeExpectancy(double lifeExpectancy) {
	    this.lifeExpectancy = lifeExpectancy;
	}

	public double getLifeExpectancyMale() {
	    return lifeExpectancyMale != null ? lifeExpectancyMale : -1;
	}

	public void setLifeExpectancyMale(double lifeExpectancyMale) {
	    this.lifeExpectancyMale = lifeExpectancyMale;
	}

	public double getLifeExpectancyFemale() {
	    return lifeExpectancyFemale != null ? lifeExpectancyFemale : -1;
	}

	public void setLifeExpectancyFemale(double lifeExpectancyFemale) {
	    this.lifeExpectancyFemale = lifeExpectancyFemale;
	}

	public double getMortalityRateUnder5() {
	    return mortalityRateUnder5 != null ? mortalityRateUnder5 : -1;
	}

	public void setMortalityRateUnder5(double mortalityRateUnder5) {
	    this.mortalityRateUnder5 = mortalityRateUnder5;
	}

	public double getMortalityRateUnder5Male() {
	    return mortalityRateUnder5Male != null ? mortalityRateUnder5Male : -1;
	}

	public void setMortalityRateUnder5Male(double mortalityRateUnder5Male) {
	    this.mortalityRateUnder5Male = mortalityRateUnder5Male;
	}

	public double getMortalityRateUnder5Female() {
	    return mortalityRateUnder5Female != null ? mortalityRateUnder5Female : -1;
	}

	public void setMortalityRateUnder5Female(double mortalityRateUnder5Female) {
	    this.mortalityRateUnder5Female = mortalityRateUnder5Female;
	}

	public double getMortalityRate1to4() {
	    return mortalityRate1to4 != null ? mortalityRate1to4 : -1;
	}

	public void setMortalityRate1to4(double mortalityRate1to4) {
	    this.mortalityRate1to4 = mortalityRate1to4;
	}

	public double getMortalityRate1to4Male() {
	    return mortalityRate1to4Male != null ? mortalityRate1to4Male : -1;
	}

	public void setMortalityRate1to4Male(double mortalityRate1to4Male) {
	    this.mortalityRate1to4Male = mortalityRate1to4Male;
	}

	public double getMortalityRate1to4Female() {
	    return mortalityRate1to4Female != null ? mortalityRate1to4Female : -1;
	}

	public void setMortalityRate1to4Female(double mortalityRate1to4Female) {
	    this.mortalityRate1to4Female = mortalityRate1to4Female;
	}

	
}

