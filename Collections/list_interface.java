import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class list_interface{
    public static void main(String[] args){
        //here the implementation is arraylist and reference is arraylist
        ArrayList<Integer> list=new ArrayList<>();
        //or we can write it as
        //here the implementation is arraylist and reference is list 
        List<Integer> list1=new ArrayList<>();
        //or we can write it as
        // here the implementation is arraylist and reference is collection
        Collection<Integer> list2=new ArrayList<>();

       //add
       list.add(10);
       list.add(30);
       list.add(50);
       System.out.println(list);
        list.add(80);
        list.remove(0);
        System.out.println(list);

        list1.add(100);
        list1.add(300);
        list1.addAll(list);
        System.out.println(list1);

        System.out.println(list1.size());
        list1.removeAll(list);
        System.out.println(list1);
        list.clear();
        System.out.println(list);
        System.out.println(list.size());


        //I want to traverse list using iterator
        Iterator<Integer> iterator=list1.iterator();  //iterator() is a method which is used to traverse the list
        while(iterator.hasNext()){  //hasNext() is a method which is used to check if there is next element in the list or not. if the next element is present it will go inside the loop and if not it will come out of the loop
            System.out.println("Element: "+iterator.next());
        }

        //list interface

        List<Integer> nayalist=new ArrayList<>();
        nayalist.add(11);
        nayalist.add(12);
        nayalist.add(13);
        System.out.println(nayalist.get(2));
        System.out.println("Before set: "+nayalist);
        nayalist.set(0,100);
        System.out.println("After set: "+nayalist);




        //toArray() method is used to convert the list into an array
        Object[] arr=nayalist.toArray();
        for(Object o:arr){
            System.out.println(o);
        }

        //contains() method is used to check if the list contains a specific element or not
        System.out.println(nayalist.contains(12));

        //sort() method is used to sort the list
        Collections.sort(nayalist);
        System.out.println("Sorted list: "+nayalist);


        //reverseOrder() method is used to sort list in a descending order
        Collections.sort(nayalist,Collections.reverseOrder());
        System.out.println("Sorted list in descending order: "+nayalist);



        //Linkedlist

        //what methods we have learned in the arraylist, can also work for the linkedlist.only the clone() method is not present in the linkedlist. rest all methods are same for both arraylist and linkedlist.

        LinkedList<Integer> link=new LinkedList<>();
        link.add(2);
        link.add(4);
        link.add(10);
        link.add(2);
        link.add(3);
        link.add(2);
        link.add(5);
        System.out.println(link.lastIndexOf(2));  //lastIndexOf() method is used to find the last index of a specific element in the list


        //addFirst 
        System.out.println(link);
        link.addFirst(100);
        System.out.println(link);

        //addLast
        link.addLast(200);
        System.out.println(link);
        
        //removeFirst
        link.removeFirst();
        System.out.println(link);

        //removeLast
        link.removeLast();
        System.out.println(link);

        //getFirst and getLast
        System.out.println(link.getFirst());
        System.out.println(link.getLast());

        //peek
        System.out.println(link.peek());  //peek() method is used to get the first element of the list without removing it
        System.out.println(link);

        //poll
        System.out.println(link.poll());  //poll() method is used to get the first element of the list and remove it
        System.out.println(link);

        //offer
        link.offer(500);  //offer() method is used to add an element at the end of the list
        System.out.println(link);


        //Stack
        Stack<Integer> st=new Stack<Integer>();
        //push() method is used to add an element at the top of the stack
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);

        //pop() method is used to remove the top element of the stack
        st.pop();
        System.out.println(st);

        //peek() method is used to get the top element of the stack without removing it
        System.out.println(st.peek());

        //search() method is used to find the position of an element in the stack
        System.out.println(st.search(10));  //it will return the position of the element from the top of the stack. if the element is not present in the stack it will return -1

        //empty() method is used to check if the stack is empty or not
        System.out.println(st.empty());

        List<Integer> vec=new Vector<>();
        vec.add(2);
        vec.add(1);
        vec.add(2);
        System.out.println(vec);


    }
}
