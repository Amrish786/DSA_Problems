package arrays_From_JavaTPoint;
import java.sql.SQLOutput;
import java.util.*;

public class SecondSmallestElement {
    static void secondSmallestElement(int[] arr){
        Arrays.sort(arr);
        System.out.println("Second smallest element : "+arr[1]);
        System.out.println("smallest element : "+arr[0]);
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 9, 6, 4, 7};

        secondSmallestElement(arr);
    }
}
