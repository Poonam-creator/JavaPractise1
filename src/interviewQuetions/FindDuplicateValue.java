package interviewQuetions;

public class FindDuplicateValue {
    public static void main(String ars []){
        String name[] = {"java","c#","c","selenium","api","c","java"};

        for(int i=0 ; i<name.length ;i++){
            for (int j= i+1 ;j<name.length ;j++){
                if(name[i].equals(name[j])){
                    System.out.println("duplicate value is :::"+name[i]);
                }
            }
        }
    }
}
