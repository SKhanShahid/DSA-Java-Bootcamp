

public class Main{
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10,12,14,16,18,20};
        int target = 6;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        }
         static int linearSearch(int[] arr, int target){
            if(arr.length == 0){
                return -1;
            }
            for(int index = 0; index < arr.length; index++){
                int Element = arr[index];
                if(Element == target){
                    return Element;
                }
            }
            return -1;
        
    }
}