CREATE TABLE IF NOT EXISTS COUNTRY_AREA (
  ISO_Code INT,
  country_code CHAR(2),
  country_name VARCHAR(50),
  country_area REAL,
  PRIMARY KEY (ISO_Code),
  FOREIGN KEY (ISO_Code) REFERENCES COUNTRIES(ISO_Code)
);

