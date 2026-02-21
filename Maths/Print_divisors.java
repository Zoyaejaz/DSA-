package Maths;

public class Print_divisors {
    public static void main(String[] args){
        int n=15;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
