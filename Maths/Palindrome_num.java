package Maths;

public class Palindrome_num {
    public static void main(String[] args){
        int n=12321;
        int ans=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            ans=ans*10+digit;
            temp=temp/10;
        }
        if(ans==n){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}
