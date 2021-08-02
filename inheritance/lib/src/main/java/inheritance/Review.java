
package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;
    private String movie;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public Review(String body, String author, int stars, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie = movie;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        if(stars >= 5){
            this.stars = 5;
        }else if(stars <= 0) {
            this.stars = 0;
        }else{
            this.stars = stars;
        }
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String toString(){
        if (this.movie == null)
        return "Review instance, with body: " + this.getBody() + ", author: " + this.getAuthor() + ", stars: " + this.getStars();

        return "Review instance, with body: " + this.getBody() + ", author: " + this.getAuthor() + ", stars: " + this.getStars() + ", and his favourite movie: " + this.getMovie();
    }
}
