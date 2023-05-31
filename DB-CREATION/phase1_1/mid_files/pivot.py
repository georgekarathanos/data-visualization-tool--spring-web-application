import pandas as pd

##Final csv creation for Income Index
income_index_df = pd.read_csv('mid_income_index.csv')
df_melted = income_index_df.melt(id_vars=['Country', 'ISO_Code'], var_name='Year', value_name='income_index')
df_melted.dropna(inplace=True)
df_final = df_melted.rename(columns={'Country': 'Country', 'ISO_Code': 'ISO_Code', 'Year': 'Year', 'income_index': 'income_index'})
df_final.to_csv('final_files/final_income_index.csv', index=False)
print("Done with Income Index!!!\n")

##Final csv creation for Labour share of GDP
labour_share_gdp_df = pd.read_csv('mid_labour_share_gdp.csv')
df_melted = labour_share_gdp_df.melt(id_vars=['Country', 'ISO_Code'], var_name='Year', value_name='labour_share_gdp')
df_melted.dropna(inplace=True)
df_final = df_melted.rename(columns={'Country': 'Country', 'ISO_Code': 'ISO_Code', 'Year': 'Year', 'labour_share_gdp': 'labour_share_gdp'})
df_final.to_csv('final_files/final_labour_share_gdp.csv', index=False)
print("Done with Labour share of GDP!!!\n")

##Final csv creation for Gross fixed capital formation
gross_fixed_capital_formation_df = pd.read_csv('mid_gross_fixed_capital_formation.csv')
df_melted = gross_fixed_capital_formation_df.melt(id_vars=['Country', 'ISO_Code'], var_name='Year', value_name='gross_fixed_capital_formation')
df_melted.dropna(inplace=True)
df_final = df_melted.rename(columns={'Country': 'Country', 'ISO_Code': 'ISO_Code', 'Year': 'Year', 'gross_fixed_capital_formation': 'gross_fixed_capital_formation'})
df_final.to_csv('final_files/final_gross_fixed_capital_formation.csv', index=False)
print("Done with Gross fixed capital formation!!!\n")

##Final csv creation for GDP total
gdp_total_df = pd.read_csv('mid_gdp_total.csv')
df_melted = gdp_total_df.melt(id_vars=['Country', 'ISO_Code'], var_name='Year', value_name='gdp_total')
df_melted.dropna(inplace=True)
df_final = df_melted.rename(columns={'Country': 'Country', 'ISO_Code': 'ISO_Code', 'Year': 'Year', 'gdp_total': 'gdp_total'})
df_final.to_csv('final_files/final_gdp_total.csv', index=False)
print("Done with GDP total!!!\n")

##Final csv creation for GDP per capita
gdp_per_capita_df = pd.read_csv('mid_gdp_per_capita.csv')
df_melted = gdp_per_capita_df.melt(id_vars=['Country', 'ISO_Code'], var_name='Year', value_name='gdp_per_capita')
df_melted.dropna(inplace=True)
df_final = df_melted.rename(columns={'Country': 'Country', 'ISO_Code': 'ISO_Code', 'Year': 'Year', 'gdp_per_capita': 'gdp_per_capita'})
df_final.to_csv('final_files/final_gdp_per_capita.csv', index=False)
print("Done with GDP per capita!!!\n")

##Final csv creation for GNI per capita
gni_per_capita_df = pd.read_csv('mid_gni_per_capita.csv')
df_melted = gni_per_capita_df.melt(id_vars=['Country', 'ISO_Code'], var_name='Year', value_name='gni_per_capita')
df_melted.dropna(inplace=True)
df_final = df_melted.rename(columns={'Country': 'Country', 'ISO_Code': 'ISO_Code', 'Year': 'Year', 'gni_per_capita': 'gni_per_capita'})
df_final.to_csv('final_files/final_gni_per_capita.csv', index=False)
print("Done with GNI per capita!!!\n")

##Final csv creation for Estimated GNI male
estimated_gni_male_df = pd.read_csv('mid_estimated_gni_male.csv')
df_melted = estimated_gni_male_df.melt(id_vars=['Country', 'ISO_Code'], var_name='Year', value_name='estimated_gni_male')
df_melted.dropna(inplace=True)
df_final = df_melted.rename(columns={'Country': 'Country', 'ISO_Code': 'ISO_Code', 'Year': 'Year', 'estimated_gni_male': 'estimated_gni_male'})
df_final.to_csv('final_files/final_estimated_gni_male.csv', index=False)
print("Done with Estimated GNI male!!!\n")

##Final csv creation for Estimated GNI female
esitmated_gni_female_df = pd.read_csv('mid_estimated_gni_female.csv')
df_melted = esitmated_gni_female_df.melt(id_vars=['Country', 'ISO_Code'], var_name='Year', value_name='esitmated_gni_female')
df_melted.dropna(inplace=True)
df_final = df_melted.rename(columns={'Country': 'Country', 'ISO_Code': 'ISO_Code', 'Year': 'Year', 'esitmated_gni_female': 'esitmated_gni_female'})
df_final.to_csv('final_files/final_estimated_gni_female.csv', index=False)
print("Done with Estimated GNI female!!!\n")

##Final csv creation for Domestic credits
domestic_credits_df = pd.read_csv('mid_domestic_credits.csv')
df_melted = domestic_credits_df.melt(id_vars=['Country', 'ISO_Code'], var_name='Year', value_name='domestic_credits')
df_melted.dropna(inplace=True)
df_final = df_melted.rename(columns={'Country': 'Country', 'ISO_Code': 'ISO_Code', 'Year': 'Year', 'domestic_credits': 'domestic_credits'})
df_final.to_csv('final_files/final_domestic_credits.csv', index=False)
print("Done with Domestic credits!!!\n")