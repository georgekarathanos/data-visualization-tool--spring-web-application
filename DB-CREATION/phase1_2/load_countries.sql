LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/countries.csv'
INTO TABLE countries
FIELDS TERMINATED BY ',' ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS
(@ISO, @ISO3, @ISO_Code, @FIPS, @Display_Name, @Official_Name, @Capital, @Continent, @CurrencyCode, @CurrencyName, @Phone, @Region_Code, @Region_Name, @Sub_Region_Code, @Sub_Region_Name, @Intermediate_Region_Code, @Intermediate_Region_Name, @Status, @Developed_or_Developing, @SIDS, @LLDC, @LDC, @Area_SqKm, @Population)
SET ISO = NULLIF(@ISO, ''),
    ISO3 = NULLIF(@ISO3, ''),
    ISO_Code = NULLIF(@ISO_Code, ''),
    FIPS = NULLIF(@FIPS, ''),
    Display_Name = NULLIF(@Display_Name, ''),
    Official_Name = NULLIF(@Official_Name, ''),
    Capital = NULLIF(@Capital, ''),
    Continent = NULLIF(@Continent, ''),
    Currency_Code = NULLIF(@CurrencyCode, ''),
    Currency_Name = NULLIF(@CurrencyName, ''),
    Phone = NULLIF(@Phone, ''),
    Region_Code = NULLIF(@Region_Code, ''),
    Region_Name = NULLIF(@Region_Name, ''),
    Sub_Region_Code = NULLIF(@Sub_Region_Code, ''),
    Sub_Region_Name = NULLIF(@Sub_Region_Name, ''),
    Intermediate_Region_Code = NULLIF(@Intermediate_Region_Code, ''),
    Intermediate_Region_Name = NULLIF(@Intermediate_Region_Name, ''),
    Status = NULLIF(@Status, ''),
    Developed_or_Developing = NULLIF(@Developed_or_Developing, ''),
    SIDS = NULLIF(@SIDS, ''),
    LLDC = NULLIF(@LLDC, ''),
    LDC = NULLIF(@LDC, ''),
    Area_Sq_Km = NULLIF(@Area_SqKm, ''),
    Population = NULLIF(@Population, '');

