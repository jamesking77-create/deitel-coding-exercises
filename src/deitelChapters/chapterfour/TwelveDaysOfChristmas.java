package deitelChapters.chapterfour;


import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        String day = "";
        String intro ;
        String outro = ""; 
        StringBuilder returns = new StringBuilder();
        Scanner scanner  = new Scanner (System.in);
        System.out.println("Please enter a day of christmas: ");
        int userInput = scanner.nextInt();
        for (int days = 1; days <= userInput; days++) {
            switch (days) {
                case 1 -> {
                    day = "First day";
                    outro = "A partridge in a pear tree.";

                }
                case 2 -> {
                    day = "Second day";
                    outro = "Two turtle doves.";

                }
                case 3 -> {
                    day = "Third day";
                    outro = "Three french hen.";

                }
                case 4 -> {
                    day = "Fourth day";
                    outro = "Four calling birds. ";

                }
                case 5 -> {
                    day = "Fifth day";
                    outro = "FIVE GOLDEN RINGS!!!";

                }
                case 6 -> {
                    day = "Sixth day";
                    outro = "Six geese a-laying";

                }
                case 7 -> {
                    day = "Seventh day";
                    outro = "Seven swans are swimming";

                }
                case 8 -> {
                    day = "Eight day";
                    outro = "Eight maids are milking";

                }
                case 9 -> {
                    day = " ninth day";
                    outro = "Nine ladies dancing";

                }
                case 10 -> {
                    day = "Tenth day";
                    outro = "Ten lords are leaping";

                }
                case 11 -> {
                    day = " Eleventh day";
                    outro = "Eleven pipers piping";

                }
                case 12 -> {
                    day = "Twelfth day";
                    outro = "Twelve drummer are drumming";
                    }
                default ->
                    System.out.println("You have entered an invalid day of christmas...");
            }
            returns.insert(0, outro + "\n");
            intro = "On the " + day + "day of christmas, my true love sent to me, ";
            System.out.println(intro + "\n" + returns + "\n");
        }
    }
}