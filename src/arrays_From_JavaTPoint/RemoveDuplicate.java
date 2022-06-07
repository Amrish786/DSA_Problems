package arrays_From_JavaTPoint;

import java.util.Arrays;

public class RemoveDuplicate {
    static int removeDuplicate(int[] arr, int n){
        Arrays.sort(arr);
       int[] temp = new int[n];
       int j=0;
       for(int i=0; i<n-1; i++){
           if(arr[i] != arr[i+1]){
               temp[j++] = arr[i];
           }
       }
        temp[j++] = arr[n-1];
       for(int i=0; i< temp.length; i++){
           arr[i] = temp[i];
       }

        return j;
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 9, 1, 6, 4, 7, 3, 3};
        int n = arr.length;
        n = removeDuplicate(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
