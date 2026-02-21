package Maths;

public class Reverse_num {
    public static void main(String[] args){
        int n=12345;
        int ans=0;
        while(n>0){
            int digit=n%10;
            ans=ans*10+digit;
            n=n/10;
        }
        System.out.println(ans);
    }
}
