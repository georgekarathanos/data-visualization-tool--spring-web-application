import csv
import codecs

with codecs.open("midyear_population_5yr_age_sex.csv", encoding='ISO-8859-1') as f_in:
    reader = csv.reader(f_in)
    with open("midyear_population_5yr_age_sex_utf8.csv", 'w', encoding='utf-8') as f_out:
        writer = csv.writer(f_out)
        for row in reader:
           writer.writerow(row)