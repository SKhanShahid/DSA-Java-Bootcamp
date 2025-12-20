public class linearSearch{
    public static void main(String[] args) {
        int[] arr = {23,45,12,67,34,89};
        int target = 67;
        boolean ans = linearSearch3(arr, target);
        System.out.println(ans);
    }

    static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}