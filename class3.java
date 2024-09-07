package CoreJava;

import java.util.Scanner;

public class class3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 //        String a = "hello";
//        System.out.println( a + " world");
//        System.out.println("Enter your value");
//        int a = sc.nextInt();
//        if( a >= 60){
//            System.out.println("first");
//        }
//        else if( a >= 40){
//            System.out.println("second");
//        }
//        else if( a >= 30){
//            System.out.println("third");
//        }
//        else{
//            System.out.println("error");
//        }


        System.out.println("Enter your value : ");
        int a = sc.nextInt();
        if(a==1){
            System.out.println("Mon");
        }
        else if(a==2) {
            System.out.println("Tue");
        }
        else if(a==3) {
            System.out.println("Wed");
        }
        else if(a==4) {
            System.out.println("Thurs");
        }
        else if(a==5) {
            System.out.println("Fri");
        }
        else if(a==6) {
            System.out.println("Sat");
        }
        else if(a == 7){
            System.out.println("Sun");
        }
        else{
            System.out.println("Invalid weekday");
        }
    }
    }


//(con)?true:false;