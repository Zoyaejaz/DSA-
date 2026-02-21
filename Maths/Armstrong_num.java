package Maths;

public class Armstrong_num {
    public static void main(String[] args){
        //Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
        int n=153;
        int ans=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            ans=ans+(digit*digit*digit);
            temp=temp/10;
        }
        if(ans==n){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
