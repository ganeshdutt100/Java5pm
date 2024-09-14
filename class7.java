package CoreJava;


import java.util.Scanner;

public class class7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Loop");
      int table = sc.nextInt();
        for(int i =1; i <=10; i++){
            System.out.println(table  +  " * "+ i + " = "+  i * table);
        }
//        int a = 10;
//        while(a <=10){
//            System.out.println(a);
//            a++;
//        }




    }
}

//++i

//5 *1 = 5
//5 *2 = 10