LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/country_names_area_utf8_with_iso.csv'
INTO TABLE COUNTRY_AREA
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(ISO_Code, country_code, country_name, country_area);