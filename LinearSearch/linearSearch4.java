public class linearSearch4{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 45;
        System.out.println(linearSearch(nums,target));


    }
    static boolean linearSearch(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}