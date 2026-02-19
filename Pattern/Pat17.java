package Pattern;
import java.util.*;

public class Pat17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Character ch='A';
        for(int i=1;i<n;i++){
            ch='A';
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
