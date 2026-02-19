public class Checkarrsort {
    public static void main(String[] args) {
        //T.c==O(n), S.C==O(1)
            int[] arr = {1, 2, 3, 8, 5, 6, 7};
            if (arr == null || arr.length <= 1) {
                System.out.println("Array is sorted");
                return;
            }
            boolean sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                System.out.println("Array is sorted");
            } else {
                System.out.println("Array is not sorted");
            }
        
    }
}
