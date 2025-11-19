package Arrays;
public class MaxRange{
    public static void main(String[] args){
        int[] arr = {3,5,7,2,8,6};
        System.out.println(maxRange(arr,1,4));
        
    }
    static int maxRange(int[] arr, int start, int end){
         int maxVal = arr[start];
         for(int i = start; i <= end; i++){
             
            maxVal = arr[i];
             
         }
         
       return maxVal;
    }
    
}