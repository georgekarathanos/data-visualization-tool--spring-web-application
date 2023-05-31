LOAD DATA INFILE "C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/midyear_population_age_sex_utf8_with_iso.csv"
INTO TABLE Midyear_Population_Age_Sex
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;