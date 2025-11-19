
import java.util.ArrayList;
import java.util.Scanner;;
public class MultiAL{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        /* 
        // Adding inner ArrayLists
        for (int i = 0; i < 3; i++) {
            multiList.add(new ArrayList<>());
        }

        // Populating inner ArrayLists
        for (int i = 0; i < multiList.size(); i++) {
            for (int j = 0; j < 5; j++) {
                multiList.get(i).add(i + j);
            }
        }

        // Displaying the multi-dimensional ArrayList
        for (int i = 0; i < multiList.size(); i++) {
            System.out.println("Inner ArrayList " + i + ": " + multiList.get(i));
        }
        */
       //Initialization in one line
       for(int i=0; i<3; i++){
        multiList.add(new ArrayList<>());
       }
       for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            multiList.get(i).add(in.nextInt());
        }
       }
       System.out.println(multiList);
       in.close();

    }
}