import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(1);

        clock();

    }

    public static String pluralize(String word, int number){
        if (number == 0 || number>1){
            return word+"s";
        }
        else return word;
    }

    public static void flipNHeads(int n){
        int flips =0;
        String flipResult = "";
        int success = 0;
        while( success != n ){
            double randomNumber = Math.random();
            if (randomNumber >= 0.5){
                flipResult = "heads";
                success++;
                System.out.println(flipResult);
            }
            else {
                flipResult = "tails";
                success = 0;
                System.out.println(flipResult);
            }
            flips++;
        }
        System.out.println("It took " + flips + " flips to flip " + n + " head in a row.");
    }

    public static void clock(){
        while(true){
            LocalDateTime dateTime = LocalDateTime.now();
            String formatDateTime = dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(formatDateTime);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }

}