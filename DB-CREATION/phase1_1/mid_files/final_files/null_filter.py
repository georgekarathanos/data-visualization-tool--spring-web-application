import pandas as pd

df = pd.read_csv('final_income_index.csv')
df = df[df['income_index'] != '..']
df.to_csv('final_income_index.csv', index=False)

df = pd.read_csv('final_labour_share_gdp.csv')
df = df[df['labour_share_gdp'] != '..']
df.to_csv('final_labour_share_gdp.csv', index=False)

df = pd.read_csv('final_gross_fixed_capital_formation.csv')
df = df[df['gross_fixed_capital_formation'] != '..']
df.to_csv('final_gross_fixed_capital_formation.csv', index=False)

df = pd.read_csv('final_gdp_total.csv')
df = df[df['gdp_total'] != '..']
df.to_csv('final_gdp_total.csv', index=False)

df = pd.read_csv('final_gdp_per_capita.csv')
df = df[df['gdp_per_capita'] != '..']
df.to_csv('final_gdp_per_capita.csv', index=False)

df = pd.read_csv('final_gni_per_capita.csv')
df = df[df['gni_per_capita'] != '..']
df.to_csv('final_gni_per_capita.csv', index=False)

df = pd.read_csv('final_estimated_gni_male.csv')
df = df[df['estimated_gni_male'] != '..']
df.to_csv('final_estimated_gni_male.csv', index=False)

df = pd.read_csv('final_estimated_gni_female.csv')
df = df[df['esitmated_gni_female'] != '..']
df.to_csv('final_estimated_gni_female.csv', index=False)

df = pd.read_csv('final_domestic_credits.csv')
df = df[df['domestic_credits'] != '..']
df.to_csv('final_domestic_credits.csv', index=False)
