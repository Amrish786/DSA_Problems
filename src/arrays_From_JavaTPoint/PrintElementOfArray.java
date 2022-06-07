package arrays_From_JavaTPoint;

public class PrintElementOfArray {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 5, 9, 2, 1, 0};
        printArray(arr);
    }
}
