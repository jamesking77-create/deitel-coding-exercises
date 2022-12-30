package deitelChapters.chapterfour;

import java.util.Scanner;


//CODE NOT FINISHED...............



class ReturnNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double userInput = input.nextInt();
        double i;
        int c;
        double sum = 0;
        int sum2 = 0;
        int denominator = 1;
        int numerator = 0;
        for(i = 1; i <= userInput; i++) {
            double fraction = 1 / i;
            sum += fraction;
            denominator+= i;
        }
        System.out.println(sum);
        for(c = 1; c <= userInput; c++){
            sum2 +=c;
        numerator +=sum2/sum;
        }
        System.out.println(numerator + " / " + denominator);
    }

}
