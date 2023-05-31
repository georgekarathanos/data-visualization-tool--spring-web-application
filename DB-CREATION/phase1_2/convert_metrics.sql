INSERT INTO GENERAL_METRICS_FOR_COUNTRIES
	SELECT G.ISO_Code, G.Year, C.Official_Name, G.Income_Index, G.Labour_Share_GDP,
			G.Gross_fixed_capital_formation, G.GDP_Total, G.GDP_Per_Capita, G.GNI_Per_Capita,
			G.Estimated_GNI_Male, G.Estimated_GNI_Female, G.Domestic_Credits
	FROM GENERAL_METRICS_FOR_COUNTRIES_TEMP AS G JOIN COUNTRIES AS C
	WHERE G.ISO_Code = C.ISO_Code;