import pandas as pd

df = pd.read_csv('mid_income_index.csv')
df.drop_duplicates(subset='ISO_Code', keep='first', inplace=True)
df.to_csv('mid_income_index.csv', index=False)

df = pd.read_csv('mid_labour_share_gdp.csv')
df.drop_duplicates(subset='ISO_Code', keep='first', inplace=True)
df.to_csv('mid_labour_share_gdp.csv', index=False)

df = pd.read_csv('mid_gross_fixed_capital_formation.csv')
df.drop_duplicates(subset='ISO_Code', keep='first', inplace=True)
df.to_csv('mid_gross_fixed_capital_formation.csv', index=False)

df = pd.read_csv('mid_gdp_total.csv')
df.drop_duplicates(subset='ISO_Code', keep='first', inplace=True)
df.to_csv('mid_gdp_total.csv', index=False)

df = pd.read_csv('mid_gdp_per_capita.csv')
df.drop_duplicates(subset='ISO_Code', keep='first', inplace=True)
df.to_csv('mid_gdp_per_capita.csv', index=False)

df = pd.read_csv('mid_gni_per_capita.csv')
df.drop_duplicates(subset='ISO_Code', keep='first', inplace=True)
df.to_csv('mid_gni_per_capita.csv', index=False)

df = pd.read_csv('mid_estimated_gni_male.csv')
df.drop_duplicates(subset='ISO_Code', keep='first', inplace=True)
df.to_csv('mid_estimated_gni_male.csv', index=False)

df = pd.read_csv('mid_estimated_gni_female.csv')
df.drop_duplicates(subset='ISO_Code', keep='first', inplace=True)
df.to_csv('mid_estimated_gni_female.csv', index=False)

df = pd.read_csv('mid_domestic_credits.csv')
df.drop_duplicates(subset='ISO_Code', keep='first', inplace=True)
df.to_csv('mid_domestic_credits.csv', index=False)
