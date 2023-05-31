import pandas as pd
import warnings
warnings.filterwarnings('ignore') #this is to not get spammed by warnings

#open countries file
countries_df = pd.read_csv('countries.csv')

#open excel with metrics
general_file = pd.ExcelFile('income_by_country.xlsx')

#open every sheet
income_index_df = general_file.parse("Income Index")
labour_share_gdp_df = general_file.parse("Labour share of GDP")
gross_fixed_capital_formation_df = general_file.parse("Gross fixed capital formation")
gdp_total_df = general_file.parse("GDP total")
gdp_per_capita_df = general_file.parse("GDP per capita")
gni_per_capita_df = general_file.parse("GNI per capita")
estimated_gni_male_df = general_file.parse("Estimated GNI male")
esitmated_gni_female_df = general_file.parse("Estimated GNI female")
domestic_credits_df = general_file.parse("Domestic credits")

sheets = [income_index_df, labour_share_gdp_df, gross_fixed_capital_formation_df, gdp_total_df,
		 gdp_per_capita_df, gni_per_capita_df, estimated_gni_male_df, esitmated_gni_female_df, domestic_credits_df]


#STEP 1: FOR EACH SHEET RETURN THE COUNTRY THAT IT'S NAME IS NOT IN THE COUNTRIES DISPLAY NAME COLUMN AND THE NUMBER OF THE SHEET.
print("\n################ PRINT ALL COUNTRY GARBAGE NAMES ################")
valid_countries = list(countries_df["Official_Name"])
garbage_countries = set()
for i in range(len(sheets)): ##loop to find garbage countries in all sheets and hold them all in a set
	current_countries = sheets[i]["Country"]
	for j in range(len(current_countries)):
		current_country = current_countries[j]
		if not current_country in valid_countries:
			garbage_countries.add(current_country)

for country in garbage_countries:
	print(country)
print("################ END OF PRINTING COYNTRY GARBAGE NAMES ################\n")

#STEP 2: CREATE A DICTIONARY WITH KEY THE NAME OF THE COYNTRY AND VALUE THE OSI_CODE
#create a dictionary with country name as key and the iso code as value
get_iso = {}
for index, row in countries_df.iterrows():
    name = row['Official_Name']
    iso_code = row['ISO_Code']
    # Add a new key-value pair to the dictionary
    if pd.isna(name):
    	get_iso[row['Display_Name']] = iso_code
    else:
    	get_iso[name] = iso_code

#add the garbage country names with the correct iso code by hand (this is necessary for mapping)
	#givind -1 as value means this is not a valid country and will be dropped out from the final data-set
get_iso["South Asia"] = -1 ##NOT A COUNTRY
get_iso["Palestine; State of"] = 275
get_iso["Eswatini (Kingdom of)"] = 748
get_iso["Korea (Republic of)"] = 410 ##SOUTH(408) OR NORTH(410) PROBABLY NORTH
get_iso["Developing Countries"] = -1 ##not a specific country
get_iso["Least Developed Countries"] = -1 ##not a specific country
get_iso["Medium human development"] = -1 ##not a specific country
get_iso["Latin America and the Caribbean"] = -1 ##true for many countries
get_iso["Arab States"] = -1 ##true for many countries
get_iso["Low human development"] = -1 ##not a specific country
get_iso["Europe and Central Asia"] = -1 ##true for many countries
get_iso["Sub-Saharan Africa"] = -1 ##true for many countries
get_iso["Regions"] = -1 ##not a specific country
get_iso["United Kingdom"] = 826
get_iso["Hong Kong; China (SAR)"] = 344
get_iso["World"] = -1 ##not a specific country
get_iso["Congo (Democratic Republic of the)"] = 178
get_iso["CÃ´te d'Ivoire"] = 384
get_iso["East Asia and the Pacific"] = -1 ##true for many countries
get_iso["Very high human development"] = -1 ##not a specific country
get_iso["Tanzania (United Republic of)"] = 834
get_iso["High human development"] = -1 ##not a specific country
get_iso["North Macedonia"] = 807 ##does not exist in countries array (exists as macedonia)
get_iso["United States"] = 840
get_iso["Human Development"] = -1 ##not a specific country
get_iso["Small Island Developing States"] = -1 ##not a specific country
get_iso["Moldova (Republic of)"] = 498
get_iso["Organization for Economic Co-operation and Development"] = -1 ##not a country

##Mid csv creation for Income Index
mid_income_index_df = pd.DataFrame(columns=['Country', 1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,
					 2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018, 'ISO_Code'])
for index, row in income_index_df.iterrows():
	if(get_iso[row['Country']] != -1):
	    new_row = {'Country': row['Country'], 1990: row[1990],1991: row[1991],1992: row[1992],1993: row[1993],1994: row[1994],1995: row[1995],
	    		1996: row[1996],1997: row[1997],1998: row[1998],1999: row[1999],2000: row[2000],2001: row[2001],2002: row[2002],2003: row[2003],
	    		2004: row[2004],2005: row[2005],2006: row[2006],2007: row[2007],2008: row[2008],2009: row[2009],2010: row[2010],2011: row[2011],
	    		2012: row[2012],2013: row[2013],2014: row[2014],2015: row[2015],2016: row[2016],2017: row[2017],2018: row[2018], 'ISO_Code' : get_iso[row['Country']]}
	    mid_income_index_df = mid_income_index_df.append(new_row, ignore_index=True)
mid_income_index_df.to_csv('mid_files/mid_income_index.csv', index=False)
print("Done with Income Index!!!\n")


##Mid csv creation for Labour share of GDP
mid_labour_share_gdp_df = pd.DataFrame(columns=['Country', 2000,2005,2010,2011,2012,2013,2014,2015,2016,2017,2018, 'ISO_Code'])
for index, row in labour_share_gdp_df.iterrows():
	if(get_iso[row['Country']] != -1):
	    new_row = {'Country': row['Country'],2000: row[2000],2005: row[2005],2010: row[2010],2011: row[2011],2012: row[2012],
	    		2013: row[2013],2014: row[2014],2015: row[2015],2016: row[2016],2017: row[2017],2018: row[2018], 'ISO_Code' : get_iso[row['Country']]}
	    mid_labour_share_gdp_df = mid_labour_share_gdp_df.append(new_row, ignore_index=True)
mid_labour_share_gdp_df.to_csv('mid_files/mid_labour_share_gdp.csv', index=False)
print("Done with Labour share of GDP!!!\n")

##Mid csv creation for Gross fixed capital formation
mid_gross_fixed_capital_formation_df = pd.DataFrame(columns=['Country', 1990,1995,2000,2005,2010,2011,2012,2013,2014,2015,2016,2017,2018, 'ISO_Code'])
for index, row in gross_fixed_capital_formation_df.iterrows():
	if(get_iso[row['Country']] != -1):
	    new_row = {'Country': row['Country'], 1990: row[1990],1995: row[1995],2000: row[2000],2005: row[2005],2010: row[2010],2011: row[2011],
	    		2012: row[2012],2013: row[2013],2014: row[2014],2015: row[2015],2016: row[2016],2017: row[2017],2018: row[2018], 'ISO_Code' : get_iso[row['Country']]}
	    mid_gross_fixed_capital_formation_df = mid_gross_fixed_capital_formation_df.append(new_row, ignore_index=True)
mid_gross_fixed_capital_formation_df.to_csv('mid_files/mid_gross_fixed_capital_formation.csv', index=False)
print("Done with Gross fixed capital formation!!!\n")

##Mid csv creation for GDP total
mid_gdp_total_df = pd.DataFrame(columns=['Country', 1990,1995,2000,2005,2010,2011,2012,2013,2014,2015,2016,2017,2018, 'ISO_Code'])
for index, row in gdp_total_df.iterrows():
	if(get_iso[row['Country']] != -1):
	    new_row = {'Country': row['Country'], 1990: row[1990],1995: row[1995],2000: row[2000],2005: row[2005],2010: row[2010],2011: row[2011],
	    		2012: row[2012],2013: row[2013],2014: row[2014],2015: row[2015],2016: row[2016],2017: row[2017],2018: row[2018], 'ISO_Code' : get_iso[row['Country']]}
	    mid_gdp_total_df = mid_gdp_total_df.append(new_row, ignore_index=True)
mid_gdp_total_df.to_csv('mid_files/mid_gdp_total.csv', index=False)
print("Done with GDP total!!!\n")

##Mid csv creation for GDP per capita
mid_gdp_per_capita_df = pd.DataFrame(columns=['Country', 1990,1995,2000,2005,2010,2011,2012,2013,2014,2015,2016,2017,2018, 'ISO_Code'])
for index, row in gdp_per_capita_df.iterrows():
	if(get_iso[row['Country']] != -1):
	    new_row = {'Country': row['Country'], 1990: row[1990],1995: row[1995],2000: row[2000],2005: row[2005],2010: row[2010],2011: row[2011],
	    		2012: row[2012],2013: row[2013],2014: row[2013],2015: row[2015],2016: row[2016],2017: row[2017],2018: row[2018], 'ISO_Code' : get_iso[row['Country']]}
	    mid_gdp_per_capita_df = mid_gdp_per_capita_df.append(new_row, ignore_index=True)
mid_gdp_per_capita_df.to_csv('mid_files/mid_gdp_per_capita.csv', index=False)
print("Done with GDP per capita!!!\n")

##Mid csv creation for GNI per capita
mid_gni_per_capita_df = pd.DataFrame(columns=['Country', 1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,
					 2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018, 'ISO_Code'])
for index, row in gni_per_capita_df.iterrows():
	if(get_iso[row['Country']] != -1):
	    new_row = {'Country': row['Country'], 1990: row[1990],1991: row[1991],1992: row[1992],1993: row[1993],1994: row[1994],1995: row[1995],
	    		1996: row[1996],1997: row[1997],1998: row[1998],1999: row[1999],2000: row[2000],2001: row[2001],2002: row[2002],2003: row[2003],
	    		2004: row[2004],2005: row[2005],2006: row[2006],2007: row[2007],2008: row[2008],2009: row[2009],2010: row[2010],2011: row[2011],
	    		2012: row[2012],2013: row[2013],2014: row[2014],2015: row[2015],2016: row[2016],2017: row[2017],2018: row[2018], 'ISO_Code' : get_iso[row['Country']]}
	    mid_gni_per_capita_df = mid_gni_per_capita_df.append(new_row, ignore_index=True)
mid_gni_per_capita_df.to_csv('mid_files/mid_gni_per_capita.csv', index=False)
print("Done with GNI per capita!!!\n")

##Mid csv creation for Estimated GNI male
mid_estimated_gni_male_df = pd.DataFrame(columns=['Country', 1995,2000,2005,2010,2011,2012,2013,2014,2015,2016,2017,2018, 'ISO_Code'])
for index, row in estimated_gni_male_df.iterrows():
	if(get_iso[row['Country']] != -1):
	    new_row = {'Country': row['Country'],1995: row[1995],2000: row[2000],2005: row[2005],2010: row[2010],2011: row[2011],
	    		2012: row[2012],2013: row[2013],2014: row[2013],2015: row[2015],2016: row[2016],2017: row[2017],2018: row[2018], 'ISO_Code' : get_iso[row['Country']]}
	    mid_estimated_gni_male_df = mid_estimated_gni_male_df.append(new_row, ignore_index=True)
mid_estimated_gni_male_df.to_csv('mid_files/mid_estimated_gni_male.csv', index=False)
print("Done with Estimated GNI male!!!\n")

##Mid csv creation for Estimated GNI female
mid_esitmated_gni_female_df = pd.DataFrame(columns=['Country', 1995,2000,2005,2010,2011,2012,2013,2014,2015,2016,2017,2018, 'ISO_Code'])
for index, row in esitmated_gni_female_df.iterrows():
	if(get_iso[row['Country']] != -1):
	    new_row = {'Country': row['Country'],1995: row[1995],2000: row[2000],2005: row[2005],2010: row[2010],2011: row[2011],
	    		2012: row[2012],2013: row[2013],2014: row[2013],2015: row[2015],2016: row[2016],2017: row[2017],2018: row[2018], 'ISO_Code' : get_iso[row['Country']]}
	    mid_esitmated_gni_female_df = mid_esitmated_gni_female_df.append(new_row, ignore_index=True)
mid_esitmated_gni_female_df.to_csv('mid_files/mid_estimated_gni_female.csv', index=False)
print("Done with Estimated GNI female!!!\n")

##Mid csv creation for Domestic credits
mid_domestic_credits_df = pd.DataFrame(columns=['Country',1990,1995,2000,2005,2010,2011,2012,2013,2014,2015,2016,2017,2018, 'ISO_Code'])
for index, row in domestic_credits_df.iterrows():
	if(get_iso[row['Country']] != -1):
	    new_row = {'Country': row['Country'],1990: row[1990],1995: row[1995],2000: row[2000],2005: row[2005],2010: row[2010],2011: row[2011],
	    		2012: row[2012],2013: row[2013],2014: row[2014],2015: row[2015],2016: row[2016],2017: row[2017],2018: row[2018], 'ISO_Code' : get_iso[row['Country']]}
	    mid_domestic_credits_df = mid_domestic_credits_df.append(new_row, ignore_index=True)
mid_domestic_credits_df.to_csv('mid_files/mid_domestic_credits.csv', index=False)
print("Done with Domestic credits!!!\n")