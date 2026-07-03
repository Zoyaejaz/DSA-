public class Missing_and_Repeating {
    //Brute force
    //Time complexity: O(n^2)
    //Space complexity: O(1)
    public int[] find(int[] arr,int n){
        int repeat=-1;
        int missing=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i+1){
                    count++;
                }
            }
            if(count==2) repeat=i+1;
            else if (count==0) missing=i+1;
        if(repeat!=-1 && missing!=-1) break;
        }
        return new int[]{repeat,missing};
    }
    //Better solution
    //Time complexity: O(2n)
    //Space complexity: O(n)
    public int[] find2(int[] arr,int n){
        int hash[]=new int[n+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        int repeat=-1;
        int missing=-1;
        for(int i=1;i<=n;i++){
            if(hash[i]==2) repeat=i;
            else if(hash[i]==0) missing=i;
            if(repeat!=-1 && missing!=-1) break;
        }
        return new int[]{repeat,missing};
    }
    //Optimal solution(using math)
    //Time complexity: O(n)
    //Space complexity: O(1)
    public int[] find3(int[] arr,int n){
        long sum=n*(n+1)/2;
        long sumsq=n*(n+1)*(2*n+1)/6;
        long s1=0;
        long s2=0;
        for(int i=0;i<n;i++){
            s1+=arr[i];
            s2+=arr[i]*arr[i];
        }
        long val1=s1-sum;
        long val2=s2-sumsq;
        long repeat=(val1+val2/val1)/2;
        long missing=repeat-val1;
        return new int[]{(int)repeat,(int)missing};

    }
    //optimal solution(using xor)
    //Time complexity: O(n)
    //Space complexity: O(1)
    public int[] find4(int[] arr,int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
        }
        for(int i=1;i<=n;i++){
            xor^=i;
        }
        int setbit=xor & -xor;
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if((arr[i] & setbit)==0){
                x^=arr[i];
            }else{
                y^=arr[i];
            }
        }
        for(int i=1;i<=n;i++){
            if((i & setbit)==0){
                x^=i;
            }else{
                y^=i;
            }
        }
        int repeat=-1;
        int missing=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x) repeat=x;
            else if(arr[i]==y) repeat=y;
        }
        if(repeat==x) missing=y;
        else missing=x;
        return new int[]{repeat,missing};
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,5,3};
        int n=5;
        int result[]=new Missing_and_Repeating().find4(arr,n);
        System.out.println("Repeating: "+result[0]);
        System.out.println("Missing: "+result[1]);
    }
}
