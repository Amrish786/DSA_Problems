package arrays_From_JavaTPoint;

public class FindFrequencyOfEachElement {
    static void findFrequency(int[] arr){
        int[] frequency = new int[arr.length];
        int visited=-1;
        for(int i=0; i< arr.length; i++){
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    frequency[j] = visited;
                }
            }
            if(frequency[i] != visited){
                frequency[i] = count;
            }
        }
        for(int i=0; i < frequency.length; i++){
            if(frequency[i] != visited){
                System.out.println(arr[i]+" | "+frequency[i]);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 8, 2, 3, 2, 2, 6};
        findFrequency(arr);
    }
}
