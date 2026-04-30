public class ceiling1{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,20};
        int target = 4;
        int ans = CeilingBinarySearch(arr, target);
        System.out.println(ans);
        }
         static int CeilingBinarySearch(int[] arr, int target){
            if(arr.length == 0){
                return -1;
            }
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target==arr[mid]){
                    return arr[mid];
                }
                else if(target<arr[mid]){d,
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            return arr[start];
           
        
    }
}