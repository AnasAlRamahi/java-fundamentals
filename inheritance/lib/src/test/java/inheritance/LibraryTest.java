/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test.java.inheritance;

import main.java.inheritance.Library;
import main.java.inheritance.Restaurant;
import main.java.inheritance.Review;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void constructorRestaurant() {
        Restaurant res = new Restaurant("PizzaHut", 2, 1);
        assertEquals("PizzaHut", res.getName());
        assertEquals(2, res.getStars());
        assertEquals(1, res.getPriceCategory());
    }

    @Test
    void toStringRestaurant() {
        Restaurant res = new Restaurant("mac", 3, 3);
        String expectedString = "This is a Restaurant instance, with name: mac, stars: 3.0, price category: 3\n";
        assertEquals(expectedString, res.toString());
    }

    @Test
    void constructorReview() {
        Review review = new Review("Delicious meals", "Anas", 4);
        assertEquals("Delicious meals", review.getBody());
        assertEquals("Anas", review.getAuthor());
        assertEquals(4, review.getStars());
    }

    @Test
    void toStringReview() {
        Review review = new Review("The meals taste great", "Saify", 5);
        String expectedString = "Review instance, with body: The meals taste great, author: Saify, stars: 5";
        assertEquals(expectedString, review.toString());
    }

    @Test
    void addReviewInRestaurant() {
        Restaurant res = new Restaurant("mac", 3, 3);
        Review rev1 = new Review("Nice restaurant", "Majd", 4);
        Review rev2 = new Review("Not a bad restaurant", "Saify", 3);
        res.addReview(rev1);
        res.addReview(rev2);
        String expectedString = "This is a Restaurant instance, with name: mac, stars: 3.5, price category: 3\n" +
                "Nice restaurant\n" +
                "Not a bad restaurant\n";
        assertEquals(expectedString, res.toString());
    }

    @Test
    void noDuplicatesWhenAddingReviews() {
        Restaurant res = new Restaurant("BurgerKing", 3, 3);
        Review rev1 = new Review("Great Experience", "Yazan", 5);
        Review rev2 = new Review("TRASHH!!", "Mohammad", 1);
        res.addReview(rev1);
        res.addReview(rev2); //first time adding the second review
        res.addReview(rev2); //inserting the second review again
        res.addReview(rev2); //adding the second review for the third time
        String expectedString = "This is a Restaurant instance, with name: BurgerKing, stars: 3.0, price category: 3\n" +
                "Great Experience\n" +
                "TRASHH!!\n";
        assertEquals(expectedString, res.toString());
    }



}
