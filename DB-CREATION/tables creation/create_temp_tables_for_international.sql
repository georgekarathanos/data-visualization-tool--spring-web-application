CREATE TABLE IF NOT EXISTS Age_Specific_Fertility_Rates_Temp (
  ISO_Code INT,
  country_code CHAR(2),
  country_name VARCHAR(50),
  year INT,
  fertility_rate_15_19 FLOAT,
  fertility_rate_20_24 FLOAT,
  fertility_rate_25_29 FLOAT,
  fertility_rate_30_34 FLOAT,
  fertility_rate_35_39 FLOAT,
  fertility_rate_40_44 FLOAT,
  fertility_rate_45_49 FLOAT, 
  total_fertility_rate REAL,
  gross_reproduction_rate REAL,
  sex_ratio_at_birth REAL,
  PRIMARY KEY (ISO_Code,year),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS Birth_death_Growth_Rates_Temp (
  ISO_Code INT,
  country_code CHAR(2),
  country_name VARCHAR(50),
  year INT,
  crude_birth_rate REAL,
  crude_death_rate REAL,
  net_migration REAL,
  rate_natural_increase REAL,
  growth_rate REAL,
  PRIMARY KEY (ISO_Code,year),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS Midyear_Population_Temp (
  ISO_Code INT,
  country_code CHAR(2),
  country_name VARCHAR(50),
  year INT,
  midyear_population INT,
  PRIMARY KEY (ISO_Code,year),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS Midyear_Population_5yr_Age_Sex_Temp (
  ISO_Code INT,
  country_code CHAR(2),
  country_name VARCHAR(70),
  year INT,
  total_flag VARCHAR(1),
  starting_age INT,
  age_group_indicator VARCHAR(1),
  ending_age INT,
  midyear_population_sex INT,
  midyear_population_male INT,
  midyear_population_female INT,
  PRIMARY KEY (ISO_Code,year),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS Mortality_Life_Expectancy_Temp (
  ISO_Code INT,
  country_code CHAR(2),
  country_name VARCHAR(50),
  year INT,
  infant_mortality REAL,
  infant_mortality_male REAL,
  infant_mortality_female REAL,
  life_expectancy REAL,
  life_expectancy_male REAL,
  life_expectancy_female REAL,
  mortality_rate_under5 REAL,
  mortality_rate_under5_male REAL,
  mortality_rate_under5_female REAL,
  mortality_rate_1to4 REAL,
  mortality_rate_1to4_male REAL,
  mortality_rate_1to4_female REAL,
  PRIMARY KEY (ISO_Code,year),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

