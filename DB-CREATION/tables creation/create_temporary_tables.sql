CREATE TABLE IF NOT EXISTS Income_Index_Temp (
  Country VARCHAR(100),
  ISO_Code INT,
  Year INT,
  income_index REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS Labour_Share_GDP_Temp (
  Country VARCHAR(100),
  ISO_Code INT,
  Year INT,
  labour_share_gdp REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS Gross_fixed_capital_formation_Temp (
  Country VARCHAR(100),
  ISO_Code INT,
  Year INT,
  gross_fixed_capital_formation REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS GDP_Total_Temp (
  Country VARCHAR(100),
  ISO_Code INT,
  Year INT,
  gdp_total REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS GDP_Per_Capita_Temp(
  Country VARCHAR(100),
  ISO_Code INT,
  Year INT,
  gdp_per_capita REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS GNI_Per_Capita_Temp (
  Country VARCHAR(100),
  ISO_Code INT,
  Year INT,
  gni_per_capita REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS Estimated_GNI_Male_Temp (
  Country VARCHAR(100),
  ISO_Code INT,
  Year INT,
  estimated_gni_male REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS Estimated_GNI_Female_Temp (
  Country VARCHAR(100),
  ISO_Code INT,
  Year INT,
  estimated_gni_female REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

CREATE TABLE IF NOT EXISTS Domestic_Credits_Temp (
  Country VARCHAR(100),
  ISO_Code INT,
  Year INT,
  domestic_credits REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);