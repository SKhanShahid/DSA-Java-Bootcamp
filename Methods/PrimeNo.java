import java.util.Scanner;
public class PrimeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println(num + (ans ? " is a prime number." : " is not a prime number."));
        sc.close();
    }
    static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
        // boolean isPrime = true;

        // if (num <= 1) {
        //     isPrime = false;
        // } else {
        //     for (int i = 2; i <= Math.sqrt(num); i++) {
        //         if (num % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        // }

        // if (isPrime) {
        //     System.out.println(num + " is a prime number.");
        // } else {
        //     System.out.println(num + " is not a prime number.");
        // }

        
    }
