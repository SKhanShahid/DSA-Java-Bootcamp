//parameters 
import java.util.Scanner;
public class Sum2{
    public static void main(String[] args) {
        int ans = sum3(5, 10);
        int ans2 = sum3(20, 30);
        System.out.println("The sum of 5 and 10 is: " + ans);
        System.out.println("The sum of 20 and 30 is: " + ans2);
    }

    static int sum3(int a, int b) {
        // This method takes two integers as parameters and returns their sum.
        // It does not read input from the user.
        // The parameters a and b are used directly in the calculation.
        // Example: sum3(5, 10) will return 15.
        // This method does not use Scanner or any user input.
        
        return a + b;
    }
}