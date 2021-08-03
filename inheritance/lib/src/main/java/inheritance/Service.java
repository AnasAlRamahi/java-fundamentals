package inheritance;

import java.util.ArrayList;
import java.util.List;

public abstract class Service{
    private String name;
    private double stars;

    public Service(String name){
        this.name = name;
        this.stars = 0;
    }

    public Service(String name, double stars){
        this.name = name;
        this.stars = stars;
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

    public void setStars(double stars) {
        this.stars = stars;
    }

    public void addReview(Review review){
        if (!reviewsList.contains(review)) {
            reviewsList.add(review);
            this.stars = (this.stars * (reviewsList.size()) + review.getStars())/ (reviewsList.size()+1);
        }
    }
}