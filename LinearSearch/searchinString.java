public class searchinString{
    public static void main(String[] args) {
        String name = "shahid";
        char target = 'z';
        System.out.println(Search(name,target));

    }
    static boolean Search(String str, char Target){
        if(str.length()==0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(Target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}