package arrays_From_JavaTPoint;

public class SumOfArray {
    static int sumOfArray(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 9, 6, 4, 7};
        System.out.println(sumOfArray(arr));
    }
}
