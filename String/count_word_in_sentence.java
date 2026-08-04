package String;

public class count_word_in_sentence {
    public static void main(String[] args){
        String s="hello world, Welcome here";
        s = s.trim(); 
        s=s.replaceAll("\\s+"," ");
        String[] arr=s.split(" ");
        System.out.println("Number of words in the sentence: " + arr.length);
    }
}
