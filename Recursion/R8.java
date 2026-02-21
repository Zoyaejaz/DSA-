package Recursion;

public class R8 {
    public static int add(int n){
        if(n == 0){
            return 0;
        }
        return n + add(n-1);
    }
    public static void main(String[] args) {
        System.out.println(add(3));
    }
}
