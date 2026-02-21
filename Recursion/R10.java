package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class R10 {
     public static void reverseArray(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;
        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }

    //using prebuilt libraray
    public static void reverseArray1(List<Integer> arr) {
        Collections.reverse(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseArray(arr);
        reverseArray1(arr1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

         for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
