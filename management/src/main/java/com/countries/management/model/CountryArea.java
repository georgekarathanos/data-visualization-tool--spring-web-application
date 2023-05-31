package com.countries.management.model;

import javax.persistence.*;

@Entity
@Table(name = "country_area")
public class CountryArea {
    @Id
    @Column(name = "ISO_Code")
    private int isoCode;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "country_area")
    private double countryArea;

	public CountryArea(int isoCode, String countryCode, String countryName, double countryArea) {
		super();
		this.isoCode = isoCode;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryArea = countryArea;
	}

	public CountryArea(String countryCode, String countryName, double countryArea) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryArea = countryArea;
	}

	public CountryArea() {
		super();
	}

	public int getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(int isoCode) {
		this.isoCode = isoCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getCountryArea() {
		return countryArea;
	}

	public void setCountryArea(double countryArea) {
		this.countryArea = countryArea;
	}

}

