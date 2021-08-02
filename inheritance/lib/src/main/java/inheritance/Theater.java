package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Service {

    private String name;
    private double stars;
    private ArrayList<String> movies;

    public Theater(String name, ArrayList<String> movies) {
        super(name);
        this.movies = movies;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public String toString() {
        String content = "This is a Theater instance, with name: " + this.getName() + ", with these movies:\n";
        for (String movie : movies) {
            content += movie + "\n";
        }
        return content;
    }

    public void addReview(Review review) {
        if (!reviewsList.contains(review)) {
            reviewsList.add(review);
            this.setStars((this.getStars() * (reviewsList.size() - 1) + review.getStars()) / (reviewsList.size()));
        }
    }

    public void addMovie(String movie){
        if(!this.movies.contains(movie))
            this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }

}