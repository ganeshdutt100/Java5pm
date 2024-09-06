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
        if( a <= 20){
            System.out.println("Data is Matched");
        }
        else{
            System.out.println("Data is not  Matched");

        }
    }

}
