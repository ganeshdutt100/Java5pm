package CoreJava;

import java.util.Scanner;

public class class3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String a = "hello";
//
//        System.out.println( a + " world");
        System.out.println("Enter your value");
        int a = sc.nextInt();
        if( a >= 60){
            System.out.println("first");
        }
        else if( a >= 40){
            System.out.println("second");
        }
        else if( a >= 30){
            System.out.println("third");
        }
        else{
            System.out.println("error");

        }
    }

}
