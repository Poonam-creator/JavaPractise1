package interviewQuetions;

public class LargestAndSmallestNumber {
    public static void main(String args[]){
        int numbers[]={-10,24,-88,3565};

        int largestnum = numbers[0];
        int smallestnum = numbers[0];

        for(int i =1 ; i<numbers.length ; i++){
            if(numbers[i] > largestnum){
                largestnum = numbers[i];
            }
            else if (numbers[i] < smallestnum){
                smallestnum = numbers[i];
            }
        }
        System.out.println("largestnum is ::" + largestnum);
        System.out.println("smallestnum is ::" + smallestnum);

    }
}
