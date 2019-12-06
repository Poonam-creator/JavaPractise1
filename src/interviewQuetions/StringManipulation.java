package interviewQuetions;

public class StringManipulation {
    public static void main(String args []) {
        String str = "The rains starts here selenium";
        String str1 = "The rains starts here selenium";

        System.out.println(str.equals(str1));

        System.out.println(str.substring(0,9));
        System.out.println(str.length());

        System.out.println(str.indexOf("here"));
        System.out.println(str.indexOf("t"));
        System.out.println(str.charAt(10));
        System.out.println(str.indexOf("s",str.indexOf("s",str.indexOf("s")+1)));

        String s = "hello world";
        System.out.println(s.replace(" ",""));

        String t = "10/2/1980";
        System.out.println(t.replace("/","-"));

        String test = "hello_selenium_world";
        String testval []= test.split("_");
        for(int i=0 ; i<testval.length ; i++){
            System.out.println(testval[i]);
        }

    }
}
