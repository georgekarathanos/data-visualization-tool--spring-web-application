INSERT INTO GENERAL_METRICS_FOR_COUNTRIES_TEMP
  SELECT ISO_Code, Year,
         MAX(income_index),
         MAX(labour_share_gdp),
         MAX(gross_fixed_capital_formation),
         MAX(gdp_total),
         MAX(gdp_per_capita),
         MAX(gni_per_capita),
         MAX(estimated_gni_male),
         MAX(estimated_gni_female),
         MAX(domestic_credits)
  FROM (
    (SELECT ISO_Code, Year, Country, income_index, NULL AS labour_share_gdp,
           NULL AS gross_fixed_capital_formation, NULL AS gdp_total, NULL AS gdp_per_capita,
           NULL AS gni_per_capita, NULL AS estimated_gni_male, NULL AS estimated_gni_female,
           NULL AS domestic_credits
    FROM Income_Index_Temp)
    UNION
    (SELECT ISO_Code, Year, Country, NULL AS income_index, labour_share_gdp,
           NULL AS gross_fixed_capital_formation, NULL AS gdp_total, NULL AS gdp_per_capita,
           NULL AS gni_per_capita, NULL AS estimated_gni_male, NULL AS estimated_gni_female,
           NULL AS domestic_credits
    FROM Labour_Share_GDP_Temp)
    UNION
    (SELECT ISO_Code, Year, Country, NULL AS income_index, NULL AS labour_share_gdp,
           gross_fixed_capital_formation, NULL AS gdp_total, NULL AS gdp_per_capita,
           NULL AS gni_per_capita, NULL AS estimated_gni_male, NULL AS estimated_gni_female,
           NULL AS domestic_credits
    FROM Gross_fixed_capital_formation_Temp)
    UNION
    (SELECT ISO_Code, Year, Country, NULL AS income_index, NULL AS labour_share_gdp,
           NULL AS gross_fixed_capital_formation, gdp_total, NULL AS gdp_per_capita,
           NULL AS gni_per_capita, NULL AS estimated_gni_male, NULL AS estimated_gni_female,
           NULL AS domestic_credits
    FROM GDP_Total_Temp)
    UNION
    (SELECT ISO_Code, Year, Country, NULL AS income_index, NULL AS labour_share_gdp,
           NULL AS gross_fixed_capital_formation, NULL AS gdp_total, gdp_per_capita,
           NULL AS gni_per_capita, NULL AS estimated_gni_male, NULL AS estimated_gni_female,
           NULL AS domestic_credits
    FROM GDP_Per_Capita_Temp)
    UNION
    (SELECT ISO_Code, Year, Country, NULL AS income_index, NULL AS labour_share_gdp,
           NULL AS gross_fixed_capital_formation, NULL AS gdp_total, NULL AS gdp_per_capita,
           gni_per_capita, NULL AS estimated_gni_male, NULL AS estimated_gni_female,
           NULL AS domestic_credits
    FROM GNI_Per_Capita_Temp)
    UNION
    (SELECT ISO_Code, Year, Country, NULL AS income_index, NULL AS labour_share_gdp,
           NULL AS gross_fixed_capital_formation, NULL AS gdp_total, NULL AS gdp_per_capita,
           NULL AS gni_per_capita, estimated_gni_male, NULL AS estimated_gni_female,
           NULL AS domestic_credits
    FROM Estimated_GNI_Male_Temp)
    UNION
    (SELECT ISO_Code, Year, Country, NULL AS income_index, NULL AS labour_share_gdp,
           NULL AS gross_fixed_capital_formation, NULL AS gdp_total, NULL AS gdp_per_capita,
           NULL AS gni_per_capita, NULL AS estimated_gni_male, estimated_gni_female,
           NULL AS domestic_credits
    FROM Estimated_GNI_Female_Temp)
    UNION
    (SELECT ISO_Code, Year, Country, NULL AS income_index, NULL AS labour_share_gdp,
           NULL AS gross_fixed_capital_formation, NULL AS gdp_total, NULL AS gdp_per_capita,
           NULL AS gni_per_capita, NULL AS estimated_gni_male, NULL AS estimated_gni_female,
           domestic_credits
    FROM Domestic_Credits_Temp)) AS EVERYONE
  GROUP BY ISO_Code, Year;