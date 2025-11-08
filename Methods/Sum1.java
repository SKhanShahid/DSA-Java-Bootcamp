import java.util.Scanner;
public class Sum1{
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println("The sum of the first 100 integers is: " + ans);
        
    }
    //returns the sum of the first 100 integers
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        sc.close();
        return a + b;
    }
}