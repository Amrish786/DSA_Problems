package arrays_From_JavaTPoint;

public class LagestElement {
    static int lagestElement(int[] arr, int n){
        int larg = arr[0];
        int largeElement = 0;
        for(int i=1; i<n; i++){
            if(larg<arr[i]){
                larg = arr[i];
            }
        }

        return larg;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 6, 4, 7};
        int n = arr.length;

        System.out.println(lagestElement(arr, n));
    }
}
