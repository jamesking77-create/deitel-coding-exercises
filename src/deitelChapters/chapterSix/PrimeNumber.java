package deitelChapters.chapterSix;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        primeNumber(2);
    }
    public static void primeNumber(int userInput){
        int prime = 0;
        for ( int  count = 1; count <=userInput; count++){
            if(userInput % count == 0  ){
                prime++;
            }
        }if (prime == 2){
            System.out.println( userInput + " is a prime number");
        }else{
            System.out.println(userInput + " is not prime number");}

    }}
