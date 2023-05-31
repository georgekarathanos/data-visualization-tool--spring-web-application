package com.countries.management.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MidyearPopulationAgeSexId implements Serializable {
	private int isoCode;

    private int year;
    
    private String sex;

	public MidyearPopulationAgeSexId(int isoCode, int year, String sex) {
		super();
		this.isoCode = isoCode;
		this.year = year;
		this.sex = sex;
	}
	
	public MidyearPopulationAgeSexId() {}

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
    
    
}
