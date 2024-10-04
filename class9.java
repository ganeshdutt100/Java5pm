package CoreJava;

public class class9 {
    public static void main(String[] args) {
        System.out.println("i am Dutt");

        int number = 12;
        System.out.println(number);


        char c ='n';
        System.out.println(c);



        String str = "Hello world";
        System.out.println(str);

//        int a = 10;
        int b = 5;
//          a = a+b;

//  int kriti = 100;
//  int dipak = 20;
//         kriti = kriti + dipak;

//         kriti*=dipak;
//        System.out.println(kriti);


//        int dipak = 50;
//     boolean Ganesh  = (kriti > dipak)?true:false;
//        System.out.println(Ganesh );
        int kriti = 10;
        if(kriti  >=30  && kriti < 60){
            System.out.println("Pass");
        }
        else if(kriti >= 60 && kriti < 80){
            System.out.println("second");
        }
        else if (kriti >= 80 && kriti <=  100){
            System.out.println("first ");
        }
        else{
            System.out.println("fail");
        }
        int aa = 90;
        int bb = 10;
        if(aa >=20){
            System.out.println(aa);
            if(bb >= 20){
                System.out.println(bb);
            }
            else{
                System.out.println("error2");
            }

        }
        else{
            System.out.println("error1");
        }






//        (conditon)?"true":"false";

//  false = 0 true = 1
//     0 | 0 = 0
//     0 | 0 = 0
//      0|1 = 0
//      0|1 = 0
//      1|1 = 1
//      1|1 = 1
//      1|0 = 0
//      1|0 = 0
//  int i = 10;
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        int a = 1;
        while(a<=10){
            System.out.println(a);
            a++;
        }

        int c1 = 20;
        do{
            System.out.println(c1);
            c1++;
        }while(c1<=10);

        System.out.println("ARRAY");
         int arr[] = {1,2,3,4,5,6,7,8};
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]  + " ");
//         }
        for(int x : arr){
            System.out.println(x);
        }


    }
}
