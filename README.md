# Data Visualization tool with Spring boot
This is a web application where general metrics about countries can be visualized via timeseries-barcharts. There is a demo-video where you can see the application in use. The demo has the following 3 parts: <br />
-> Part 1 link: https://www.youtube.com/watch?v=jChL96myLPo<br />
-> Part 2 link: https://www.youtube.com/watch?v=cp0lEBBz5n4<br />
-> Part 3 link: https://www.youtube.com/watch?v=rBXYaeu-NAQ<br />
<br />Authors: George Karathanos & Stelios Syrros

#### How to set up the database - Full explanation in the report
1) Download the DB-CREATION folder. Open phase1_1. Run the encoder.py and then the add_osi.py scripts. As a result new csv files are created in the subfolder mid_files (already happened).<br /><br />
2) Open mid_files folder. Execute the pivot.py and after that the filter.py script. As a result new csv files are created in the subfolder final_files (already happened).  <br /><br />
3) Open final_files folder. Execute the null.py script (already happened).  <br /><br />
4) Go back and open phase2_1 folder. Execute the makeCSV.py script for each existing csv in this folder by changing the path where is necessary in the code (instructions with comments).  As a result new csv files will be created and you need to put them in the phase2_2 folder.<br /><br />
5) Go back and open phase2_2 folder. Execute the map_data.py script. The result will be some csv files that you need to put in the phase2_3 folder.<br /><br />
6) Go back and open tables creation folder. After creating a database of your own connect to it and execute all the sql scripts that are in there. After that in your database you will have empty tables.<br /><br />
7) Look the chapter 'ETL' of the report to see in which order you need to execute the sql scripts from 'phase1_2' and 'phase2_3' folders in order to fill your empty tables of the database. After you have executed these scripts the database setup is over.
8) Download the management project and import it to your IDE as a maven project. Change the properties file with your database information (password for example).
9) You are ready to go!! Execute the app and navigate it via a browser.
