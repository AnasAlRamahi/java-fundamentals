package main.java.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private double stars;
    private int priceCategory;

    public Restaurant(String name, double stars, int priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }
    List<Review> reviewsList = new ArrayList<Review>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String toString(){
        String content = "This is a Restaurant instance, with name: " + this.getName() + ", stars: " + this.getStars() + ", price category: " + this.getPriceCategory() + "\n";
        for (Review review : reviewsList) {
            content = content + review.getBody() +"\n";
        }
        return  content;
    }

    public void addReview(Review review){
        if (!reviewsList.contains(review)) {
            reviewsList.add(review);
            this.stars = (this.stars * (reviewsList.size()-1) + review.getStars())/ reviewsList.size();
        }
    }
}
