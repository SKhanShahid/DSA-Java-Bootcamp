import java.util.Arrays;

public class Main2{
    public static void main(String[] args) {
        String name = "sameer";
        char target = 'z';
        System.out.println(Arrays.toString(name.toCharArray()));
        boolean result = Search2(name,target);
        System.out.println(result);
    }
    static boolean Search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}