import pandas as pd
import numpy as np

# Read the CSV file into a DataFrame
df = pd.read_csv("C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUtf\\countries_utf8.csv")

# Create an empty dictionary to hold the mapping
iso_to_fips = {}
fips_to_iso = {}
# Iterate over each row in the DataFrame
for index, row in df.iterrows():
    # Get the ISO code and FIPS code for this row
    iso_code = row['ISO_Code']
    fips_code = row['FIPS']
    
    # Skip this row if either code is missing
    if pd.isna(fips_code) or fips_code == "":
        iso_to_fips[iso_code] = -1
    else:
        # Add the mapping from iso_code to fips_code to the dictionary
        iso_to_fips[iso_code] = fips_code
iso_to_fips[-1] = 'GZ'

fips_to_iso = {v: k for k, v in iso_to_fips.items()}
fips_to_iso['GZ'] = -1

#Print the resulting dictionary
#print(iso_to_fips)
#print(len(iso_to_fips))
#print(fips_to_iso)
#print(len(fips_to_iso))

def map_fips_to_iso(input_csv_path, output_csv_path, iso_to_fips_dict):
    # Read the input CSV file into a DataFrame
    df = pd.read_csv(input_csv_path)
    
    # Add a new column 'ISO_Code' to the DataFrame
    df.insert(0, 'ISO_Code', np.nan)
    # Fill the 'ISO_Code' column based on the mapping in iso_to_fips
    for index, row in df.iterrows():
        iso_code = row['country_code']
        #print("iso_code ",iso_code)
        if iso_code in iso_to_fips_dict.values():
            #print("iso_to_fips[iso_code]",fips_to_iso[iso_code])
            df.at[index, 'ISO_Code'] = fips_to_iso[iso_code]
    
    # Drop rows where ISO_Code is -1
    df = df[df['ISO_Code'] != -1]

    # Convert the 'ISO_Code' column to integers
    df['ISO_Code'] = df['ISO_Code'].astype(int)

    # Write the updated DataFrame to the output CSV file
    df.to_csv(output_csv_path, index=False, encoding='utf-8')

# Example usage:
input1_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUtf\\age_specific_fertility_rates_utf8.csv"
output1_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUpdated\\age_specific_fertility_rates_utf8_with_iso.csv"
#map_fips_to_iso(input1_csv_path, output1_csv_path, iso_to_fips)
input2_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUtf\\birth_death_growth_rates_utf8.csv"
output2_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUpdated\\birth_death_growth_rates_utf8_with_iso.csv"
#map_fips_to_iso(input2_csv_path, output2_csv_path, iso_to_fips)
input3_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUtf\\country_names_area_utf8.csv"
output3_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUpdated\\country_names_area_utf8_with_iso.csv"
#map_fips_to_iso(input3_csv_path, output3_csv_path, iso_to_fips)
input4_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUtf\\midyear_population_5yr_age_sex_utf8.csv"
output4_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUpdated\\midyear_population_5yr_age_sex_utf8_with_iso.csv"
#map_fips_to_iso(input4_csv_path, output4_csv_path, iso_to_fips)
input5_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUtf\\midyear_population_age_sex_utf8.csv"
output5_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUpdated\\midyear_population_age_sex_utf8_with_iso.csv"
#map_fips_to_iso(input5_csv_path, output5_csv_path, iso_to_fips)
input6_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUtf\\midyear_population_utf8.csv"
output6_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUpdated\\midyear_population_utf8_with_iso.csv"
#map_fips_to_iso(input6_csv_path, output6_csv_path, iso_to_fips)
input7_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUtf\\mortality_life_expectancy_utf8.csv"
output7_csv_path = "C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUpdated\\mortality_life_expectancy_utf8_with_iso.csv"
#map_fips_to_iso(input7_csv_path, output7_csv_path, iso_to_fips)

df = pd.read_csv("C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUpdated\\midyear_population_5yr_age_sex_utf8_with_iso.csv")
df.drop_duplicates(subset=["ISO_Code","year"] , keep='first', inplace=True)
df.to_csv("C:\\Users\\steli\\Advanced Technologies In Data Bases\\Project\\InternationalDatasetsSmallUpdated\\midyear_population_5yr_age_sex_utf8_with_iso_test.csv", index=False)