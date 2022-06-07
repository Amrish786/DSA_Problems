package arrays_From_JavaTPoint;

import java.sql.SQLOutput;

public class OddAndEvenNumber {
    static void evenNumber(int[] arr, int n){
        //even number
        for(int i=0; i<n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        // odd number
        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 9, 1, 6, 4, 7, 3, 3};
        int n = arr.length;
        evenNumber(arr, n);
    }
}
