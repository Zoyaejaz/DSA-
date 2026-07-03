public class Maxproductsubarray {
    public static void main(String[] args){
        int[] arr={2,3,4,-1,0,-2,3,1,4,0,4,6,-1,4};
        int n=arr.length;

        //Brute force approach
        //Time complexity: O(n^3), Space complexity: O(1)
        int maxim=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int product=1;
                for(int k=i;k<j;k++){
                    product=product*arr[k];
                }
                maxim=Math.max(maxim,product);
            }
        }
        System.out.println(maxim);

        //Better approach
        //Time complexity: O(n^2), Space complexity: O(1)
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int pro=1;
            for(int j=i;j<n;j++){
                pro=pro*arr[j];
                max=Math.max(pro,max);
            }
        }
        System.out.println(max);

        //Optimal approach
        //Time complexity: O(n), Space complexity: O(1)
        int prefix=1;
        int suffix=1;
        int maxy=1;
        for(int i=0;i<n;i++){
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-1-i];
            maxy=Math.max(maxy,Math.max(prefix,suffix));
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
        }
        System.out.println(maxy);
    }
}
