package OopsConceptPart1;

public class MethodsOrFunctions {
    // Non static methods
    //we can not create method inside method all method should be created outside main method.
    //Functions and methods both are same
    // 3 Types of User define Methods
    //  1.No inpute no output
    // 2.No in put getting out put
    // 3.some in put and getting out put

    // void method, void means it does not return any value
    public void abc(){
        System.out.println("abc method");
    }

    // method with return value , no in put some out put
    // return type is int
    public int pqr(){
        System.out.println("pqr method");
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

    // return type String
    public String asd(){
        String s = "Selenium";
        return s;
    }

    // method with parameter or argument,
    public int div(int x ,int y){
        int d= x/y;
        return d;
    }

    // main method is starting point of execution
    public static void main(String []args){
        MethodsOrFunctions obj = new MethodsOrFunctions();

        obj.abc();

        int l = obj.pqr();
        System.out.println(l);

        String g =obj.asd();
        System.out.println(g);

        int b= obj.div(10,5);
        System.out.println(b);
    }
}
