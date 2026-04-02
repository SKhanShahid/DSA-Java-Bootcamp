public class FindMin{
    public static void main(String[] args) {
        int[] arr = {18,12,95,3,14,28};
        System.out.println(Min(arr));
    }
    //assume arr.length!=0 i.e the array is not empty
    //return the minimum value in the array
    static int Min(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}