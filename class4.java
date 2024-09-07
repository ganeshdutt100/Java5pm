package CoreJava;

import java.util.Scanner;

public class class4 {
    public static void main(String[] args) {


//        String output  = "out";
//
////        System.out.println("Hello, World!");
//        int a = 5;
//        String name = "Mannu";
//        System.out.println(name);
//        name = "Nikhil";
////        a = 40;
//        if(name ==  "Mannu"){
//            output = "in";
//        }
//        else if()
//        else{
////            System.out.println("out");
//            output = "out";
//        }
//        System.out.println(output); // Output: 40
//        int studentMakes  = 70;
//        if(studentMakes >= 90){
//            System.out.println("first ");
//        }
//        else if(studentMakes >= 50){
//            System.out.println("first ");
//        }
//        String result ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your time :  ");
        double time  = sc.nextDouble();
        if(time >= 4 && time < 12){
//            result = "Morning";
            System.out.println("Morning");
        }
        else if(time >= 12 && time < 16){
//            result = "Morning";
            System.out.println("noon");
        }
        else if(time >= 16 && time < 22){
//            result = "Morning";
            System.out.println("Good Evening");
        }
        else{
            System.out.println("Good Night💤💤");
        }
    }
}
