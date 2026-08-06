package String;

public class sum_of_intsubstring {
    public static int sum(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub=str.substring(i, j);
                sum+=Integer.parseInt(sub);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(sum(str)); // Output: 164
    }
}
