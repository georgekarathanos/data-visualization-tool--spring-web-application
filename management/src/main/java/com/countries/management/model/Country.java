package com.countries.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @Column(name = "ISO_Code")
    private int isoCode;

    @Column(name = "ISO", nullable = true)
    private String iso;

    @Column(name = "ISO3", nullable = true)
    private String iso3;

    @Column(name = "FIPS", nullable = true)
    private String fips;

    @Column(name = "Display_Name", nullable = true)
    private String displayName;

    @Column(name = "Official_Name", nullable = true)
    private String officialName;

    @Column(name = "Capital", nullable = true)
    private String capital;

    @Column(name = "Continent", nullable = true)
    private String continent;

    @Column(name = "Currency_Code", nullable = true)
    private String currencyCode;

    @Column(name = "Currency_Name", nullable = true)
    private String currencyName;

    @Column(name = "Phone", nullable = true)
    private String phone;

    @Column(name = "Region_Code", nullable = true)
    private Integer regionCode;

    @Column(name = "Region_Name", nullable = true)
    private String regionName;

    @Column(name = "Sub_Region_Code", nullable = true)
    private String subRegionCode;

    @Column(name = "Sub_Region_Name", nullable = true)
    private String subRegionName;

    @Column(name = "Intermediate_Region_Code", nullable = true)
    private Integer intermediateRegionCode;

    @Column(name = "Intermediate_Region_Name", nullable = true)
    private String intermediateRegionName;

    @Column(name = "Status", nullable = true)
    private String status;

    @Column(name = "Developed_or_Developing", nullable = true)
    private String developedOrDeveloping;

    @Column(name = "SIDS", nullable = true)
    private String sids;

    @Column(name = "LLDC", nullable = true)
    private String lldc;

    @Column(name = "LDC", nullable = true)
    private String ldc;

    @Column(name = "Area_Sq_Km", nullable = true)
    private Integer areaSqKm;

    @Column(name = "Population", nullable = true)
    private Integer population;


	public Country(int isoCode, String iso, String iso3, String fips, String displayName, String officialName,
			String capital, String continent, String currencyCode, String currencyName, String phone, int regionCode,
			String regionName, String subRegionCode, String subRegionName, int intermediateRegionCode,
			String intermediateRegionName, String status, String developedOrDeveloping, String sids, String lldc,
			String ldc, int areaSqKm, int population) {
		super();
		this.isoCode = isoCode;
		this.iso = iso;
		this.iso3 = iso3;
		this.fips = fips;
		this.displayName = displayName;
		this.officialName = officialName;
		this.capital = capital;
		this.continent = continent;
		this.currencyCode = currencyCode;
		this.currencyName = currencyName;
		this.phone = phone;
		this.regionCode = regionCode;
		this.regionName = regionName;
		this.subRegionCode = subRegionCode;
		this.subRegionName = subRegionName;
		this.intermediateRegionCode = intermediateRegionCode;
		this.intermediateRegionName = intermediateRegionName;
		this.status = status;
		this.developedOrDeveloping = developedOrDeveloping;
		this.sids = sids;
		this.lldc = lldc;
		this.ldc = ldc;
		this.areaSqKm = areaSqKm;
		this.population = population;
	}

	public Country() {
		super();
	}

	public Country(String iso, String iso3, String fips, String displayName, String officialName, String capital,
			String continent, String currencyCode, String currencyName, String phone, int regionCode, String regionName,
			String subRegionCode, String subRegionName, int intermediateRegionCode, String intermediateRegionName,
			String status, String developedOrDeveloping, String sids, String lldc, String ldc, int areaSqKm,
			int population) {
		super();
		this.iso = iso;
		this.iso3 = iso3;
		this.fips = fips;
		this.displayName = displayName;
		this.officialName = officialName;
		this.capital = capital;
		this.continent = continent;
		this.currencyCode = currencyCode;
		this.currencyName = currencyName;
		this.phone = phone;
		this.regionCode = regionCode;
		this.regionName = regionName;
		this.subRegionCode = subRegionCode;
		this.subRegionName = subRegionName;
		this.intermediateRegionCode = intermediateRegionCode;
		this.intermediateRegionName = intermediateRegionName;
		this.status = status;
		this.developedOrDeveloping = developedOrDeveloping;
		this.sids = sids;
		this.lldc = lldc;
		this.ldc = ldc;
		this.areaSqKm = areaSqKm;
		this.population = population;
	}

	public int getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(int isoCode) {
		this.isoCode = isoCode;
	}

	public String getIso() {
	    return iso != null ? iso : "";
	}

	public void setIso(String iso) {
	    this.iso = iso;
	}

	public String getIso3() {
	    return iso3 != null ? iso3 : "";
	}

	public void setIso3(String iso3) {
	    this.iso3 = iso3;
	}

	public String getFips() {
	    return fips != null ? fips : "";
	}

	public void setFips(String fips) {
	    this.fips = fips;
	}

	public String getDisplayName() {
	    return displayName != null ? displayName : "";
	}

	public void setDisplayName(String displayName) {
	    this.displayName = displayName;
	}

	public String getOfficialName() {
	    return officialName != null ? officialName : "";
	}

	public void setOfficialName(String officialName) {
	    this.officialName = officialName;
	}

	public String getCapital() {
	    return capital != null ? capital : "";
	}

	public void setCapital(String capital) {
	    this.capital = capital;
	}

	public String getContinent() {
	    return continent != null ? continent : "";
	}

	public void setContinent(String continent) {
	    this.continent = continent;
	}

	public String getCurrencyCode() {
	    return currencyCode != null ? currencyCode : "";
	}

	public void setCurrencyCode(String currencyCode) {
	    this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
	    return currencyName != null ? currencyName : "";
	}

	public void setCurrencyName(String currencyName) {
	    this.currencyName = currencyName;
	}

	public String getPhone() {
	    return phone != null ? phone : "";
	}

	public void setPhone(String phone) {
	    this.phone = phone;
	}

	public int getRegionCode() {
	    return regionCode != null ? regionCode : -1;
	}

	public void setRegionCode(int regionCode) {
	    this.regionCode = regionCode;
	}

	public String getRegionName() {
	    return regionName != null ? regionName : "";
	}

	public void setRegionName(String regionName) {
	    this.regionName = regionName;
	}

	public String getSubRegionCode() {
	    return subRegionCode != null ? subRegionCode : "";
	}

	public void setSubRegionCode(String subRegionCode) {
	    this.subRegionCode = subRegionCode;
	}

	public String getSubRegionName() {
	    return subRegionName != null ? subRegionName : "";
	}

	public void setSubRegionName(String subRegionName) {
	    this.subRegionName = subRegionName;
	}

	public int getIntermediateRegionCode() {
	    return intermediateRegionCode != null ? intermediateRegionCode : -1;
	}

	public void setIntermediateRegionCode(int intermediateRegionCode) {
	    this.intermediateRegionCode = intermediateRegionCode;
	}

	public String getIntermediateRegionName() {
	    return intermediateRegionName != null ? intermediateRegionName : "";
	}

	public void setIntermediateRegionName(String intermediateRegionName) {
	    this.intermediateRegionName = intermediateRegionName;
	}

	public String getStatus() {
	    return status != null ? status : "";
	}

	public void setStatus(String status) {
	    this.status = status;
	}

	public String getDevelopedOrDeveloping() {
	    return developedOrDeveloping != null ? developedOrDeveloping : "";
	}

	public void setDevelopedOrDeveloping(String developedOrDeveloping) {
	    this.developedOrDeveloping = developedOrDeveloping;
	}

	public String getSids() {
	    return sids != null ? sids : "";
	}

	public void setSids(String sids) {
	    this.sids = sids;
	}

	public String getLldc() {
	    return lldc != null ? lldc : "";
	}

	public void setLldc(String lldc) {
	    this.lldc = lldc;
	}

	public String getLdc() {
	    return ldc != null ? ldc : "";
	}

	public void setLdc(String ldc) {
	    this.ldc = ldc;
	}

	public int getAreaSqKm() {
	    return areaSqKm != null ? areaSqKm : -1;
	}

	public void setAreaSqKm(int areaSqKm) {
	    this.areaSqKm = areaSqKm;
	}

	public int getPopulation() {
	    return population != null ? population : -1;
	}

	public void setPopulation(int population) {
	    this.population = population;
	}

}

