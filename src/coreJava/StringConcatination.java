package coreJava;

public class StringConcatination {
    public static void main(String args[]){

        int a = 100;
        int b = 200;

        String x = "Welcome";
        String y = "Java";

        System.out.println(a+b);
        System.out.println(x+y);
        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));

    }
}
