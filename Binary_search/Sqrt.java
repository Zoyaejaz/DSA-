package Binary_search;

public class Sqrt {

    //T.C =O(logn) S.C=O(1)
    public int mysqrt(int num){
        if (num == 0 || num == 1) return num;
        long low=1;
        long high=num;
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            long square=mid*mid;
            if(square==num){
               return (int) mid;
            }
            else if(square<num){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        Sqrt obj=new Sqrt();
        int num=28;
        int ans=obj.mysqrt(num);
        System.out.printf("Square root of a given number %d is: %d%n", num, ans);
        


    }
}
