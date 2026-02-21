package Recursion;

import java.util.Scanner;

public class R4 {
     public static void reverse(int i, int n){
        if(n == i){
            return;
        }
        System.out.print(n + " ");
        reverse(i, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(0, n);
    }
}
