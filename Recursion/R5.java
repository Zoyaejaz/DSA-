package Recursion;

import java.util.Scanner;

public class R5 {
    public static void print(int i, int n) {
        if (i > n) {
            return;
        }
        print(i + 1, n);   // recursive call first
        System.out.println(i); // print during backtracking
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, n);
    }
}
