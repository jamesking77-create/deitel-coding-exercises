package assignments;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CheckoutTest {
    public static void main(String[] args) throws InterruptedException {
        double VAT = 17.50;

        Scanner scanner  = new Scanner(System.in);
        ArrayList<String> item = new ArrayList<>();
        ArrayList <Integer>  quantity = new ArrayList<>();
        ArrayList <Double>  price = new ArrayList<>();

        System.out.println("what is the customer's name: ");
        String userInput = scanner.nextLine();

        System.out.println("What did the customer buy: ");
        String userInput1 = scanner.nextLine();
        item.add(userInput1);
        System.out.println("how many pieces: ");
        int userInput2 = scanner.nextInt();
        quantity.add(userInput2);
        System.out.println("how much per unit: ");
        double userInput3 = scanner.nextInt();
        price.add(userInput3);
        System.out.println("Add more item? ");
       String userInput4 = scanner.next();
        while (!userInput4.equals("yes") && !userInput4.equals("no")){
            System.err.println("invalid response!!!");
            System.out.println("Add more item? ");
            userInput4 = scanner.next();
        }

       while (!userInput4.equals("no")){
                System.out.println("What did the customer buy: ");
                item.add(scanner.next());
                System.out.println("how many pieces: ");
                 userInput2 = scanner.nextInt();
                quantity.add(userInput2);
                System.out.println("how much per unit: ");
                userInput3 = scanner.nextInt();
                price.add(userInput3);
                System.out.println("Add more item? ");
                userInput4 = scanner.next();
                while (!userInput4.equals("yes") && !userInput4.equals("no")){
                    System.err.println("invalid response!!!");
                    System.out.println("Add more item? ");
                    userInput4 = scanner.next();
                }
        }

        System.out.println("what is your name: ");
        String userInput5 = scanner.next();
        System.out.println("how much discount will the customer get: ");
        double discount = scanner.nextDouble();

        System.out.print("Preparing the pay slip");
        for (int count = 0; count < 3 ; count++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println();
        System.out.println(  );
        Checkout checkout = new Checkout("SEMICOLON VENTURES");
        checkout.displayInput(userInput5, userInput, item, quantity, price, discount, VAT);
        System.out.println();
        System.out.println(" how much did the customer give to you? ");
        double userPay = scanner.nextDouble();
        System.out.print("Preparing Your Receipt");
        for (int count = 0; count < 3 ; count++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println();
        checkout.displayReceipt(userInput5, userInput, item, quantity, price, discount, VAT, userPay);

        

    }
}
