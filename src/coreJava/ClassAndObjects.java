package coreJava;

public class ClassAndObjects {
    //global variables or class variables
    // to access global variable we need to create object

    int a;
    int b;

    public static void main(String args[]){
        ClassAndObjects ob = new ClassAndObjects();

        ob.a=10;  //initialise global variable
        ob.b=20;
        System.out.println(ob.a);
    }
}
