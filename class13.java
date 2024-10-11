package CoreJava;

import java.util.Scanner;

public class class13 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("What is your name ");
        String userName =  scanner.nextLine();
        System.out.println("What is your Friend first name  ");
        String Friend1 =  scanner.nextLine();
        System.out.println("What is your Second friend name  ");
        String Friend2 =  scanner.nextLine();
//      fun();
        namePrinter(userName);
        namePrinter(Friend1);
        namePrinter(Friend2);
    }
    public static void fun(){
        System.out.println("This is my first method");
    }

    public static void namePrinter(String str){
        System.out.println("My name is : "+ str);
    }


}
