package Linked_List;

import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data1, Node next){  // This is constructor
        this.data = data1;
        this.next = next;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class Intro{
    public static void main(String[] args){
        int[] arr = {2, 5, 6, 8};
        Node y = new Node(arr[0]);
        System.out.println(y.data);
    }
}
