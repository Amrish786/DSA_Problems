package arrays_From_JavaTPoint;

public class ElementInReverseOrder {
    static void printReverse(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8 ,9};
        printReverse(arr);
    }
}
