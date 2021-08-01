## Lab06: Inheritance and Interfaces

### Architecture:
The architecture of this application was built using Gradle version 7.1.1 .
##### In the src/main/java/inheritance package we have 3 classes:
+ Library (has the main method).
+ Restaurant.
+ Review

##### In the src/test/java/inheritance package we have the test file:
The testing file has the following testing methods:
1. constructorRestaurant: tests if the restaurant class' constructor is instantiating correctly.
2. toStringRestaurant: tests if the restaurant class' toString method is returning correctly.
3. constructorReview: tests if the review class' constructor is instantiating correctly.
4. toStringReview: tests if the review class' toString method is returning correctly.
5. addReviewInRestaurant: tests if the adding reviews into a restaurant instance is working and returns the right String value.
6. noDuplicatesWhenAddingReviews: tests if adding reviews into a restaurant instance multiple times affects the restaurant's stars or not.

