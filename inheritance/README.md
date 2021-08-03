## Lab06: Inheritance and Interfaces

### Architecture:
The architecture of this application was built using Gradle version 7.1.1 .
##### In the src/main/java/inheritance package we have 3 classes:
+ Library (has the main method).
+ Restaurant.
+ Review


## Lab07: Inheritance and Interfaces part 2

### Architecture:
Has a class restaurant that (has a) review class inside of it compositioned.
+ Restaurants can be reviewed and saves the review in as list inside it
+ Reviews include a body, author name and a star rating.

##### In the src/main/java/inheritance package we have 3 classes:
+ Library (has the main method).
+ Restaurant.
+ Review.
+ Service (abstract).
+ Shop.
+ Theater.

### Overview:
Has a service abstract class that is the parent for Restaurant, Shop and Theater.

    Service|abstract <-  Restaurant|class, Shop|class, Theater|class

+ Each can be reviewed and saves the review in as list inside it. Theater reviews can have a favourite movie name if the user wanted to.


    Restaurant|class (has a) Review , Shop|class (has a) Review , Theater|class (has a) Review

+ Reviews include a body, author name and a star rating.

+ Theater has a list of movies available saved in a list.

