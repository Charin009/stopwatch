# Stopwatch tasks by Charin Tantrakul
I ran the tasks on a MacBook Pro, and got
these results:
|Task                                                     | Time           |
|:--------------------------------------------------------|---------------:|
|Append  50,000 chars to String                           |0.946590 seconds|
|Append 100,000 chars to String                           |1.927139 seconds|
|Append 100,000 chars to StringBuilder                    |0.001914 seconds|
|Sum array of double primitives with count=1,000,000,000  |1.343417 seconds|
|Sum array of Double object with count=1,000,000,000      |3.805863 seconds|
|Sum array of BigDecimal  with count=1,000,000,000        |8.050478 seconds|
## Explanation of Results
I have no idea why the times are different
