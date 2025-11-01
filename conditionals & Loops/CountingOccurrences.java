import java.util.Scanner;
public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the digit to count: ");
        int digit = sc.nextInt();
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if(rem == digit) {
                count++;
            }
            num /= 10;
        }

        System.out.println("Number of occurrences of " + digit + ": " + count);
        sc.close();
    }
}