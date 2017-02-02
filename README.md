# Stopwatch tasks by Charin Tantrakul
I ran the tasks on a MacBook Pro, and got these results:

|Task                                                     | Time           |
|:--------------------------------------------------------|---------------:|
|Append  50,000 chars to String                           |0.946590 seconds|
|Append 100,000 chars to String                           |1.927139 seconds|
|Append 100,000 chars to StringBuilder                    |0.001914 seconds|
|Sum array of double primitives with count=1,000,000,000  |1.343417 seconds|
|Sum array of Double object with count=1,000,000,000      |3.805863 seconds|
|Sum array of BigDecimal  with count=1,000,000,000        |8.050478 seconds|

## Explanation of Results
#### 1.Why dose appending 100,000 chars to String take more than 2X the time to append 50,000 chars?
  
   #####Ans Because 100,000 is twice of 500,000 that mean appending 100,000 will take a long time than appending 500,00 too.
 
#### 2.Why is there such a big difference in the time used to append chars to a String and to a StringBuilder?
  
   #####Ans Because StringBuilder when appending StringBuilder will append to object directly by '.append' 
  
   #####but in String will use '+' to appending that mean String must create new object to append.
 
#### 3.Why is there a significant difference in times to sum double, Double, and BigDecimal values?
   
   #####Ans Because doulbe is primitive calculation can calculate directly but Double and BigDemical are object
   
   #####that mean Double and BigDecimal call method before calculation. 
