package CoreJava;

import java.util.Scanner;

public class Class17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your first value :  ");
//        int a = scanner.nextInt();
//
//        System.out.println("Enter your second value :  ");
//        int b = scanner.nextInt();
        class16 surya = new class16();
        surya.m1();
        surya.m3();

//       int result =  surya.sum(a,b);
//        System.out.println(result);

        System.out.println("sum a+b :  "+ surya.sum(12,56));
        System.out.println("sum a+b+c+d :  "+ surya.sum(12,56,89,34));
    }
}
