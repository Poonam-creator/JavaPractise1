package interviewQuetions;

public class SwapTwoIntegersWithoutUsingThirdVariable {
    public static void main(String args []) {

        int x = 10;
        int y = 20;

        //1 using third variable
     /*   int t;
        t = x;
        x = y;
        y = t;*/

        // 2nd method
      /*  x= x +y;
        y= x -y;
        x= x- y; */

      // using 3 menthod

        x = x*y;
        y = x/y;
        x = x/y;

        System.out.println(x);
        System.out.println(y);
    }
}
