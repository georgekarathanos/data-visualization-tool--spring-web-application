package com.countries.management.model;

import javax.persistence.*;

@Entity
@Table(name = "general_metrics_for_countries")
public class GeneralMetricsForCountries {
	@EmbeddedId
    private GeneralMetricsForCountriesId id;

	@Column(name = "Country_Name", nullable = true)
	private String countryName;

	@Column(name = "Income_Index", nullable = true)
	private Double incomeIndex;

	@Column(name = "Labour_Share_GDP", nullable = true)
	private Double labourShareGDP;

	@Column(name = "Gross_fixed_capital_formation", nullable = true)
	private Double grossFixedCapitalFormation;

	@Column(name = "GDP_Total", nullable = true)
	private Double gdpTotal;

	@Column(name = "GDP_Per_Capita", nullable = true)
	private Double gdpPerCapita;

	@Column(name = "GNI_Per_Capita", nullable = true)
	private Integer gniPerCapita;

	@Column(name = "Estimated_GNI_Male", nullable = true)
	private Integer estimatedGNIMale;

	@Column(name = "Estimated_GNI_Female", nullable = true)
	private Integer estimatedGNIFemale;

	@Column(name = "Domestic_Credits", nullable = true)
	private Double domesticCredits;


	

	public GeneralMetricsForCountries(GeneralMetricsForCountriesId id, String countryName, double incomeIndex,
			double labourShareGDP, double grossFixedCapitalFormation, double gdpTotal, double gdpPerCapita,
			int gniPerCapita, int estimatedGNIMale, int estimatedGNIFemale, double domesticCredits) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.incomeIndex = incomeIndex;
		this.labourShareGDP = labourShareGDP;
		this.grossFixedCapitalFormation = grossFixedCapitalFormation;
		this.gdpTotal = gdpTotal;
		this.gdpPerCapita = gdpPerCapita;
		this.gniPerCapita = gniPerCapita;
		this.estimatedGNIMale = estimatedGNIMale;
		this.estimatedGNIFemale = estimatedGNIFemale;
		this.domesticCredits = domesticCredits;
	}

	public GeneralMetricsForCountries(String countryName, double incomeIndex, double labourShareGDP,
			double grossFixedCapitalFormation, double gdpTotal, double gdpPerCapita, int gniPerCapita,
			int estimatedGNIMale, int estimatedGNIFemale, double domesticCredits) {
		super();
		this.countryName = countryName;
		this.incomeIndex = incomeIndex;
		this.labourShareGDP = labourShareGDP;
		this.grossFixedCapitalFormation = grossFixedCapitalFormation;
		this.gdpTotal = gdpTotal;
		this.gdpPerCapita = gdpPerCapita;
		this.gniPerCapita = gniPerCapita;
		this.estimatedGNIMale = estimatedGNIMale;
		this.estimatedGNIFemale = estimatedGNIFemale;
		this.domesticCredits = domesticCredits;
	}

	public GeneralMetricsForCountries() {
		super();
	}

	public GeneralMetricsForCountriesId getId() {
		return id;
	}

	public void setId(GeneralMetricsForCountriesId id) {
		this.id = id;
	}

	public String getCountryName() {
	    return countryName != null ? countryName : "";
	}

	public void setCountryName(String countryName) {
	    this.countryName = countryName;
	}

	public double getIncomeIndex() {
	    return incomeIndex != null ? incomeIndex : -1;
	}

	public void setIncomeIndex(double incomeIndex) {
	    this.incomeIndex = incomeIndex;
	}

	public double getLabourShareGDP() {
	    return labourShareGDP != null ? labourShareGDP : -1;
	}

	public void setLabourShareGDP(double labourShareGDP) {
	    this.labourShareGDP = labourShareGDP;
	}

	public double getGrossFixedCapitalFormation() {
	    return grossFixedCapitalFormation != null ? grossFixedCapitalFormation : -1;
	}

	public void setGrossFixedCapitalFormation(double grossFixedCapitalFormation) {
	    this.grossFixedCapitalFormation = grossFixedCapitalFormation;
	}

	public double getGdpTotal() {
	    return gdpTotal != null ? gdpTotal : -1;
	}

	public void setGdpTotal(double gdpTotal) {
	    this.gdpTotal = gdpTotal;
	}

	public double getGdpPerCapita() {
	    return gdpPerCapita != null ? gdpPerCapita : -1;
	}

	public void setGdpPerCapita(double gdpPerCapita) {
	    this.gdpPerCapita = gdpPerCapita;
	}

	public int getGniPerCapita() {
	    return gniPerCapita != null ? gniPerCapita : -1;
	}

	public void setGniPerCapita(int gniPerCapita) {
	    this.gniPerCapita = gniPerCapita;
	}

	public int getEstimatedGNIMale() {
	    return estimatedGNIMale != null ? estimatedGNIMale : -1;
	}

	public void setEstimatedGNIMale(int estimatedGNIMale) {
	    this.estimatedGNIMale = estimatedGNIMale;
	}

	public int getEstimatedGNIFemale() {
	    return estimatedGNIFemale != null ? estimatedGNIFemale : -1;
	}

	public void setEstimatedGNIFemale(int estimatedGNIFemale) {
	    this.estimatedGNIFemale = estimatedGNIFemale;
	}

	public double getDomesticCredits() {
	    return domesticCredits != null ? domesticCredits : -1;
	}

	public void setDomesticCredits(double domesticCredits) {
	    this.domesticCredits = domesticCredits;
	}

}

