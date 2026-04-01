public class Main1{
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,88,55};
        int target = 4;
        System.out.print(LinearSearch2(nums,target));
    }

    static int LinearSearch2(int arr[], int target){
        if(arr.length==0){
            return -1;
        }
        //Run Enhanced for-Loop
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }
}