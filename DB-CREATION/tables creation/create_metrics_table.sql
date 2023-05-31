CREATE TABLE IF NOT EXISTS GENERAL_METRICS_FOR_COUNTRIES (
  ISO_Code INT,
  Year INT,
  Country_Name VARCHAR(100),
  Income_Index REAL,
  Labour_Share_GDP REAL,
  Gross_fixed_capital_formation REAL,
  GDP_Total REAL,
  GDP_Per_Capita REAL,
  GNI_Per_Capita INT,
  Estimated_GNI_Male INT,
  Estimated_GNI_Female INT,
  Domestic_Credits REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);


CREATE TABLE IF NOT EXISTS GENERAL_METRICS_FOR_COUNTRIES_TEMP (
  ISO_Code INT,
  Year INT,
  Income_Index REAL,
  Labour_Share_GDP REAL,
  Gross_fixed_capital_formation REAL,
  GDP_Total REAL,
  GDP_Per_Capita REAL,
  GNI_Per_Capita INT,
  Estimated_GNI_Male INT,
  Estimated_GNI_Female INT,
  Domestic_Credits REAL,
  PRIMARY KEY(ISO_Code, YEAR),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);