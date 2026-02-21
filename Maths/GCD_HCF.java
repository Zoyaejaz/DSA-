package Maths;

public class GCD_HCF {
    public static void main(String[] args){
        int a=12;
        int b=15;
        int gcd=1;
        for(int i=1;i<=Math.min(a, b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        //Optimal way
        //Euclidean algorithm gcd(a,b)=gcd(b%a,a) if a>b else gcd(a,b)=gcd(a%b,b)
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
            if(a==0){
                System.out.println(b);
            }
            else if(b==0){
                System.out.println(a);
            }
        }
    }
}
