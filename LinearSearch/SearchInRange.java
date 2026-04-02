public class SearchInRange{
    public static void main(String[] args) {
        int[] nums = {18,12,-7,3,14,28};
        int target = 1;
        System.out.println(linearSearch(nums,target,0,5));
    }
    static int linearSearch(int arr[], int target, int start, int end ){
        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            int element =arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}