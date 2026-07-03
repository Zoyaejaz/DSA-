public class Stackarray{
    private int[] arr;
    private int top;
    private int size;
    public Stackarray(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    public void push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top]=data;
        System.out.println("Element pushed: " + data);
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        int data=arr[top];
        top--;
        System.out.println("Element popped: " + data);
        return data;
    }
    public int peek(){
        if(top==-1){
            System.out.println("Stackis empty");
            return -1;
        }
        return arr[top];
    }
    public int size(){
        return top+1;
    }
    public static void main(String[] args){
        Stackarray stack=new Stackarray(5);
        stack.push(10);
        stack.push(2);
        stack.push(30);
        System.out.println("Top element: "+stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("Top element: "+stack.peek());
        System.out.println("Size of stack: "+stack.size());
    }
}
