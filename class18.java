package CoreJava;

import java.util.Random;
import java.util.Scanner;

public class class18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(5)+1;
//        System.out.println(num);
//        System.out.println(random);
        System.out.println("Enter your number :  ");
        int userValue = sc.nextInt();
        System.out.println(userValue);

        if (userValue == num){
            System.out.println("Congratulations, you guessed right!");
        } else {
            System.out.println("Sorry, you guessed wrong. The correct number was " + num);
        }
    }
}
