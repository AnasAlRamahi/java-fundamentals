
package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Service{
    private int priceCategory;

    public Restaurant(String name, double stars, int priceCategory) {
        super(name, stars);
        this.priceCategory = priceCategory;
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

}
