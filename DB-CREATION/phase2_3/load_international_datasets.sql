INSERT INTO INTERNATIONAL_DATASETS
  SELECT ISO_Code, Year,
         MAX(country_code),
         MAX(country_name),
         MAX(fertility_rate_15_19),
         MAX(fertility_rate_20_24),
         MAX(fertility_rate_25_29),
         MAX(fertility_rate_30_34),
         MAX(fertility_rate_35_39),
         MAX(fertility_rate_40_44),
         MAX(fertility_rate_45_49),
         MAX(total_fertility_rate),
         MAX(gross_reproduction_rate),
         MAX(sex_ratio_at_birth),
         MAX(crude_birth_rate),
         MAX(crude_death_rate),
         MAX(net_migration),
         MAX(rate_natural_increase),
         MAX(growth_rate),
         MAX(midyear_population),
         MAX(total_flag),
         MAX(starting_age),
         MAX(age_group_indicator),
         MAX(ending_age),
         MAX(midyear_population_sex),
         MAX(midyear_population_male),
         MAX(midyear_population_female),
         MAX(infant_mortality),
         MAX(infant_mortality_male),
         MAX(infant_mortality_female),
         MAX(life_expectancy),
         MAX(life_expectancy_male),
         MAX(life_expectancy_female),
         MAX(mortality_rate_under5),
         MAX(mortality_rate_under5_male),
         MAX(mortality_rate_under5_female),
         MAX(mortality_rate_1to4),
         MAX(mortality_rate_1to4_male),
         MAX(mortality_rate_1to4_female)
  FROM (
    (SELECT ISO_Code, Year, country_code, country_name, fertility_rate_15_19,
        fertility_rate_20_24, fertility_rate_25_29, fertility_rate_30_34,
        fertility_rate_35_39, fertility_rate_40_44, fertility_rate_45_49,
        total_fertility_rate, gross_reproduction_rate, sex_ratio_at_birth,
        NULL AS crude_birth_rate, NULL AS crude_death_rate, NULL AS net_migration,
        NULL AS rate_natural_increase, NULL AS growth_rate, NULL AS midyear_population,
        NULL AS total_flag, NULL AS starting_age, NULL AS age_group_indicator,
        NULL AS ending_age, NULL AS midyear_population_sex, NULL AS midyear_population_male,
        NULL AS midyear_population_female, NULL AS infant_mortality, NULL AS infant_mortality_male,
        NULL AS infant_mortality_female, NULL AS life_expectancy, NULL AS life_expectancy_male,
        NULL AS life_expectancy_female, NULL AS mortality_rate_under5, NULL AS mortality_rate_under5_male,
        NULL AS mortality_rate_under5_female, NULL AS mortality_rate_1to4, NULL AS mortality_rate_1to4_male,
        NULL AS mortality_rate_1to4_female
    FROM Age_Specific_Fertility_Rates_Temp)
    
    UNION
    
    (SELECT ISO_Code, Year, country_code, country_name, NULL AS fertility_rate_15_19,
           NULL AS fertility_rate_20_24, NULL AS fertility_rate_25_29, NULL AS fertility_rate_30_34,
           NULL AS fertility_rate_35_39, NULL AS fertility_rate_40_44, NULL AS fertility_rate_45_49,
           NULL AS total_fertility_rate, NULL AS gross_reproduction_rate, NULL AS sex_ratio_at_birth,
           crude_birth_rate, crude_death_rate, net_migration,
           rate_natural_increase, growth_rate, NULL AS midyear_population,
           NULL AS total_flag, NULL AS starting_age, NULL AS age_group_indicator,
           NULL AS ending_age, NULL AS midyear_population_sex, NULL AS midyear_population_male,
           NULL AS midyear_population_female, NULL AS infant_mortality, NULL AS infant_mortality_male,
           NULL AS infant_mortality_female, NULL AS life_expectancy, NULL AS life_expectancy_male,
           NULL AS life_expectancy_female, NULL AS mortality_rate_under5, NULL AS mortality_rate_under5_male,
           NULL AS mortality_rate_under5_female, NULL AS mortality_rate_1to4, NULL AS mortality_rate_1to4_male,
           NULL AS mortality_rate_1to4_female
    FROM Birth_death_Growth_Rates_Temp)
    
    UNION
    
    (SELECT ISO_Code, Year, country_code, country_name, NULL AS fertility_rate_15_19,
           NULL AS fertility_rate_20_24, NULL AS fertility_rate_25_29, NULL AS fertility_rate_30_34,
           NULL AS fertility_rate_35_39, NULL AS fertility_rate_40_44, NULL AS fertility_rate_45_49,
           NULL AS total_fertility_rate, NULL AS gross_reproduction_rate, NULL AS sex_ratio_at_birth,
           NULL AS crude_birth_rate, NULL AS crude_death_rate, NULL AS net_migration,
           NULL AS rate_natural_increase, NULL AS growth_rate, midyear_population,
           NULL AS total_flag, NULL AS starting_age, NULL AS age_group_indicator,
           NULL AS ending_age, NULL AS midyear_population_sex, NULL AS midyear_population_male,
           NULL AS midyear_population_female, NULL AS infant_mortality, NULL AS infant_mortality_male,
           NULL AS infant_mortality_female, NULL AS life_expectancy, NULL AS life_expectancy_male,
           NULL AS life_expectancy_female, NULL AS mortality_rate_under5, NULL AS mortality_rate_under5_male,
           NULL AS mortality_rate_under5_female, NULL AS mortality_rate_1to4, NULL AS mortality_rate_1to4_male,
           NULL AS mortality_rate_1to4_female
    FROM Midyear_Population_Temp)
    
    UNION
    
    (SELECT ISO_Code, Year, country_code, country_name, NULL AS fertility_rate_15_19,
           NULL AS fertility_rate_20_24, NULL AS fertility_rate_25_29, NULL AS fertility_rate_30_34,
           NULL AS fertility_rate_35_39, NULL AS fertility_rate_40_44, NULL AS fertility_rate_45_49,
           NULL AS total_fertility_rate, NULL AS gross_reproduction_rate, NULL AS sex_ratio_at_birth,
           NULL AS crude_birth_rate, NULL AS crude_death_rate, NULL AS net_migration,
           NULL AS rate_natural_increase, NULL AS growth_rate, NULL AS midyear_population,
           total_flag, starting_age, age_group_indicator,
           ending_age, midyear_population_sex, midyear_population_male,
           midyear_population_female, NULL AS infant_mortality, NULL AS infant_mortality_male,
           NULL AS infant_mortality_female, NULL AS life_expectancy, NULL AS life_expectancy_male,
           NULL AS life_expectancy_female, NULL AS mortality_rate_under5, NULL AS mortality_rate_under5_male,
           NULL AS mortality_rate_under5_female, NULL AS mortality_rate_1to4, NULL AS mortality_rate_1to4_male,
           NULL AS mortality_rate_1to4_female
    FROM Midyear_Population_5yr_Age_Sex_Temp)

    UNION

    (SELECT ISO_Code, Year, country_code, country_name, NULL AS fertility_rate_15_19,
           NULL AS fertility_rate_20_24, NULL AS fertility_rate_25_29, NULL AS fertility_rate_30_34,
           NULL AS fertility_rate_35_39, NULL AS fertility_rate_40_44, NULL AS fertility_rate_45_49,
           NULL AS total_fertility_rate, NULL AS gross_reproduction_rate, NULL AS sex_ratio_at_birth,
           NULL AS crude_birth_rate, NULL AS crude_death_rate, NULL AS net_migration,
           NULL AS rate_natural_increase, NULL AS growth_rate, NULL AS midyear_population,
           NULL AS total_flag, NULL AS starting_age, NULL AS age_group_indicator,
           NULL AS ending_age, NULL AS midyear_population_sex, NULL AS midyear_population_male,
           NULL AS midyear_population_female, infant_mortality, infant_mortality_male,
           infant_mortality_female, life_expectancy, life_expectancy_male,
           life_expectancy_female, mortality_rate_under5, mortality_rate_under5_male,
           mortality_rate_under5_female, mortality_rate_1to4, mortality_rate_1to4_male,
           mortality_rate_1to4_female
    FROM Mortality_Life_Expectancy_Temp)) AS EVERYONE
  GROUP BY ISO_Code, Year;