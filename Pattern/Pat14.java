package Pattern;
import java.util.*;

public class Pat14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Character c='A';
        for(int i=1;i<n;i++){
            c='A';
            for(int j=1;j<i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
