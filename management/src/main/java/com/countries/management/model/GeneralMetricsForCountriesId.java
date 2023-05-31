package com.countries.management.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class GeneralMetricsForCountriesId implements Serializable {
    private int isoCode;

    private int year;

	public GeneralMetricsForCountriesId(int isoCode, int year) {
		super();
		this.isoCode = isoCode;
		this.year = year;
	}
	
	public GeneralMetricsForCountriesId() {}

	public int getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(int isoCode) {
		this.isoCode = isoCode;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

