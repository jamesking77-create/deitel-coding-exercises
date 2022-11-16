package afterClassPractice;
import java.util.Scanner;



public class TipCac {
    int count = 0;
    private String chicken;
    private String chips;
    private String pizza;
    private String smoothie;
    private String milkShake;
    private String beef;

    public static void main(String[] args) {

        System.out.println("!!!WELCOME TO FOOD HUB!!!");
        Scanner input = new Scanner(System.in);
        int count = 1;
        String chi = "chicken";
        String ch = "chips";
        String pi = "pizza";
        String sh = "smoothie";
        String ms = "milk shake";
        String bf = "beef";
        String y = "yes";
        String n = "no";
        int min = 1000;
        int mid = 3000;
        int max = 6000;
        int mx = 0;
        while (count <= 5) {
            System.out.print("""
                    please what would you like to order from us today, we have: \s
                    chicken
                    chips
                    pizza
                    smoothie
                    milk shake
                    beef:\s""");
            String order = input.nextLine();
            count ++;
            if (order.equals(chi) || order.equals(ch) || order.equals(pi) || order.equals(ms) || order.equals(bf) || order.equals(sh)) {
                System.out.println(order + " Available!!! " + " how much " + order + " would you like to have? " + max + ", " + mid + ", " + min);
                max = input.nextInt();
            } else if (max == max) {
                System.out.println(" Anything else you like to have? ");
            }
            if (order.equals(n)) {
                System.out.print("would you like to tip our service? ");
            } else if (order.equals(y)) {
            }
        }
    }
}




