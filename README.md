# data-visualization-tool--spring-web-application
This is a web application where general metrics about countries can be visualized via timeseries-barcharts. There is a demo-video in this repository where you can see the application in use.

#### How to set up the database - Full explanation in the report
1) Download the DB-CREATION folder. Open phase1_1. Run the encoder.py and then the add_osi.py scripts. As a result new csv files are created in the subfolder mid_files (already happened).<br /><br />
2) Open mid_files folder. Execute the pivot.py and after that the filter.py script. As a result new csv files are created in the subfolder final_files (already happened).  <br /><br />
3) Open final_files folder. Execute the null.py script (already happened).  <br /><br />
4) In order to run the this web application:<br />  i) Download the source code from this repository.<br />   ii) Open Eclipse or InteliJ (InteliJ is prefered becouse in Eclipse you will
probably need extra configuration).<br />  iii) Import 'inforet' folder as a Maven project.<br />  iv) Run the sql script you will find under the recourses/DDL folder in order to create the
necessary table to your database.<br />   v) Change username/password from properties file to your MySQL account information.<br /> vi) Download glove.6B.zip from https://nlp.stanford.edu/projects/glove/ and put glove.6B.50d pretrained model under the recourses/DDL folder.<br />  vii) Execute the filter.py programm under the recourses/DDL folder and now you have your model with word2vec ready.<br /> viii) You are good to go! Fill the comments of the code with your paths, execute the programm and go to localhost to navigate the application.
