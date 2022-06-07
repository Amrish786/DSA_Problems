package arrays_From_JavaTPoint;

public class SecondLagestElement {
    static int secondLagestElement(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[n-2];
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 6, 4, 7};
        int n = arr.length;

        System.out.println(secondLagestElement(arr, n));
    }
}
