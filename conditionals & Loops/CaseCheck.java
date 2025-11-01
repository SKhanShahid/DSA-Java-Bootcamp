import java.util.Scanner;
public class CaseCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().trim().charAt(0);
        // if(ch >='a' && ch <='z'){
        //     System.out.println(ch + " is a lowercase letter.");
        // } else if(ch >='A' && ch <='Z'){
        //     System.out.println(ch + " is an uppercase letter.");
        // } else {
        //     System.out.println(ch + " is not an alphabetic letter.");
        // }
        if(Character.isLowerCase(ch)){
            System.out.println(ch + " is a lowercase letter.");
        } else if(Character.isUpperCase(ch)){
            System.out.println(ch + " is an uppercase letter.");
        } else {
            System.out.println(ch + " is not an alphabetic letter.");
        }
        sc.close();
        
    }
}