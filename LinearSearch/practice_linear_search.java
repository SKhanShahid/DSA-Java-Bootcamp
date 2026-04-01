public class practice_linear_search{
    public static void main(String[] args){
        int nums[] = {23,46,43,35,78,56,19,56};
        int target = 2;
        System.out.println(linearSearch(nums,target));
    }

        //search in the array, return the index if the item is found
        //otherwise if the item is not found,retuen -1
        static int linearSearch(int[] arr, int Target){
            if(arr.length==0){
                return -1;
            }
            //Run For Loop
            for(int index=0; index<arr.length; index++){
                //check for every element at every index
                int element = arr[index];
                if(element==Target){
                    return index;
                }
            }
            //this  line will execute, if none of the above return statements have executred
            //hence the target is not found
            return -1;
            
        }
    
}