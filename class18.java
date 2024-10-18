package CoreJava;

import java.util.Random;
import java.util.Scanner;

public class class18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(5)+1;
        int userGuess = 0;
        int attempt = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 5.");

        while (userGuess!=randomNumber){
            System.out.println("Enter your Guess Number : ");
            userGuess   = sc.nextInt();
            attempt++;


            if (userGuess < randomNumber){
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber){
                System.out.println("Too high! Try again.");
            }
            else{
                System.out.println("Congratulations! You guessed right!");
                System.out.println("It took you " + attempt + " attempts.");
                break;
            }
        }












//        System.out.println(num);
//        System.out.println(random);
//        System.out.println("Enter your number :  ");
//        int userValue = sc.nextInt();
//        System.out.println(userValue);
//
//        if (userValue == num){
//            System.out.println("Congratulations, you guessed right!");
//        } else {
//            System.out.println("Sorry, you guessed wrong. The correct number was " + num);
//        }
    }
}
