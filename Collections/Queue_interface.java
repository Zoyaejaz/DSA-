import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue_interface {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        //To avoid confusion we can use offer() method instead of add() method because add() method throws exception if the queue is full but offer() method returns false if the queue is full.that's why to avoid exception handling we can use offer() method instead of add() method. 
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);

        //similarly to avoid exception handling, we are using peef() instead of element()
        System.out.println(q.peek()); //it will return the head of the queue but it will not remove the head of the queue
        System.out.println(q);

        //similarly to avoid exception handling, we are using poll() instead of remove()
        System.out.println(q.poll()); //it will return the head of the queue and it will remove the head of the queue
        System.out.println(q);


        //Arraydeque is a queue interface where we can pperform the insertion and deletion of an element from both the ends of the queue
        Deque<Integer> q1=new ArrayDeque<>();
        q1.offer(12);
        q1.offer(24);
        q1.offerFirst(5); //it will add the element at the first position of the queue
        q1.offerLast(30); //it will add the element at the last position of the queue
        System.out.println(q1);

        q1.pollLast(); //it will remove the last element of the queue
        System.out.println(q1);


        //Using stack with arraydeque
        Deque<Integer> st=new ArrayDeque<>();
        st.push(10); //it will add the element at the top of the stack
        st.push(20);    
        st.push(30);
        System.out.println(st);

        st.pop(); //it will remove the top element of the stack
        System.out.println(st);

        System.out.println(st.peek()); //it will return the top element of the stack but it will not remove the top element of the stack



        //PriorityQueue is a queue interface where the elements are ordered according to their natural ordering or by a Comparator provided at queue construction time.
        Queue<Integer> pq=new PriorityQueue<>();
        //Default behaviour -> Integers -> less value has higher priority
        //To get the maximum value as the highest priority we can use the following code
        //Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(30);
        pq.offer(20);
        System.out.println(pq);
        System.out.println(pq.poll()); //it will return the most priority element of the queue and it will remove the most priority element(i.e. less value) of the queue
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
