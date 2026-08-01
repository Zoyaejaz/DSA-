import java.util.Scanner;

public class decimal_to_bin_to_dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String bin=Integer.toBinaryString(n);
        StringBuilder s=new StringBuilder();
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='0'){
                s.append('1');
            }
            else{
                s.append('0');
            }
        }
        int ans=Integer.parseInt(s.toString(),2);
        System.out.println(ans);
        
    }
}
