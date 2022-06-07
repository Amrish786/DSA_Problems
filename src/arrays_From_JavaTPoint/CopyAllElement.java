package arrays_From_JavaTPoint;

import java.util.Arrays;

public class CopyAllElement {
    static void copyElement(int[] arr){
        int[] ans = Arrays.copyOfRange(arr, 0, arr.length-1);
        printArray(ans);
    }
    static void printArray(int[] ans){
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        copyElement(arr);//calling method
    }
}
