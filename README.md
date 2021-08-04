# java-fundamentals
*This repo was made by Anas Al-Ramahi, and it was dedicated to solve the first 10 labs of the 401 course at Luminos-ASAC in Jordan.
This repo was made in Java, and I also used gradle to make the project structure.*

## Labs:
### Lab01 which includes the following methods:
+ Pluralize.
+ Flipping Coins.
+ Command Line Clock.


### Lab02 which includes the following methods:
+ Rolling Dice.
+ Contains Duplicates.
+ Calculating Averages.
+ Arrays of Arrays.


### Lab03 which includes the following methods:
+ Analyzing Weather Data.
+ Tallying Election.
+ File I/O.
+ In addition to a test for each method in the testing file.


### Lab06 functionality:
Has a class restaurant that (has a) review class inside of it in a composition relation.
+ Restaurants can be reviewed and saves the review in as list inside it
+ Reviews include a body, author name and a star rating.


### Lab07 functionality:
Has a service abstract class that is the parent for Restaurant, Shop and Theater. 

    Service|abstract <-  Restaurant|class, Shop|class, Theater|class

+ Each can be reviewed and saves the review in as list inside it. Theater reviews can have a favourite movie name if the user wanted to.

  
    Restaurant|class (has a) Review , Shop|class (has a) Review , Theater|class (has a) Review

+ Reviews include a body, author name and a star rating.

+ Theater has a list of movies available saved in a list.



## Setup:
1. $cd to the directory that has the java files.
2. In the terminal, run $javac directoryName(e.g inheritance)/*.java
3. run the command $java directoryName(e.g inheritance).MainClass(e.g Library)
**And the output will be shown in the terminal.**
   
## To test the code:
+ In the project directory in the terminal, use the command $./gradlew test
+ It should test the code and give you a build successful if everything tested right.

