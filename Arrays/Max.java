package Arrays;

public class Max{
    public static void main(String[] args){
        int[] arr = {3,5,7,2,8,6};
        // int max = Arrays.stream(arr).max().getAsInt();
        // System.out.println("The maximum value in the array is: " + max);
        System.out.println("The maximum value in the array is: " + max(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}