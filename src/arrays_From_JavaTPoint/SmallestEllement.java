package arrays_From_JavaTPoint;

public class SmallestEllement {
    static int smallElement(int[] arr){
        int smallElement = arr[0];
        for(int i=0; i<arr.length; i++){
            if(smallElement > arr[i]){
                smallElement = arr[i];
            }
        }
        return smallElement;
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 9, 6, 4, 7};
        System.out.println(smallElement(arr));
    }
}
