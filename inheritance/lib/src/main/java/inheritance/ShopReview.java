package inheritance;

public class ShopReview extends Review{

    public ShopReview(String body, String author, int stars){
        super(body, author, stars);
    }

    public String toString(){
        return "Shop Review instance, with body: " + this.getBody() + ", author: " + this.getAuthor() + ", stars: " + this.getStars();
    }


}
