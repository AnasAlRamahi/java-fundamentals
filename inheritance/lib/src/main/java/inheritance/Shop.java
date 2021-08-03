package inheritance;

public class Shop extends Service{
    private String description;
    private int numDollarSigns;

    public Shop(String name, String description, int numDollarSigns) {
        super(name);
        this.description = description;
        this.setNumDollarSigns(numDollarSigns);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumDollarSigns() {
        return numDollarSigns;
    }

    public void setNumDollarSigns(int numDollarSigns) {
        if(numDollarSigns >= 5){
            this.numDollarSigns = 5;
        }else if(numDollarSigns <= 0 ){
            this.numDollarSigns = 0;
        }else {
            this.numDollarSigns = numDollarSigns;
        }
    }

    public String toString(){
        String content = "This is a Shop instance, with name: " + this.getName() + ", description: " + this.getDescription() + ", number of dollar signs: " + this.getNumDollarSigns();
        for (Review review : reviewsList) {
            content +=  "\n" + review;
        }
        return  content;
    }

    public void addReview(Review review){
        if (!reviewsList.contains(review)) {
            reviewsList.add(review);
            this.setStars((this.getStars() * (reviewsList.size()-1) + review.getStars())/ (reviewsList.size()));
        }
    }

}