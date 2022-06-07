package arrays_From_JavaTPoint;

public class SortArrayDescendingOrder {
    static void descendingOrder(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);

    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 9, 6, 4, 7};
        int n = arr.length;
        descendingOrder(arr, n);

    }
}