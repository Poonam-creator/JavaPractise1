package coreJava;

public class Arrays {
    public static void main(String args []){
       //ststic array where size is fixed.
        //if array size is 3 we can assign only 3 values
        // store only similar data type values
        // to overcome this problem we use object array and collections(dynamic array)
        // Object is super class of all the classes

        int a [] = new int[3];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        System.out.println(a[1]);

       // to get the size of array
        System.out.println(a.length);

        //to print array use for loop
        for (int i =0 ;i<a.length; i++){
            System.out.println(a[i]);
        }


        //Double array
        double d []= new double[3];

        d [0] = 12.33;
        d [1] = 13.44;
        d [2] = 14.55;

        System.out.println(d[1]);

        //boolean array
        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        System.out.println(b[1]);

        //String array
        String s[] = new String[2];
        s[0] = "pari";
        s[1] = "yuvi";

        System.out.println(s[1]);


        //object array use to store different data type
        Object ob [] = new Object[6];
        ob[0] = "naveen";
        ob[1] = 30;
        ob[2] =  12.33;
        ob[3] =  6/4/1990;
        ob[4] = 'm';
        ob[5] = "London";

        System.out.println(ob [5]);


        int v[] = {1,2,3,4,5,6};
        for( int k=0; k<v.length;k++){
            System.out.println(v[k]);
        }
    }
}
