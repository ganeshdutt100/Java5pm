package CoreJava;

import java.util.Scanner;

public class Class14 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter your first number :  ");
        int first = scanner.nextInt();
        System.out.println("Enter your last number :  ");
        int last = scanner.nextInt();
        useLoop(first, last);
    }
    public  static void useLoop(int value1, int value2){
        for(int i = value1; i <= value2; i++){
            System.out.print(i + "  ");
        }
    }
}
