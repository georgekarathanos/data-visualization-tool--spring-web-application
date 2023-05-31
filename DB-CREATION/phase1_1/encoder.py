import csv
import codecs

with codecs.open('old_countries.csv', encoding='ISO-8859-1') as f_in:
    reader = csv.reader(f_in)
    
    with open('countries.csv', 'w', encoding='utf-8') as f_out:
        writer = csv.writer(f_out)
        for row in reader:
            writer.writerow(row)
