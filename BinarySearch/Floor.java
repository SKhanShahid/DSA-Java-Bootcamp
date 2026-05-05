public class Floor{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,20};
        int target = 15;
        int ans = FloorBinarySearch(arr, target);
        System.out.println(ans);
        }
        //return the index which is greatest number <= target
         static int FloorBinarySearch(int[] arr, int target){
            if(arr.length == 0){
                return -1;
            }
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target==arr[mid]){
                    return mid;
                }
                else if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return end;
           
        
    }
}