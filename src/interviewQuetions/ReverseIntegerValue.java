package interviewQuetions;

public class ReverseIntegerValue {

    public static void main(String args []){
        int num = 12345;
        int rev = 0;

        while (num != 0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }

        System.out.println(rev);

        //2nd approch
        long num1 = 1234567890;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }


}
