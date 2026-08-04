package String;

public class count_length_withoutlength {
    public static void main(String[] args){
        String s="Hello";
        int count=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            count++;
        }
        System.out.println("The count of the string is: "+count);
    }
    
}
