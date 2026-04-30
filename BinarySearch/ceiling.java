public class ceiling{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,20};
        int target = 15;
        int ans = CeilinglinearSearch(arr, target);
        System.out.println(ans);
        }
         static int CeilinglinearSearch(int[] arr, int target){
            if(arr.length == 0){
                return -1;
            }
            for(int index = 0; index < arr.length; index++){
                if(arr[index] >= target){
                    return arr[index];
                }
            }
            return -1;
        
    }
}