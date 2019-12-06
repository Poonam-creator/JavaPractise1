package interviewQuetions;

public class RemoveJunkFromString {

    public static void main(String args[]){

        String s = "@$&%$#@ testing @$#%&* 123";
        s = s.replaceAll("[^a-zA-z0-9]","");
        System.out.println(s);
    }
}
