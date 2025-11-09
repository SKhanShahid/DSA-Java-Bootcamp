import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(num + (ans ? " is an Armstrong number." : " is not an Armstrong number."));
        sc.close();
    }
    
    static boolean isArmstrong(int n) {
        int originalNumber = n;
        int digits = countDigits(n);  // Count the digits
        int sum = 0;
        
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, digits);  // ← USE digits here!
            n /= 10;
        }
        
        return sum == originalNumber;
    }
    
    // Helper method to count digits
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}




//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         int originalNumber = number;
//         int sum = 0;
//         int digits = String.valueOf(number).length();

//         while (number != 0) {
//             int digit = number % 10;
//             sum += Math.pow(digit, digits);
//             number /= 10;
//         }

//         if (sum == originalNumber) {
//             System.out.println(originalNumber + " is an Armstrong number.");
//         } else {
//             System.out.println(originalNumber + " is not an Armstrong number.");
//         }
        
//         scanner.close();
//     }
// }