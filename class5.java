package CoreJava;

import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Ending number: ");
//        int a = sc.nextInt();
//        System.out.println("Enter your Name:  ");
//        String nameValue  =  sc.next();
//
//        for(int i =  0; i <= a; i++ ){
//            System.out.println(  nameValue);
//        }
        System.out.println("Enter your starting Number  :");
        int start = sc.nextInt();
        System.out.println("Enter your Ending Number  :");
        int end = sc.nextInt();

        System.out.println("Enter your table : ");
        int table = sc.nextInt();
        for(int i = start; i <= end; i++){
            System.out.println(table + " * " +  i+ " = "+ table *  i);
        }

    }
}

//2*1=2
//2*2=4