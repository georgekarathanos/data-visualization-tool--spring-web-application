LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/age_specific_fertility_rates_utf8_with_iso.csv"
INTO TABLE Age_Specific_Fertility_Rates_Temp
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/birth_death_growth_rates_utf8_with_iso.csv"
INTO TABLE Birth_death_Growth_Rates_Temp
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/midyear_population_utf8_with_iso.csv"
INTO TABLE Midyear_Population_Temp
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/midyear_population_5yr_age_sex_utf8_with_iso.csv"
INTO TABLE Midyear_Population_5yr_Age_Sex_Temp
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/mortality_life_expectancy_utf8_with_iso.csv"
INTO TABLE Mortality_Life_Expectancy_Temp
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;
