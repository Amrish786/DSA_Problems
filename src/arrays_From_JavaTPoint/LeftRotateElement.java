package arrays_From_JavaTPoint;

import java.util.Arrays;

public class LeftRotateElement {
    static void leftRotate(int[] arr, int k){
        for(int i=0; i < k; i++){
            int j=0;
            int temp = arr[0];
            for(j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }
        printArray(arr);
    }
    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = { 1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        leftRotate(arr, k);
    }
}
