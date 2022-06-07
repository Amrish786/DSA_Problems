package arrays_From_JavaTPoint;

import java.util.*;

public class MaxElement {
    //approach 1 using for loop
    static int max(int[] arr){ //time and space complexity is O(n) O(1)
        int maxElement = arr[0];
        for(int i=1; i<arr.length; i++){
            if(maxElement < arr[i]){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    //approach 2 using Arrays.sort()
    static int max2(int[] arr){ //time and space complexity is O(nlogn) O(1)
       Arrays.sort(arr);//sort array int ascending order

        return arr[arr.length-1];//last element of array will be max
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 9, 6, 4, 7, 0};
        System.out.println( max(arr));
        System.out.println(max2(arr));
    }
}
