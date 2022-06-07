package arrays_From_JavaTPoint;

public class RightRotateElement {
    static void rightRotateElement(int[] arr, int k){
        for(int i=0; i<k; i++){
            int j;
            int temp = arr[arr.length-1];
            for(j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
        printArray(arr);
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 9, 6, 4, 7};
        int k = 3;
        rightRotateElement(arr, k);
    }
}
