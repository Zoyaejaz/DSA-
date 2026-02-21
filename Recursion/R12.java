package Recursion;

public class R12 {
     public static int Fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int last = Fibonacci(n-1);
        int slast  = Fibonacci(n-2);
        return last + slast;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(12));
    }
}
