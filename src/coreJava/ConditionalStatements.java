package coreJava;

public class ConditionalStatements {
    public static void main(String [] args) {


        int a = 100;
        int b = 200;
        int c = 300;

        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }

        // nested if else condition
        //compare 3 numbers

        if(a>b & a>c){
            System.out.println("a is greatest");
        }
        else if(b>c){
            System.out.println("b is greatest");
        }
        else{
            System.out.println("c is greatest");
        }


    }
}
