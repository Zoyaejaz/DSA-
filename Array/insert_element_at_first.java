public class insert_element_at_first {
    public  int[] insertatbeg(int[] arr,int beg){
        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=beg;
        return arr;
    }
    public static void main(String[] args){
        int[] arr=new int[5];
        insert_element_at_first obj=new insert_element_at_first();
        int[] result=obj.insertatbeg(arr,10);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

}
