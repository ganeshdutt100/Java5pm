package CoreJava;

public class Class10 {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 30;
//        int output  = (a > b )?a:b;
//        System.out.println(output );
        int a[] = {10,23,31,32,33,34,35,36,37,38};
        System.out.println(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "  ");
        }
        for(int x : a){
            System.out.print(x + "  ");
        }
    }
}
