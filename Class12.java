package CoreJava;

public class Class12 {
    public static void main(String[] args) {
        System.out.println(" hello world");
//        Dipak();
//        Dipak();
//        Kriti();
//int a = 10;
//int b = 30;
//int sum  = a +b;
//System.out.println(sum);
//
//int a1 = 10;
//int b1 = 30;
//int sum1  = a1 +b1;
//System.out.println(sum1);
//
//int  sum2 =  Sum(20,60);
//        System.out.println(sum2);
//
//        System.out.println(Sum(40, 70));
//      Table(15);

      for(char i = 'a'; i <= 'z'; i++){
          System.out.println(i);
      }
      for(char i = 'z'; i >= 'a'; i--){
          System.out.print( i +  " : ") ;
      }
    }
//-------------------------------------------------------------
    public static void Table(int a){
        for(int i = 1; i <= 10; i++){
            System.out.println(a + " * " + i+ " = "+ a*i);
        }
    }

    public  static int Sum(int a , int b){
        return  a+b;
    }

    public static void Dipak(){
        System.out.println("i am Dipak");
    }
    public static void Kriti(){
        System.out.println("i am Kriti");
    }

}
