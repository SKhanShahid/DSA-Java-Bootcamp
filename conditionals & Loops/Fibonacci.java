import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a series of fibonacci: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        // System.out.print("Fibonacci series: " + a + " " + b);
        // for (int i = 2; i < n; i++) {
        //     int c = a + b;
        //     System.out.print(" " + c);
        //     a = b;
        //     b = c;
        // }
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.print(" " + b);
        sc.close();
    }
}