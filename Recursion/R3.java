package Recursion;

import java.util.Scanner;

public class R3 {
    public static void number(int i, int n){
        if(i > n){
            return;
        }
        System.out.print(i + " ");
        number(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        number(0, n);
    }
}
